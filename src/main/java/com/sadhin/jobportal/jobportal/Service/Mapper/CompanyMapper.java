package com.sadhin.jobportal.jobportal.Service.Mapper;

import com.sadhin.jobportal.jobportal.Dto.CompanyUserDto;
import com.sadhin.jobportal.jobportal.Dto.ResumeDto;
import com.sadhin.jobportal.jobportal.Entity.CandidateResumeEntity;
import com.sadhin.jobportal.jobportal.Entity.CompanyUserEntity;
import com.sadhin.jobportal.jobportal.Entity.UserEntity;
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
        companyUserDto.setId(companyUser.getId());
        companyUserDto.setUserId(companyUser.getUserEntity().getId());
        companyUserDto.setPrimaryEmail(companyUser.getUserEntity().getPrimaryEmail());
        companyUserDto.setPrimaryContactNumber(companyUser.getUserEntity().getPrimaryContactNumber());
        companyUserDto.setCratedAt(companyUser.getUserEntity().getCratedAt());
        companyUserDto.setUpdatedAt(companyUser.getUserEntity().getUpdatedAt());
        companyUserDto.setUserType(companyUser.getUserEntity().getUserType());
        companyUserDto.setPassword(companyUser.getUserEntity().getPassword());
        companyUserDto.setPreviousPassword(companyUser.getUserEntity().getPreviousPassword());
        companyUserDto.setCompanyName(companyUser.getCompanyName());
        companyUserDto.setTimeOfEstablishment(companyUser.getTimeOfEstablishment());
        companyUserDto.setMaxNumberOfEmployee(companyUser.getMaxNumberOfEmployee());
        companyUserDto.setMinNumberOfEmployee(companyUser.getMinNumberOfEmployee());
        companyUserDto.setCompanyAddress(companyUser.getCompanyAddress());
        companyUserDto.setIndustryType(companyUser.getIndustryType());
        companyUserDto.setPrimaryPersonName(companyUser.getPrimaryPersonName());
        companyUserDto.setPrimaryPersonDesignation(companyUser.getPrimaryPersonDesignation());
        return companyUserDto;
    }

    public CompanyUserEntity convertToEntity(CompanyUserDto companyUserDto) {
        if (companyUserDto == null) {
            return null;
        }
        CompanyUserEntity companyUserEntity = new CompanyUserEntity();
        companyUserEntity.setId(companyUserDto.getId());
        companyUserEntity.setCompanyName(companyUserDto.getCompanyName());
        companyUserEntity.setTimeOfEstablishment(companyUserDto.getTimeOfEstablishment());
        companyUserEntity.setMaxNumberOfEmployee(companyUserDto.getMaxNumberOfEmployee());
        companyUserEntity.setMinNumberOfEmployee(companyUserDto.getMinNumberOfEmployee());
        companyUserEntity.setCompanyAddress(companyUserDto.getCompanyAddress());
        companyUserEntity.setIndustryType(companyUserDto.getIndustryType());
        companyUserEntity.setPrimaryPersonName(companyUserDto.getPrimaryPersonName());
        companyUserEntity.setPrimaryPersonDesignation(companyUserDto.getPrimaryPersonDesignation());

        UserEntity userEntity = new UserEntity();
        userEntity.setId(companyUserDto.getUserId());
        userEntity.setPrimaryEmail(companyUserDto.getPrimaryEmail());
        userEntity.setPrimaryContactNumber(companyUserDto.getPrimaryContactNumber());
        userEntity.setCratedAt(companyUserDto.getCratedAt());
        userEntity.setUpdatedAt(companyUserDto.getUpdatedAt());
        userEntity.setUserType(companyUserDto.getUserType());
        userEntity.setPassword(companyUserDto.getPassword());
        userEntity.setPreviousPassword(companyUserDto.getPreviousPassword());
        companyUserEntity.setUserEntity(userEntity);
        return companyUserEntity;
    }

    public ResumeDto convertToResumeDto(CandidateResumeEntity candidateResumeEntity) {
        ResumeDto resumeDto = new ResumeDto();
        resumeDto.setId(candidateResumeEntity.getId());
        resumeDto.setCandidateUserId(candidateResumeEntity.getCandidateUserEntity().getId());
        resumeDto.setFatherName(candidateResumeEntity.getFatherName());
        resumeDto.setMotherName(candidateResumeEntity.getMotherName());
        resumeDto.setPresentAddress(candidateResumeEntity.getPresentAddress());
        resumeDto.setPermanentAddress(candidateResumeEntity.getPermanentAddress());
        resumeDto.setDateOfBirth(candidateResumeEntity.getDateOfBirth());
        resumeDto.setNationalityType(candidateResumeEntity.getNationalityType());
        resumeDto.setNationalIdNumber(candidateResumeEntity.getNationalIdNumber());
        resumeDto.setReligionType(candidateResumeEntity.getReligionType());
        resumeDto.setMaritalStatus(candidateResumeEntity.getMaritalStatus());
        resumeDto.setSecondaryContactNumber(candidateResumeEntity.getSecondaryContactNumber());
        resumeDto.setSecondaryEmail(candidateResumeEntity.getSecondaryEmail());
        resumeDto.setBloodGroup(candidateResumeEntity.getBloodGroup());
        resumeDto.setEducationList(candidateResumeEntity.getEducationList());
        resumeDto.setExperienceList(candidateResumeEntity.getExperienceList());
        return resumeDto;
    }
    public CandidateResumeEntity convertToResumeEntity(ResumeDto resumeDto) {
        CandidateResumeEntity candidateResumeEntity = new CandidateResumeEntity();
        candidateResumeEntity.setId(resumeDto.getId());
        candidateResumeEntity.setFatherName(resumeDto.getFatherName());
        candidateResumeEntity.setMotherName(resumeDto.getMotherName());
        candidateResumeEntity.setPresentAddress(resumeDto.getPresentAddress());
        candidateResumeEntity.setPermanentAddress(resumeDto.getPermanentAddress());
        candidateResumeEntity.setDateOfBirth(resumeDto.getDateOfBirth());
        candidateResumeEntity.setNationalityType(resumeDto.getNationalityType());
        candidateResumeEntity.setNationalIdNumber(resumeDto.getNationalIdNumber());
        candidateResumeEntity.setReligionType(resumeDto.getReligionType());
        candidateResumeEntity.setMaritalStatus(resumeDto.getMaritalStatus());
        candidateResumeEntity.setSecondaryContactNumber(resumeDto.getSecondaryContactNumber());
        candidateResumeEntity.setSecondaryEmail(resumeDto.getSecondaryEmail());
        candidateResumeEntity.setBloodGroup(resumeDto.getBloodGroup());
        candidateResumeEntity.setEducationList(resumeDto.getEducationList());
        candidateResumeEntity.setExperienceList(resumeDto.getExperienceList());
        return candidateResumeEntity;
    }
}
