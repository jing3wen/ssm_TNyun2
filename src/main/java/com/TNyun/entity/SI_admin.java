package com.TNyun.entity;

public class SI_admin {
    private int si_id;
    private String si_name;
    private String si_phone;
    private String si_password;
    private String si_email;
    private String si_status;

    public void setSI_id(int si_id) {
        this.si_id = si_id;
    }

    public void setSI_name(String si_name) {
        this.si_name = si_name;
    }

    public void setSI_phone(String si_phone) {
        this.si_phone = si_phone;
    }

    public void setSI_password(String si_password) {
        this.si_password = si_password;
    }

    public void setSI_email(String si_email){ this.si_email = si_email; }

    public void setSI_status(String si_status) {
        this.si_status = si_status;
    }

    public int getSI_id() {
        return si_id;
    }

    public String getSI_name() {
        return si_name;
    }

    public String getSI_phone() {
        return si_phone;
    }

    public String getSI_password() {
        return si_password;
    }

    public String getSI_email(){ return si_email; }

    public String getSI_status() {
        return si_status;
    }

    @Override
    public String toString() {
        return "SI_admin{" +
                "si_id=" + si_id +
                ", si_name='" + si_name + '\'' +
                ", si_phone='" + si_phone + '\'' +
                ", si_password='" + si_password + '\'' +
                ", si_email='" + si_email + '\'' +
                '}';
    }
}
