package com.xm.nevs.service.impl;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xm.nevs.entity.Persons;
import com.xm.nevs.mapper.PersonsMapper;
import com.xm.nevs.service.IPersonsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Struct;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liuhao
 * @since 2020-04-06
 */
@Service
public class PersonsServiceImpl extends BaseServiceImpl<PersonsMapper, Persons> implements IPersonsService {



    public PageInfo<Persons> pageInfo(Integer pageNum, Integer pageSize,Persons person) {

        if(StrUtil.hasEmpty(person.getIsdelete()) ||StrUtil.hasEmpty(person.getPtype())){

            person.setIsdelete("N");
            person.setPtype("2");
        }
        PageHelper.startPage(pageNum,pageSize);
        return new PageInfo<Persons>(this.list(new QueryWrapper<Persons>()
                .like(!StrUtil.hasEmpty(person.getAccount())
                        ,"account",person.getAccount())
                .like(!StrUtil.hasEmpty(person.getPhone()),
                        "phone",person.getPhone())
                .like(!StrUtil.hasEmpty(person.getPname()),
                        "pname",person.getPname())
                .eq("ptype",person.getPtype())
                .eq("isdelete",person.getIsdelete())
                .orderByDesc("modifiedby")));
    }
}
