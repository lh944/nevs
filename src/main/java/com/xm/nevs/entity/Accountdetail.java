package com.xm.nevs.entity;


import java.util.Date;

/* *
 * @Author liuhao
 * @Description //TODO 
 * @Date 15:30 2020-04-06
 * @Param
 * @return 
 **/
public class Accountdetail {

  private String did; //明细编号
  private String aid; //人员账号编号
  private double money; //金额
  private Date datechanged; //修改日期
  private String modifier; //修改人
  private String isdelete; //是否删除


  public String getDid() {
    return did;
  }

  public void setDid(String did) {
    this.did = did;
  }


  public String getAid() {
    return aid;
  }

  public void setAid(String aid) {
    this.aid = aid;
  }


  public double getMoney() {
    return money;
  }

  public void setMoney(double money) {
    this.money = money;
  }


  public Date getDatechanged() {
    return datechanged;
  }

  public void setDatechanged(Date datechanged) {
    this.datechanged = datechanged;
  }


  public String getModifier() {
    return modifier;
  }

  public void setModifier(String modifier) {
    this.modifier = modifier;
  }


  public String getIsdelete() {
    return isdelete;
  }

  public void setIsdelete(String isdelete) {
    this.isdelete = isdelete;
  }

}
