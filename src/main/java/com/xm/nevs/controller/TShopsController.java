package com.xm.nevs.controller;


import cn.hutool.core.util.IdUtil;
import com.github.pagehelper.PageInfo;
import com.sun.net.httpserver.HttpsServer;
import com.xm.nevs.entity.Persons;
import com.xm.nevs.entity.TShops;
import com.xm.nevs.service.impl.TShopsServiceImpl;
import com.xm.nevs.util.ResultVOUtil;
import com.xm.nevs.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author liuhao
 * @since 2020-04-06
 */
@RestController
@RequestMapping("/nevs/shops")
public class TShopsController {
    @Autowired
    TShopsServiceImpl shopsService;

    //添加电站信息
    @PostMapping("add")
    public ResultVO addshops(HttpSession session, TShops shops){
        Persons users = (Persons) session.getAttribute("USERS");
        shops.setSid(IdUtil.simpleUUID());
        shops.setPid(users.getPid());
        shops.setEntertime(new Date());
        shopsService.save(shops);
        return ResultVOUtil.success();
    }
    //返回电站列表
    @GetMapping("list")
    public PageInfo<TShops> queryall(Integer pageNum,Integer pageSize,String sname,String pname,String pid){
        return shopsService.selectall(pageNum,pageSize,sname,pname,pid);
    }




}
