package com.xm.nevs.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xm.nevs.entity.TShops;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author liuhao
 * @since 2020-04-06
 */
public interface TShopsMapper extends BaseMapper<TShops> {

    List<TShops> selectall(String sname,String pname,String pid);
}
