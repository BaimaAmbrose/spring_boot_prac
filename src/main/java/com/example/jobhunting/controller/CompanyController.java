package com.example.jobhunting.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.jobhunting.dto.CompanyCreateRequest;
import com.example.jobhunting.service.CompanyService;
import com.example.jobhunting.vo.CompanyResponse;

@RestController
public class CompanyController {

    private final CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping("/companies")
    public List<CompanyResponse> listCompanies() {
        return companyService.listCompanies();
    }

    @GetMapping("/companies/{id}")
    public CompanyResponse getCompanyResponse(@PathVariable Long id) {
        return companyService.getCompanyById(id);
    }

    @PostMapping("/companies")
    public CompanyResponse createCompany(@RequestBody CompanyCreateRequest request) {
        return companyService.createCompany(request);
    }
}
