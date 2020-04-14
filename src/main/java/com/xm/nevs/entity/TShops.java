package com.xm.nevs.entity;


import java.util.Date;

public class TShops {

  private String sid; //编号
  private String pid; //人编号
  private String sname; //店铺名称
  private String slevel; //店铺等级
  private String parkingfees; //是否收取停车费
  private Date entertime; //入驻时间
  private String place; //所属位置
  private String planttype; //电站类型
  private String vdc; //电压
  private String webkit; //高速模式
  private String auxiliarytype; //电站大小
  private String operatingstatus; //营业状态 1.开业 2.停业 3.休业
  private String bmw; //适用车型
  private String isboutique; //是否精品店铺
  private String modifiedby; //最后修改人
  private Date modificationtime; //最后修改时间
  private String isdelete; //是否删除
  private String remark; //电站描述

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public String getSid() {
    return sid;
  }

  public void setSid(String sid) {
    this.sid = sid;
  }

  public String getPid() {
    return pid;
  }

  public void setPid(String pid) {
    this.pid = pid;
  }

  public String getSname() {
    return sname;
  }

  public void setSname(String sname) {
    this.sname = sname;
  }

  public String getSlevel() {
    return slevel;
  }

  public void setSlevel(String slevel) {
    this.slevel = slevel;
  }

  public String getParkingfees() {
    return parkingfees;
  }

  public void setParkingfees(String parkingfees) {
    this.parkingfees = parkingfees;
  }

  public Date getEntertime() {
    return entertime;
  }

  public void setEntertime(Date entertime) {
    this.entertime = entertime;
  }

  public String getPlace() {
    return place;
  }

  public void setPlace(String place) {
    this.place = place;
  }

  public String getPlanttype() {
    return planttype;
  }

  public void setPlanttype(String planttype) {
    this.planttype = planttype;
  }









  public String getVdc() {
    return vdc;
  }

  public void setVdc(String vdc) {
    this.vdc = vdc;
  }

  public String getWebkit() {
    return webkit;
  }

  public void setWebkit(String webkit) {
    this.webkit = webkit;
  }

  public String getAuxiliarytype() {
    return auxiliarytype;
  }

  public void setAuxiliarytype(String auxiliarytype) {
    this.auxiliarytype = auxiliarytype;
  }

  public String getOperatingstatus() {
    return operatingstatus;
  }

  public void setOperatingstatus(String operatingstatus) {
    this.operatingstatus = operatingstatus;
  }



  public String getBmw() {
    return bmw;
  }

  public void setBmw(String bmw) {
    this.bmw = bmw;
  }

  public String getIsboutique() {
    return isboutique;
  }

  public void setIsboutique(String isboutique) {
    this.isboutique = isboutique;
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
}
