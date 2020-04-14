package com.xm.nevs.controller;


import cn.hutool.core.util.IdUtil;
import com.github.pagehelper.PageInfo;
import com.xm.nevs.entity.Persons;
import com.xm.nevs.entity.TShopsHistory;
import com.xm.nevs.service.impl.TShopsHistoryServiceImpl;
import com.xm.nevs.util.ResultVOUtil;
import com.xm.nevs.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author liuhao
 * @since 2020-04-13
 */
@RestController
@RequestMapping("/nevs/shopsh")
public class TShopsHistoryController {
    @Autowired
    TShopsHistoryServiceImpl shopsHistoryService;

    @PostMapping("add")
    public ResultVO addshop(HttpSession session, @RequestBody TShopsHistory shopsHistory){
        Persons users = (Persons) session.getAttribute("USERS");
        shopsHistory.setSid(IdUtil.simpleUUID());
        shopsHistory.setPid(users.getPid());
        shopsHistory.setCreatetime(new Date());
        shopsHistoryService.save(shopsHistory);
        return ResultVOUtil.success();
    }



    @GetMapping("list")
    public PageInfo<TShopsHistory> listall(Integer pageNum, Integer pageSize){
        return shopsHistoryService.pageInfo1(pageNum,pageSize);
    }

    @GetMapping("getonebyid")
    public ResultVO getonebyid(String shid){
        return ResultVOUtil.success(shopsHistoryService.getonebyid(shid));
    }

    @GetMapping("approve")
    public ResultVO approve(HttpSession session,String shid,String opinion){
        //审核通过方法
        TShopsHistory shopsHistory = shopsHistoryService.getById(shid);
        shopsHistory.setOpinion(opinion);
        shopsHistory.setIsvia("1");
        return shopsHistoryService.approve(shopsHistory,session);
    }

    @GetMapping("deniedshops")
    public ResultVO deniedshops(String shid,String opinion){
        //审核拒绝
        TShopsHistory shopsHistory = shopsHistoryService.getById(shid);
        shopsHistory.setIsvia("2");//审核拒绝标识
        shopsHistory.setOpinion(opinion);
        shopsHistoryService.updateById(shopsHistory);
        return ResultVOUtil.success();
    }


}
