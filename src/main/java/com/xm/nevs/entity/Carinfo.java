package com.xm.nevs.entity;


import java.util.Date;

/* *
 * @Author liuhao
 * @Description //TODO
 * @Date 15:34 2020-04-06
 * @Param  汽车信息
 * @return
 **/
public class Carinfo {

  private String cid; //编号
  private String pid; //人员编号
  private String ctype; //车辆类型
  private String cname; //车牌名
  private String platenumbers; //车牌号码
  private Date expiringdate; //生产年月
  private String endurancemileage; //续航里数
  private String cstatus; //车辆状态
  private Date modificationtime; //最后修改时间
  private String modifiedby; //最后修改人
  private long electricquantity; //电量
  private String isdelete; //是否删除


  public String getCid() {
    return cid;
  }

  public void setCid(String cid) {
    this.cid = cid;
  }

  public String getPid() {
    return pid;
  }

  public void setPid(String pid) {
    this.pid = pid;
  }

  public String getCtype() {
    return ctype;
  }

  public void setCtype(String ctype) {
    this.ctype = ctype;
  }

  public String getCname() {
    return cname;
  }

  public void setCname(String cname) {
    this.cname = cname;
  }

  public String getPlatenumbers() {
    return platenumbers;
  }

  public void setPlatenumbers(String platenumbers) {
    this.platenumbers = platenumbers;
  }

  public Date getExpiringdate() {
    return expiringdate;
  }

  public void setExpiringdate(Date expiringdate) {
    this.expiringdate = expiringdate;
  }

  public String getEndurancemileage() {
    return endurancemileage;
  }

  public void setEndurancemileage(String endurancemileage) {
    this.endurancemileage = endurancemileage;
  }

  public String getCstatus() {
    return cstatus;
  }

  public void setCstatus(String cstatus) {
    this.cstatus = cstatus;
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

  public long getElectricquantity() {
    return electricquantity;
  }

  public void setElectricquantity(long electricquantity) {
    this.electricquantity = electricquantity;
  }

  public String getIsdelete() {
    return isdelete;
  }

  public void setIsdelete(String isdelete) {
    this.isdelete = isdelete;
  }
}
