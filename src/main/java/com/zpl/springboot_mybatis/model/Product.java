package com.zpl.springboot_mybatis.model;

public class Product {
    private String id;

    private String name;

    private String proceeds;

    private String isshelf;

    private String period;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getProceeds() {
        return proceeds;
    }

    public void setProceeds(String proceeds) {
        this.proceeds = proceeds == null ? null : proceeds.trim();
    }

    public String getIsshelf() {
        return isshelf;
    }

    public void setIsshelf(String isshelf) {
        this.isshelf = isshelf == null ? null : isshelf.trim();
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period == null ? null : period.trim();
    }
}