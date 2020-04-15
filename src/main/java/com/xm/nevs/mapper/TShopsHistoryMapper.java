package com.xm.nevs.mapper;

import com.xm.nevs.entity.TShopsHistory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.Pattern;
import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author liuhao
 * @since 2020-04-13
 */

@Mapper
@Repository
public interface TShopsHistoryMapper extends BaseMapper<TShopsHistory> {
    @Select("SELECT sid, pname AS pid,sname,place,createtime, CASE isvia WHEN '1' THEN '审核通过' WHEN '2' THEN '审核拒绝' WHEN '3' THEN '待审核' END AS isvia,auxiliarytype,remark FROM t_shops_history INNER JOIN persons ON persons.pid=t_shops_history.pid ORDER BY createtime DESC")
    List<TShopsHistory> selectall();

    List<TShopsHistory> selectall1(@Param("pid") String pid);

    TShopsHistory getonebyid(@Param("sid") String sid);
}
