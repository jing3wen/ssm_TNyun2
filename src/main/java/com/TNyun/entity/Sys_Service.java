package com.TNyun.entity;

/**
 * @Author jingwen
 * @Date 2020/8/9 15:25
 * (ﾉꐦ ๑´Д`๑)ﾉ彡┻━┻  I have to type the code again   (▼皿▼#)
 **/
public class Sys_Service {


    /**
     * time : 2020/8/3 14:46
     * c_id : 123456
     * c_name : 小白
     * s_id : 1234
     * s_name : 超市子系统
     * agree : 1
     */

    private String time;
    private int c_id;
    private String c_name;
    private int s_id;
    private String s_name;
    private String agree;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getAgree() {
        return agree;
    }

    public void setAgree(String agree) {
        this.agree = agree;
    }

    public String ser_print(){

        String result="the service class is: "+"{ time:"+this.getTime()+", c_id:"+this.getC_id()+", c_name:"
                +this.getC_name()+", s_id:"+this.getS_id()+", s_name:"+this.getS_name()+", agree:"+this.getAgree()+ "}";
        return result;

    }

}
