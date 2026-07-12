package com.example.jobhunting.entity;

/*
    这里是数据库字段
    里面有很多不应该让前端创建时进行传入的内容
    id或者更新时间或者创建时间等，这个都是后台生成的东西
*/
public class Company { 

    private Long id;
    private String name;
    private String industry;
    private String position;
    private String status;


    public Company(){
        
    }
    public Company(Long id, String name, String industry, String position, String status) {
        this.id = id;
        this.name = name;
        this.industry = industry;
        this.position = position;
        this.status = status;
    }

    public void setId(Long id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setIndustry(String indutry){
        this.industry = indutry;
    }
    public void setPosition(String position){
        this.position = position;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getIndustry() {
        return industry;
    }

    public String getPosition() {
        return position;
    }

    public String getStatus() {
        return status;
    }
}