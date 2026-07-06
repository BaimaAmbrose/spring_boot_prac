package com.baima.jobhunting.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baima.jobhunting.model.Company;

@RestController
public class CompanyController {

    @GetMapping("/companies")
    public List<Company> getCompanies() {
        return List.of(
                new Company(1L, "Toyota", "汽车", "Java 后端工程师", "已投递"),
                new Company(2L, "Rakuten", "电商", "Backend Engineer", "书类通过"),
                new Company(3L, "Mercari", "互联网", "Software Engineer", "未投递")
        );
    }
}