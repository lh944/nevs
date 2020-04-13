package com.xm.nevs.enums;


public enum ResultFailureEnum {
    /**
     * 返回错误信息枚举类
     */
    LOGIN_ERROR(1, "登录失败"),
    ;

    private Integer code;

    private String msg;

    ResultFailureEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
