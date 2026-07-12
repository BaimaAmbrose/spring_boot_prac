package com.example.jobhunting.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.jobhunting.entity.Company;

/*
    Controller is accept requests from frontend;
    But Controller dont write sql directly;
    Controller through by Mapper to write database;
 */
@Repository
public class CompanyMapper {

    private final List<Company> companies = new ArrayList<>();
    private Long nextId = 4L;

    public CompanyMapper() {
        companies.add(new Company(1L, "Toyota", "汽车", "Java 后端工程师", "已投递"));
        companies.add(new Company(2L, "Rakuten", "电商", "Backend Engineer", "书类通过"));
        companies.add(new Company(3L, "Mercari", "互联网", "Software Engineer", "未投递"));
    }

    public List<Company> selectList(){
        return companies;
    }

    public Optional<Company> selectById(Long id){ // Optional 用在查询的方法中，用来防止查询结果不存在
        return companies.stream().filter(company -> company.getId().equals(id)).findFirst();
    }

    public Company insert(Company company){
        company.setId(nextId);// 这里的id是不会从前端传入的，所以需要在系统中自己写入
        nextId++;
        companies.add(company);
        return company;
    }
}

