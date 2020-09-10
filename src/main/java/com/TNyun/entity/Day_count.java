package com.TNyun.entity;

/**
 * Created by kyq on 2020/9/10 17:07
 */
public class Day_count {
    private String time_day;
    private int count_login;
    private int count_register;

    public void setTime_day(String time_day) {
        this.time_day = time_day;
    }

    public void setCount_login(int count_login) {
        this.count_login = count_login;
    }

    public void setCount_register(int count_register) {
        this.count_register = count_register;
    }

    public String getTime_day() {
        return time_day;
    }

    public int getCount_login() {
        return count_login;
    }

    public int getCount_register() {
        return count_register;
    }

    @Override
    public String toString() {
        return "Day_conunt{" +
                "time_day='" + time_day + '\'' +
                ", count_login=" + count_login +
                ", count_register=" + count_register +
                '}';
    }
}

