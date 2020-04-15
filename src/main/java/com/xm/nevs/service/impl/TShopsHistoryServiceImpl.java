package com.xm.nevs.service.impl;

import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.StrUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xm.nevs.entity.Persons;
import com.xm.nevs.entity.TShops;
import com.xm.nevs.entity.TShopsHistory;
import com.xm.nevs.mapper.TShopsHistoryMapper;
import com.xm.nevs.service.ITShopsHistoryService;
import com.xm.nevs.service.impl.BaseServiceImpl;
import com.xm.nevs.util.ResultVOUtil;
import com.xm.nevs.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liuhao
 * @since 2020-04-13
 */
@Service
public class TShopsHistoryServiceImpl extends BaseServiceImpl<TShopsHistoryMapper, TShopsHistory> implements ITShopsHistoryService {

    @Autowired
    TShopsHistoryMapper shopsHistoryMapper;
    @Autowired
    TShopsServiceImpl shopsService;
    @Autowired
    PersonsServiceImpl personsService;

    public PageInfo<TShopsHistory> pageInfo1(Integer pageNum, Integer pageSize,String pid) {
        PageHelper.startPage(pageNum,pageSize);
        if (StrUtil.hasEmpty(pid))
        return new PageInfo<TShopsHistory>(shopsHistoryMapper.selectall());
        return new PageInfo<TShopsHistory>(shopsHistoryMapper.selectall1(pid));
    }

    @Transactional(propagation= Propagation.NESTED,isolation= Isolation.DEFAULT,readOnly = false)
    public ResultVO approve(TShopsHistory shopsHistory, HttpSession session){
        TShops shops = new TShops();
        shops.setSid(IdUtil.simpleUUID());
        shops.setPid(shopsHistory.getPid());
        shops.setSname(shopsHistory.getSname());
        shops.setEntertime(new Date());
        shops.setPlace(shopsHistory.getPlace());
        shops.setAuxiliarytype(shopsHistory.getAuxiliarytype());
        shops.setOperatingstatus("2");//新开的店铺开始是停业状态
        Persons users = (Persons) session.getAttribute("USERS");
        shops.setModifiedby(users.getPid());
        shops.setModificationtime(new Date());
        shops.setIsdelete("N");
        shops.setRemark(shopsHistory.getRemark());
        this.updateById(shopsHistory);

        TShops byId = shopsService.getById(shops.getPid());
        if (byId!=null){
            shopsService.updateById(shops);
        }else{
            shopsService.save(shops);
        }


        Persons persons = personsService.getById(shopsHistory.getPid());
        persons.setPtype("1");//设置身份为店长
        personsService.updateById(persons);
        return ResultVOUtil.success();
    }

    public TShopsHistory getonebyid(String sid){
        return shopsHistoryMapper.getonebyid(sid);
    }

}
