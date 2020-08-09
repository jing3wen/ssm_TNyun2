package com.TNyun.entity;

/**
 * Created by kyq on 2020/8/9 10:53
 */
public class Sys_Service {

    private String time;
    private int c_id;
    private String c_name;
    private int s_id;
    private String s_name;
    private String agree;

    public void setTime(String time) {
        this.time = time;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public void setAgree(String agree) {
        this.agree = agree;
    }

    public String getTime() {
        return time;
    }

    public int getS_id() {
        return s_id;
    }

    public String getC_name() {
        return c_name;
    }

    public int getC_id() {
        return c_id;
    }

    public String getS_name() {
        return s_name;
    }

    public String getAgree() {
        return agree;
    }

    @Override
    public String toString() {
        return "Sys_Service{" +
                "time='" + time + '\'' +
                ", c_id=" + c_id +
                ", c_name='" + c_name + '\'' +
                ", s_id=" + s_id +
                ", s_name='" + s_name + '\'' +
                ", agree='" + agree + '\'' +
                '}';
    }
}