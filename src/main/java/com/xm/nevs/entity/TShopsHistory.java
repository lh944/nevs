package com.xm.nevs.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;


/**
 * <p>
 * 
 * </p>
 *
 * @author liuhao
 * @since 2020-04-13
 */

public class TShopsHistory implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId
    private String sid; //编号

    private String pid;// 人员编号

    private String sname;// 电站名称

    private String place;// 所属位置
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date createtime;// 申请单创建时间

    private String isvia; //是否通过1.审核通过，2.审核拒绝，3.待审核

    private String auxiliarytype;//电站大小

    private String remark;//电站描述

    private String opinion;//审批意见

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
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

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getIsvia() {
        return isvia;
    }

    public void setIsvia(String isvia) {
        this.isvia = isvia;
    }

    public String getAuxiliarytype() {
        return auxiliarytype;
    }

    public void setAuxiliarytype(String auxiliarytype) {
        this.auxiliarytype = auxiliarytype;
    }

}
