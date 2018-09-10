package com.isoftstone.mybatis.entity;

public class Mybatis {
    private Integer id;
    private String bfh;
    private String bfhh;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBfh() {
        return bfh;
    }

    public void setBfh(String bfh) {
        this.bfh = bfh;
    }

    public String getBfhh() {
        return bfhh;
    }

    public void setBfhh(String bfhh) {
        this.bfhh = bfhh;
    }

    @Override
    public String toString() {
        return "Mybatis{" +
                "id=" + id +
                ", bfh='" + bfh + '\'' +
                ", bfhh='" + bfhh + '\'' +
                '}';
    }
}
