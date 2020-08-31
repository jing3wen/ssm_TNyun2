package com.TNyun.entity;

/**
 * Created by kyq on 2020/8/31 9:56
 */
public class Subsystem {
    private int s_id;
    private String s_name;
    private int si_id;
    private String s_introduction;
    private String s_price;
    private String s_website1;
    private String s_website2;
    private String s_status;

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public void setSi_id(int si_id) {
        this.si_id = si_id;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public void setS_introduction(String s_introduction) {
        this.s_introduction = s_introduction;
    }

    public void setS_price(String s_price) {
        this.s_price = s_price;
    }

    public void setS_website1(String s_website1) {
        this.s_website1 = s_website1;
    }

    public void setS_website2(String getS_website2) {
        this.s_website2 = getS_website2;
    }

    public void setS_status(String s_status) {
        this.s_status = s_status;
    }

    public int getS_id() {
        return s_id;
    }

    public int getSi_id() {
        return si_id;
    }

    public String getS_name() {
        return s_name;
    }

    public String getS_introduction() {
        return s_introduction;
    }

    public String getS_price() {
        return s_price;
    }

    public String getS_website1() {
        return s_website1;
    }

    public String getS_website2() {
        return s_website2;
    }

    public String getS_status() {
        return s_status;
    }

    @Override
    public String toString() {
        return "Subsystem{" +
                "s_id=" + s_id +
                ", s_name='" + s_name + '\'' +
                ", si_id=" + si_id +
                ", s_introduction='" + s_introduction + '\'' +
                ", s_price='" + s_price + '\'' +
                ", s_website1='" + s_website1 + '\'' +
                ", s_website2='" + s_website2 + '\'' +
                ", s_status='" + s_status + '\'' +
                '}';
    }
}
