package com.sadhin.jobportal.jobportal.Service.Mapper;

import com.sadhin.jobportal.jobportal.Dto.*;
import com.sadhin.jobportal.jobportal.Entity.*;
import com.sadhin.jobportal.jobportal.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

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

        if (candidateResumeEntity.getEducationList() !=null){
            resumeDto.setEducationList(candidateResumeEntity.getEducationList());
        }
        if(candidateResumeEntity.getExperienceList() !=null){
            resumeDto.setExperienceList(candidateResumeEntity.getExperienceList());
        }
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
        if (resumeDto.getEducationList()!=null){
            candidateResumeEntity.setEducationList(resumeDto.getEducationList());
        }
        if (resumeDto.getExperienceList()!=null){
            candidateResumeEntity.setExperienceList(resumeDto.getExperienceList());
        }

        return candidateResumeEntity;
    }

    public CompanyExperience convertToCompanyExperience(CompanyExperienceDto experienceDto) {
        CompanyExperience companyExperience = new CompanyExperience();
        companyExperience.setId(experienceDto.getId());
        companyExperience.setMinYearsOfExperience(experienceDto.getMinYearsOfExperience());
        companyExperience.setMaxYearsOfExperience(experienceDto.getMaxYearsOfExperience());
        companyExperience.setListOfSkill(experienceDto.getListOfSkill());
        companyExperience.setAreaOfExpertise(experienceDto.getAreaOfExpertise());
        return companyExperience;
    }
    public CompanyExperienceDto convertToCompanyExperienceDto(CompanyExperience companyExperience){
        CompanyExperienceDto companyExperienceDto = new CompanyExperienceDto();
        companyExperienceDto.setId(companyExperience.getId());
        companyExperienceDto.setMinYearsOfExperience(companyExperience.getMinYearsOfExperience());
        companyExperienceDto.setMaxYearsOfExperience(companyExperience.getMaxYearsOfExperience());
        companyExperienceDto.setListOfSkill(companyExperience.getListOfSkill());
        companyExperienceDto.setAreaOfExpertise(companyExperience.getAreaOfExpertise());
        return companyExperienceDto;
    }

    public CompanyEducationQualification convertToCompanyEducation(
            CompanyEducationQualificationDto educationDto
    ) {
        CompanyEducationQualification companyEducationQualification = new CompanyEducationQualification();
        companyEducationQualification.setId(educationDto.getId());
        companyEducationQualification.setDegreeName(educationDto.getDegreeName());
        companyEducationQualification.setDegreeType(educationDto.getDegreeType());
        companyEducationQualification.setDegreeTitle(educationDto.getDegreeTitle());
        companyEducationQualification.setMajorSubject(educationDto.getMajorSubject());
        return companyEducationQualification;
    }
    public CompanyEducationQualificationDto convertToCompanyEducationDto(CompanyEducationQualification companyEducationQualification){
        CompanyEducationQualificationDto companyEducationQualificationDto = new CompanyEducationQualificationDto();
        companyEducationQualificationDto.setId(companyEducationQualification.getId());
        companyEducationQualificationDto.setDegreeName(companyEducationQualification.getDegreeName());
        companyEducationQualificationDto.setDegreeType(companyEducationQualification.getDegreeType());
        companyEducationQualificationDto.setDegreeTitle(companyEducationQualification.getDegreeTitle());
        companyEducationQualificationDto.setMajorSubject(companyEducationQualification.getMajorSubject());
        return companyEducationQualificationDto;
    }
    public PostDto convertToPostDto(CompanyJobPostEntity jobPostEntity) {
        PostDto postDto = new PostDto();
        postDto.setId(jobPostEntity.getId());
        postDto.setJobTitle(jobPostEntity.getJobTitle());
        postDto.setVacancy(jobPostEntity.getVacancy());
        postDto.setRequiredSkill(jobPostEntity.getRequiredSkill());
        postDto.setJobType(jobPostEntity.getJobType());
        postDto.setDeadline(jobPostEntity.getDeadline());
        postDto.setContext(jobPostEntity.getContext());
        postDto.setJobResponsibility(jobPostEntity.getJobResponsibility());
        postDto.setJobLevel(jobPostEntity.getJobLevel());
        postDto.setJobLocation(jobPostEntity.getJobLocation());
        postDto.setMaxSalary(jobPostEntity.getMaxSalary());
        postDto.setMinSalary(jobPostEntity.getMinSalary());
        postDto.setSalaryType(jobPostEntity.getSalaryType());
        postDto.setLunchFacilityType(jobPostEntity.getLunchFacilityType());
        postDto.setSalaryReview(jobPostEntity.getSalaryReview());
        postDto.setNumberOfYearlyBonus(jobPostEntity.getNumberOfYearlyBonus());
        postDto.setWorkplace(jobPostEntity.getWorkplace());
        postDto.setGenderType(jobPostEntity.getGenderType());
        postDto.setAgeMin(jobPostEntity.getAgeMin());
        postDto.setAgeMax(jobPostEntity.getAgeMax());
        postDto.setCompanyUserId(jobPostEntity.getCompanyUserEntity().getId());
        if(jobPostEntity.getEducationQualificationList()!=null){
            postDto.setEducationQualificationList(jobPostEntity.getEducationQualificationList()
                    .stream().map(this::convertToCompanyEducationDto).collect(Collectors.toList()));
        }
        if (jobPostEntity.getCompanyExperienceList()!=null){
            postDto.setCompanyExperienceList(jobPostEntity.getCompanyExperienceList()
                    .stream().map(this::convertToCompanyExperienceDto).collect(Collectors.toList()));
        }return postDto;
    }
    public CompanyJobPostEntity convertToCompanyJobPostEntity(PostDto postDto) {
        CompanyJobPostEntity jobPostEntity = new CompanyJobPostEntity();
        jobPostEntity.setId(postDto.getId());
        jobPostEntity.setJobTitle(postDto.getJobTitle());
        jobPostEntity.setVacancy(postDto.getVacancy());
        jobPostEntity.setRequiredSkill(postDto.getRequiredSkill());
        jobPostEntity.setJobType(postDto.getJobType());
        jobPostEntity.setDeadline(postDto.getDeadline());
        jobPostEntity.setContext(postDto.getContext());
        jobPostEntity.setJobResponsibility(postDto.getJobResponsibility());
        jobPostEntity.setJobLevel(postDto.getJobLevel());
        jobPostEntity.setJobLocation(postDto.getJobLocation());
        jobPostEntity.setMaxSalary(postDto.getMaxSalary());
        jobPostEntity.setMinSalary(postDto.getMinSalary());
        jobPostEntity.setSalaryType(postDto.getSalaryType());
        jobPostEntity.setLunchFacilityType(postDto.getLunchFacilityType());
        jobPostEntity.setSalaryReview(postDto.getSalaryReview());
        jobPostEntity.setNumberOfYearlyBonus(postDto.getNumberOfYearlyBonus());
        jobPostEntity.setWorkplace(postDto.getWorkplace());
        jobPostEntity.setGenderType(postDto.getGenderType());
        jobPostEntity.setAgeMin(postDto.getAgeMin());
        jobPostEntity.setAgeMax(postDto.getAgeMax());
        /*if (postDto.getCompanyExperienceList() !=null){
            jobPostEntity.setCompanyExperienceList(postDto.getCompanyExperienceList()
                    .stream().map(this::convertToCompanyExperience).collect(Collectors.toList()));
        }
        if (postDto.getEducationQualificationList() !=null){
            jobPostEntity.setEducationQualificationList(postDto.getEducationQualificationList()
                    .stream().map(this::convertToCompanyEducation).collect(Collectors.toList()));
        }*/
        return jobPostEntity;
    }


    }
