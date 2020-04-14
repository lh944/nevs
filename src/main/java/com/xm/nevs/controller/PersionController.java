/**
 * 文件名:PersionController
 * 作者:liuhao
 * 时间:2020-04-09 20:41
 * 描述:
 */

package com.xm.nevs.controller;

import cn.hutool.core.util.IdUtil;
import cn.hutool.crypto.SecureUtil;
import com.github.pagehelper.PageInfo;
import com.xm.nevs.entity.Persons;
import com.xm.nevs.service.impl.PersonsServiceImpl;
import com.xm.nevs.util.Jsionstr;
import com.xm.nevs.util.ResultVOUtil;
import com.xm.nevs.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Date;

@RestController
@RequestMapping("/nevs/persion")
public class PersionController {

    @Autowired
    PersonsServiceImpl personsService;

    @PostMapping("add")
    public Jsionstr addPersion(HttpSession session,@RequestBody Persons person){
        Persons users = (Persons) session.getAttribute("USERS");
        person.setPid(IdUtil.simpleUUID());
        person.setPassword(SecureUtil.md5(person.getPassword()));
        person.setModificationtime(new Date());
        person.setCreatedate(new Date());
        person.setIsdelete("N");
        person.setModifiedby(users.getPid());
        person.setPtype("2");
        person.setPstatus("1");
        personsService.save(person);

        return Jsionstr.createJsionstr("200","添加成功");
    }
    @GetMapping("list")
    public PageInfo<Persons> listPersion( String pageNum,String pageSize,String account,String pname,String phone){
        Persons p = new Persons();
        p.setAccount(account);
        p.setPname(pname);
        p.setPhone(phone);
        return personsService.pageInfo(1, 5, p);
    }

    @GetMapping("get")
    public ResultVO<Persons> getone(String pid){
        Persons person = personsService.getById(pid);

        return ResultVOUtil.success(person);
    }

    @PostMapping("update")
    public Jsionstr updatePersion(HttpSession session,@RequestBody Persons person){

        Persons users = (Persons) session.getAttribute("USERS");
        person.setPassword(SecureUtil.md5(person.getPassword()));
        person.setModificationtime(new Date());
        person.setIsdelete("N");
        person.setModifiedby(users.getPid());
        person.setPtype("2");
        person.setPstatus("1");
        personsService.updateById(person);
        return Jsionstr.createJsionstr("200","修改成功");
    }

    @PostMapping("updateinfo")
    public Jsionstr updateinfo(HttpSession session,@RequestBody Persons person){

        Persons users = (Persons) session.getAttribute("USERS");
        person.setModificationtime(new Date());
        person.setIsdelete("N");
        person.setModifiedby(users.getPid());
        personsService.updateById(person);
        return Jsionstr.createJsionstr("200","修改成功");
    }
    @PostMapping("updatepassword")
    public Jsionstr updatepassword(HttpSession session,@RequestBody Persons person){
        //修改密码
        Persons users = (Persons) session.getAttribute("USERS");
        person.setPassword(SecureUtil.md5(person.getPassword()));
        person.setModificationtime(new Date());
        person.setIsdelete("N");
        person.setModifiedby(users.getPid());
        personsService.updateById(person);
        return Jsionstr.createJsionstr("200","修改成功");
    }

    @GetMapping("verifypassword")
    public Jsionstr verifypassword(HttpSession session,String password){
        Persons users = (Persons) session.getAttribute("USERS");
        //验证密码
        if (users.getPassword().equals(SecureUtil.md5(password))){
            return Jsionstr.createJsionstr("200","成功");
        }
        return Jsionstr.createJsionstr("500","失败");

    }

    @GetMapping("updateStatus")
    public ResultVO updateStatus(String pid,String status){
        Persons p = new Persons();
        p.setPid(pid);
        if ("1".equals(status))
        p.setPstatus("2");
        if ("2".equals(status))
            p.setPstatus("1");

        personsService.updateById(p);
        return ResultVOUtil.success();
    }

    @GetMapping("getinfo")
    public Persons getinfo(HttpSession session){
        Persons users = (Persons) session.getAttribute("USERS");
        return users;
    }

    @GetMapping("delete")
    public Jsionstr deletePersion(String pid){

        personsService.removeById(pid);
        return Jsionstr.createJsionstr("200","删除成功");
    }





}
