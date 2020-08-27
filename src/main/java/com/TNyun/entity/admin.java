package com.TNyun.entity;

/**
 * Created by kyq on 2020/8/8 22:43
 */
public class admin {

    private int a_id;
    private String a_name;
    private String a_phone;
    private String a_password;
    private String a_type;
    private String a_status;

    public void setA_id(int a_id) {
        this.a_id = a_id;
    }

    public void setA_name(String a_name) {
        this.a_name = a_name;
    }

    public void setA_phone(String a_phone) {
        this.a_phone = a_phone;
    }

    public void setA_password(String a_password) {
        this.a_password = a_password;
    }

    public void setA_type(String a_type) { this.a_type = a_type; }

    public void setA_status(String a_status) {
        this.a_status = a_status;
    }

    public int getA_id() {
        return a_id;
    }

    public String getA_name() {
        return a_name;
    }

    public String getA_phone() {
        return a_phone;
    }

    public String getA_password() {
        return a_password;
    }

    public String getA_type() { return a_type; }

    public String getA_status() {
        return a_status;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "a_id=" + a_id +
                ", a_name='" + a_name + '\'' +
                ", a_phone='" + a_phone + '\'' +
                ", a_password='" + a_password + '\'' +
                ", a_type='" + a_type + '\'' +
                ", a_status='" + a_status + '\'' +
                '}';
    }
}
