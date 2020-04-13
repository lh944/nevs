package com.xm.nevs.entity;


import java.util.Date;

/* *
 * @Author liuhao
 * @Description //TODO
 * @Date 15:38 2020-04-06
 * @Param 数字字典
 * @return
 **/
public class TDirectory {

  private String did; //编号
  private Date creationdate; //创建时间
  private String creator; //创建人
  private String dname; //字典名称
  private String dvalue; //字典值
  private String modifiedby; //最后修改人
  private Date modificationtime; //最后修改时间
  private String isdelete; //是否删除
  private String previousmenu; //是否上级菜单
  private String pname; //上级菜单名称
  private String pid; //上级菜单编号


  public String getDid() {
    return did;
  }

  public void setDid(String did) {
    this.did = did;
  }

  public Date getCreationdate() {
    return creationdate;
  }

  public void setCreationdate(Date creationdate) {
    this.creationdate = creationdate;
  }

  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }

  public String getDname() {
    return dname;
  }

  public void setDname(String dname) {
    this.dname = dname;
  }

  public String getDvalue() {
    return dvalue;
  }

  public void setDvalue(String dvalue) {
    this.dvalue = dvalue;
  }

  public String getModifiedby() {
    return modifiedby;
  }

  public void setModifiedby(String modifiedby) {
    this.modifiedby = modifiedby;
  }

  public Date getModificationtime() {
    return modificationtime;
  }

  public void setModificationtime(Date modificationtime) {
    this.modificationtime = modificationtime;
  }

  public String getIsdelete() {
    return isdelete;
  }

  public void setIsdelete(String isdelete) {
    this.isdelete = isdelete;
  }

  public String getPreviousmenu() {
    return previousmenu;
  }

  public void setPreviousmenu(String previousmenu) {
    this.previousmenu = previousmenu;
  }

  public String getPname() {
    return pname;
  }

  public void setPname(String pname) {
    this.pname = pname;
  }

  public String getPid() {
    return pid;
  }

  public void setPid(String pid) {
    this.pid = pid;
  }
}
