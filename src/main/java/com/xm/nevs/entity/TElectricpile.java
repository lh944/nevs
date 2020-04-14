package com.xm.nevs.entity;

public class TElectricpile {

  private String eid; //编号
  private String sid; //店铺编号
  private String etype; //电桩类型
  private String estatus; //电桩状态
  private String voltage; //电桩电压
  private String chargemode; //充电方式
  private String charger; //充电类型
  private String isdelete; //是否删除


  public String getEid() {
    return eid;
  }

  public void setEid(String eid) {
    this.eid = eid;
  }


  public String getSid() {
    return sid;
  }

  public void setSid(String sid) {
    this.sid = sid;
  }


  public String getEtype() {
    return etype;
  }

  public void setEtype(String etype) {
    this.etype = etype;
  }


  public String getEstatus() {
    return estatus;
  }

  public void setEstatus(String estatus) {
    this.estatus = estatus;
  }


  public String getVoltage() {
    return voltage;
  }

  public void setVoltage(String voltage) {
    this.voltage = voltage;
  }


  public String getChargemode() {
    return chargemode;
  }

  public void setChargemode(String chargemode) {
    this.chargemode = chargemode;
  }


  public String getCharger() {
    return charger;
  }

  public void setCharger(String charger) {
    this.charger = charger;
  }


  public String getIsdelete() {
    return isdelete;
  }

  public void setIsdelete(String isdelete) {
    this.isdelete = isdelete;
  }

}
