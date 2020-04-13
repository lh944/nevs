package com.xm.nevs.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;

public interface BaseService<T>  extends IService<T> {
    public PageInfo<T> pageInfo(Integer pageNum, Integer pageSize);
}
