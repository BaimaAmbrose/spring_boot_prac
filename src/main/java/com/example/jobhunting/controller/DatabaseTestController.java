package com.example.jobhunting.controller;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatabaseTestController {

    private final JdbcTemplate jdbcTemplate;

    public DatabaseTestController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping("/db/health")
    public String checkDatabaseConnection() {
        Integer result = jdbcTemplate.queryForObject("SELECT 1", Integer.class);
        return "Database connected: " + result;
    }

    @GetMapping("/db/companies/count")
    public String countCompanies(){
        Integer count = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM company", Integer.class);
        return "Company count:" + count;
    }

    @GetMapping("/db/companies")
    public List<Map<String , Object>> listCompanies(){
        return jdbcTemplate.queryForList("select id, name ,industry , position , status , applied_date from company");
    }
}