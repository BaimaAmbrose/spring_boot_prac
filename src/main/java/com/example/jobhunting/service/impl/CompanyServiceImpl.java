package com.example.jobhunting.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.jobhunting.entity.Company;
import com.example.jobhunting.mapper.CompanyMapper;
import com.example.jobhunting.dto.CompanyCreateRequest;
import com.example.jobhunting.service.CompanyService;
import com.example.jobhunting.vo.CompanyResponse;

@Service
public class CompanyServiceImpl implements CompanyService {

    private final CompanyMapper companyMapper;

    public CompanyServiceImpl(CompanyMapper companyMapper) {
        this.companyMapper = companyMapper;
    }

    @Override
    public List<CompanyResponse> listCompanies() {
        return companyMapper.selectList().stream().map(this::toResponse).toList();
    }// 将mapper里的数据库内容变成response的形式，然后返回，进行输出

    @Override
    public CompanyResponse getCompanyById(Long id) {
        return companyMapper.selectById(id).map(this::toResponse).orElse(null);
    }

    @Override
    public CompanyResponse createCompany(CompanyCreateRequest request) {
        if(request.getName() == null || request.getName().isBlank()){
            throw new IllegalArgumentException("The company name cannot be blank");
        }

        Company company = new Company();
        company.setName(request.getName());
        company.setIndustry(request.getIndustry());
        company.setPosition(request.getPosition());
        company.setStatus("Not applited");
        Company savedCompany = companyMapper.insert(company);
        return toResponse(savedCompany);
    }

    private CompanyResponse toResponse(Company company) { // 将数据库里的数据变成一个可以输出的内容
        return new CompanyResponse(company.getId(), company.getName(), company.getIndustry(), company.getPosition(), company.getStatus());
    }

}
