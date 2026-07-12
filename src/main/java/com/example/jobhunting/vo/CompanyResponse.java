package com.example.jobhunting.vo;


/*
    This part defines the response data structure 
    sent to the frontend and controls which fields are exposed to the frontend.
 */
public class CompanyResponse {

    private Long id;
    private String name;
    private String industry;
    private String position;
    private String status;

    public CompanyResponse(Long id, String name, String industry, String position, String status) {
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
