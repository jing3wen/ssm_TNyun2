package com.TNyun.entity;

/**
 * @Author jingwen
 * @Date 2020/8/5 10:27
 * (ﾉꐦ ๑´Д`๑)ﾉ彡┻━┻  I have to type the code again   (▼皿▼#)
 **/
public class customer {
    /**
     * id : 1234
     * phone : 12345678
     * name : 小明
     * password : 123456
     * status : 1
     */

    private int id;
    private String phone;
    private String name;
    private String password;
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String  cus_print(){
        String re="{ "+Integer.toString(this.getId())+",  "+ this.getPhone()+",  "+
                this.getName()+",  "+this.getPassword()+",  "+this.getStatus()+" }";
        return re;
    }
}
