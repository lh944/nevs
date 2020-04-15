package com.xm.nevs.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xm.nevs.entity.TShops;
import org.apache.ibatis.annotations.Param;

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

    List<TShops> selectall(@Param("sname") String sname,@Param("pname") String pname,@Param("pid") String pid);

    List<TShops> getonebyid(@Param("sid") String sid);
}
