package com.sadhin.jobportal.jobportal.Service.Mapper;

import com.sadhin.jobportal.jobportal.Repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class CompanyMapper {

    private final UserRepository userRepository;

    public CompanyMapper(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public CompanyUserDto convertToDto(CompanyUserEntity companyUser) {
        if (companyUser == null) {
            return null;
        }

        CompanyUserDto companyUserDto = new CompanyUserDto();
        companyUserDto.setCompanyId(companyUser.getId());
        companyUserDto.setUserId(companyUser.getUserEntity().getId());
        companyUserDto.setCompanyName(companyUser.getCompanyName());
        companyUserDto.setCompanyAddress(companyUser.getCompanyAddress());
        companyUserDto.setCompanyWebsite(companyUser.getCompanyWebsite());
        companyUserDto.setCompanyLogo(companyUser.getCompanyLogo());
        companyUserDto.setCompanyDescription(companyUser.getCompanyDescription());
        companyUserDto.setPrimaryEmail(companyUser.getUserEntity().getPrimaryEmail());
        companyUserDto.setPassword(companyUser.getUserEntity().getPassword());
        companyUserDto.setPrimaryContactNumber(companyUser.getUserEntity().getPrimaryContactNumber());
        companyUserDto.setCratedAt(companyUser.getUserEntity().getCratedAt());
        companyUserDto.setUpdatedAt(companyUser.getUserEntity().getUpdatedAt());
        companyUserDto.setUserType(companyUser.getUserEntity().getUserType());

        return companyUserDto;
    }
}
