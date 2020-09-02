package com.TNyun.entity;

/**
 * ccx
 * 2020/8/31
 */
public class siapply {
    private int si_id;
    private String si_phone;
    private String si_name;
    private String si_password;
    private String si_email;
    private String si_status;

    public void setSi_id(int si_id) {
        this.si_id = si_id;
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

    public void setSi_status(String si_status) {
        this.si_status = si_status;
    }

    public int getSi_id() {
        return si_id;
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

    public String getSi_status() {
        return si_status;
    }

    @Override
    public String toString() {
        return "Si_apply{" +
                "si_id=" + si_id +
                ", si_name='" + si_name + '\'' +
                ", si_phone='" + si_phone + '\'' +
                ", si_password='" + si_password + '\'' +
                ", si_email='" + si_email + '\'' +
                ", si_status='" + si_status + '\'' +
                '}';
    }


}
