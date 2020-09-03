package com.TNyun.util;

/**
 * Created by kyq on 2020/9/3 11:42
 */
public class Retureninfo {
    private int code;
    private String msg;

    public void setCode(int code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return "Retureninfo{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }
}
