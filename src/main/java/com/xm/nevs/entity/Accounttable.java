package com.xm.nevs.entity;


import java.util.Date;

/* *
 * @Author liuhao
 * @Description //TODO 
 * @Date 15:32 2020-04-06
 * @Param 人员账号
 * @return 
 **/
public class Accounttable {

  private String aid;//编号
  private String pid; //人员编号
  private double balance; //余额
  private String currency; //币种
  private long integration; //积分
  private Date modificationtime; //最后修改时间
  private String modifiedby; //最后修改人
  private String isdelete; //是否删除


  public String getAid() {
    return aid;
  }

  public void setAid(String aid) {
    this.aid = aid;
  }

  public String getPid() {
    return pid;
  }

  public void setPid(String pid) {
    this.pid = pid;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public long getIntegration() {
    return integration;
  }

  public void setIntegration(long integration) {
    this.integration = integration;
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

  public String getIsdelete() {
    return isdelete;
  }

  public void setIsdelete(String isdelete) {
    this.isdelete = isdelete;
  }
}
