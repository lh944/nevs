package com.xm.nevs.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xm.nevs.entity.TShops;
import com.xm.nevs.mapper.TShopsMapper;
import com.xm.nevs.service.ITShopsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liuhao
 * @since 2020-04-06
 */
@Service
public class TShopsServiceImpl extends BaseServiceImpl<TShopsMapper, TShops> implements ITShopsService {
    @Autowired
    private TShopsMapper shopsMapper;

    public PageInfo<TShops> selectall(Integer pageNum,Integer pageSize,String sname,String pname,String pid){
        PageHelper.startPage(pageNum,pageSize);
        return new PageInfo<>(shopsMapper.selectall(sname,pname,pid));
    }
}
