package com.example.jobhunting.dto;

/*
    这里是前端请求
    表示在创建新的内容时候，允许前端传入什么东西
 */
public class CompanyCreateRequest {

    private String name;
    private String industry;
    private String position;

    public String getName() {
        return name;
    }

    public String getIndustry() {
        return industry;
    }

    public String getPosition() {
        return position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
