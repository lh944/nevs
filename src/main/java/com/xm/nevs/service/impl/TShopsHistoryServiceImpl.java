package com.xm.nevs.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xm.nevs.entity.TShopsHistory;
import com.xm.nevs.mapper.TShopsHistoryMapper;
import com.xm.nevs.service.ITShopsHistoryService;
import com.xm.nevs.service.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public PageInfo<TShopsHistory> pageInfo1(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);

        return new PageInfo<TShopsHistory>(shopsHistoryMapper.selectall());
    }
}
