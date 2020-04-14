/**
 * 文件名:BaseServiceImpl
 * 作者:liuhao
 * 时间:2019-03-12 21:10
 * 描述:
 */

package com.xm.nevs.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xm.nevs.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseServiceImpl<M extends BaseMapper<T>, T> extends ServiceImpl<M,T> implements BaseService<T> {
    @Autowired
    protected M baseMapper;

    public PageInfo<T> pageInfo(Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        return new PageInfo<T>(baseMapper.selectList(null));
    }
}
