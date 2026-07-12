package com.example.jobhunting.service;

import java.util.List;

import com.example.jobhunting.dto.CompanyCreateRequest;
import com.example.jobhunting.vo.CompanyResponse;
public interface  CompanyService {
    List<CompanyResponse> listCompanies();
    CompanyResponse getCompanyById(Long id);
    CompanyResponse createCompany(CompanyCreateRequest request);
    /*
        company里的字段是后端字段
        而这里是将前端的数据输入到database，所以需要用companycreateRequest
    */
}
