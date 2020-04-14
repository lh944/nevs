/**
 * 文件名:Jsionstr
 * 作者:liuhao
 * 时间:2020-04-09 21:22
 * 描述:
 */

package com.xm.nevs.util;

public class Jsionstr {
    private String msg;
    private String code;


    private Jsionstr(String msg, String code) {
        this.msg = msg;
        this.code = code;
    }

    public static Jsionstr createJsionstr(String code , String msg){
        return new Jsionstr(code,msg);
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
