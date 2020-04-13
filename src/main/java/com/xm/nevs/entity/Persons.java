package com.xm.nevs.entity;


import com.baomidou.mybatisplus.annotation.TableId;

import java.util.Date;

/* *
 * @Author liuhao
 * @Description //TODO
 * @Date 15:38 2020-04-06
 * @Param 人员信息
 * @return
 **/
public class Persons {
  @TableId
  private String pid; //编号
  private String pname; //昵称
  private String sex; //性别
  private String account; //账号
  private String password; //密码
  private String phone; //电话
  private String idcard; //身份证号码
  private String pstatus; //人员状态
  private String ptype; //身份类型（0 管理员，1 店主 2 用户）
  private String address; // 地址
  private Date modificationtime; //最后修改时间
  private String modifiedby; //最后修改人
  private Date createdate; // 创建时间
  private String isdelete; //是否删除

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPid() {
    return pid;
  }

  public void setPid(String pid) {
    this.pid = pid;
  }

  public String getPname() {
    return pname;
  }

  public void setPname(String pname) {
    this.pname = pname;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getIdcard() {
    return idcard;
  }

  public void setIdcard(String idcard) {
    this.idcard = idcard;
  }

  public String getPstatus() {
    return pstatus;
  }

  public void setPstatus(String pstatus) {
    this.pstatus = pstatus;
  }

  public String getPtype() {
    return ptype;
  }

  public void setPtype(String ptype) {
    this.ptype = ptype;
  }

  public Date getModificationtime() {
    return modificationtime;
  }

  public void setModificationtime(Date modificationtime) {
    this.modificationtime = modificationtime;
  }

  public String getModifiedby() {
    return modifiedby;
  }

  public void setModifiedby(String modifiedby) {
    this.modifiedby = modifiedby;
  }

  public Date getCreatedate() {
    return createdate;
  }

  public void setCreatedate(Date createdate) {
    this.createdate = createdate;
  }

  public String getIsdelete() {
    return isdelete;
  }

  public void setIsdelete(String isdelete) {
    this.isdelete = isdelete;
  }
}
