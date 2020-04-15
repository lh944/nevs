package com.xm.nevs.controller;


import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.SecureUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageInfo;
import com.xm.nevs.entity.Persons;
import com.xm.nevs.service.impl.PersonsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author liuhao
 * @since 2020-04-06
 */
@Controller
@RequestMapping("/nevs")
public class PageController {
    @Autowired
    PersonsServiceImpl personsService;



    /* *
     * @Author liuhao
     * @Description //登陆页面
     * @Date 22:08 2020-04-08
     * @Param []
     * @return java.lang.String
     **/
    @GetMapping("tologin")
    public String tologin(){
        return "login";
    }
    /* *
     * @Author liuhao
     * @Description //首页
     * @Date 22:09 2020-04-08
     * @Param []
     * @return java.lang.String
     **/
    @GetMapping("toindex")
    public String toindex(){
        return "index";
    }
    /* *
     * @Author liuhao
     * @Description //用户管理
     * @Date 22:09 2020-04-08
     * @Param []
     * @return java.lang.String
     **/
    @GetMapping("member-list.html")
    public String tomemberlist(){
        return "member-list";
    }
    //店长列表
    @GetMapping("member-list1.html")
    public String tomemberlist1(){
        return "member-list1";
    }

    //个人信息页面
    @GetMapping("personal-info.html")
    public String topersonalinfo(){
        return "personal-info";
    }

    //审批详情页面
    @GetMapping("shopshistory-info.html")
    public String shopshistoryinfo(){
        return "shopshistory-info";
    }

    //电站列表
    @GetMapping("shops-list.html")
    public String shopslist(){
        return "shops-list";
    }

  /* *
     * @Author liuhao
     * @Description //跳转添加人员页面
     * @Date 20:43 2020-04-09
     * @Param []
     * @return java.lang.String
     **/
    @GetMapping("member-add.html")
    public String tomemberadd(){
        return "member-add";
    }
    //修改
    @GetMapping("member-edit.html")
    public String memberedit(String pid,Model model){
        Persons persion = personsService.getOne(new QueryWrapper<Persons>().eq("pid",pid));
        model.addAttribute("persion",persion);
        return "member-edit";
    }
    //全部审核列表
    @GetMapping("audit-list.html")
    public String auditlist(){
        return "audit-list";
    }



    /* *
     * @Author liuhao
     * @Description //验证用户名和密码是否正确
     * @Date 22:32 2020-04-07
     * @Param [account, password] 账号密码
     * @return java.lang.String
     **/
    @PostMapping("/login")
    @ResponseBody
    public Map<String,String> login(HttpSession session , @RequestBody Persons p){
        //判断用户账号和用户密码是否为空，如果是空的话就会返回tree
        boolean isnull = StrUtil.hasEmpty(p.getAccount(), p.getPassword());
        Map<String,String> map = new HashMap<>();
        map.put("code","500");
        map.put("msg","用户名或密码验证失败");
        if(!isnull) {
            //根据账号和密码查询
            Persons person = personsService.getOne(new QueryWrapper<Persons>().eq("account", p.getAccount())
                    .eq("password", SecureUtil.md5(p.getPassword())));
            if (person == null){
                return map;
            }
            session.setAttribute("USERS",person);
            map.put("code","200");
            map.put("msg","登陆成功");
        }
        return map;
    }

}
