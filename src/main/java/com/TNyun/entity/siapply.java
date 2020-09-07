package com.TNyun.entity;

/**
 * ccx
 * 2020/8/31
 */
public class siapply {
    private String time;
    private String si_name;
    private String si_phone;
    private String si_password;
    private String si_email;
    private String si_type;
    private String si_introduction;
    private String si_agree;

    public void setTime(String time) {
        this.time = time;
    }

    public void setSi_name(String si_name) {
        this.si_name = si_name;
    }

    public void setSi_phone(String si_phone) {
        this.si_phone = si_phone;
    }

    public void setSi_password(String si_password) {
        this.si_password = si_password;
    }

    public void setSi_email(String si_email) { this.si_email = si_email; }

    public void setSi_type(String si_status) {
        this.si_type = si_status;
    }

    public void setSi_introduction(String si_introduction){
        this.si_introduction=si_introduction;
    }

    public void setSi_agree(String si_agree){
        this.si_agree=si_agree;
    }

    public String getTime() {
        return time;
    }

    public String getSi_name() {
        return si_name;
    }

    public String getSi_phone() {
        return si_phone;
    }

    public String getSi_password() {
        return si_password;
    }

    public String getSi_email() { return si_email; }

    public String getSi_type() {
        return si_type;
    }

    public String getSi_introduction(){return si_introduction;}

    public String getSi_agree(){return si_agree;}

    @Override
    public String toString() {
        return "Si_apply{" +
                "time=" + time +
                ", si_name='" + si_name + '\'' +
                ", si_phone='" + si_phone + '\'' +
                ", si_password='" + si_password + '\'' +
                ", si_email='" + si_email + '\'' +
                ", si_type='" + si_type + '\'' +
                ", si_introduction='" + si_introduction + '\'' +
                ", si_agree='" + si_agree + '\'' +
                '}';
    }


}
