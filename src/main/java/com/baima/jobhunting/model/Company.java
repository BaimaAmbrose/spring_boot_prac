package com.baima.jobhunting.model;


public class Company {

    private Long id;
    private String name;
    private String industry;
    private String position;
    private String status;

    public Company(Long id, String name, String industry, String position, String status) {
        this.id = id;
        this.name = name;
        this.industry = industry;
        this.position = position;
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