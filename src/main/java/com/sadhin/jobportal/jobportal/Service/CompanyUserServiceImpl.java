package com.sadhin.jobportal.jobportal.Service;

import com.sadhin.jobportal.jobportal.Dto.CompanyUserDto;
import com.sadhin.jobportal.jobportal.Dto.PostDto;
import com.sadhin.jobportal.jobportal.Entity.CandidateUserEntity;
import com.sadhin.jobportal.jobportal.Entity.CompanyJobPostEntity;
import com.sadhin.jobportal.jobportal.Entity.CompanyUserEntity;
import com.sadhin.jobportal.jobportal.Entity.UserEntity;
import com.sadhin.jobportal.jobportal.Repository.CompanyJobPostRepository;
import com.sadhin.jobportal.jobportal.Repository.CompanyUserRepository;
import com.sadhin.jobportal.jobportal.Repository.UserRepository;
import com.sadhin.jobportal.jobportal.Service.Mapper.CompanyMapper;
import org.springframework.stereotype.Service;

@Service
public class CompanyUserServiceImpl implements CompanyUserService{

    private final CompanyUserRepository companyUserRepository;
    private final UserRepository userRepository;
    private final CompanyJobPostRepository companyJobPostRepository;

    private final CompanyMapper companyMapper;

    public CompanyUserServiceImpl(CompanyUserRepository companyUserRepository, UserRepository userRepository, CompanyJobPostRepository companyJobPostRepository, CompanyMapper companyMapper) {
        this.companyUserRepository = companyUserRepository;
        this.userRepository = userRepository;
        this.companyJobPostRepository = companyJobPostRepository;
        this.companyMapper = companyMapper;
    }

    @Override
    public boolean save(CompanyUserDto companyUserDto) {
        try {
            CompanyUserEntity companyUserEntity=companyMapper.convertToEntity(companyUserDto);
            UserEntity userEntity =userRepository.save(companyUserEntity.getUserEntity());
            companyUserEntity.setUserEntity(userEntity);
            companyUserRepository.save(companyUserEntity);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public CompanyUserDto findByEmailAndPassword(String email, String password) {
        return companyUserRepository.findByEmailAndPassword(email, password)
                .map(companyMapper::convertToDto)
                .orElse(null);
    }

    @Override
    public boolean createJobPost(PostDto postDto) {
        try {
            CompanyUserEntity companyUserEntity= companyUserRepository.findById(postDto.getCompanyUserId()).orElse(null);
            CompanyJobPostEntity companyJobPostEntity=new CompanyJobPostEntity();
            companyJobPostEntity.setJobTitle(postDto.getJobTitle());
            companyJobPostEntity.setVacancy(postDto.getVacancy());
            companyJobPostEntity.setRequiredSkill(postDto.getRequiredSkill());
            companyJobPostEntity.setJobType(postDto.getJobType());
            companyJobPostEntity.setDeadline(postDto.getDeadline());
            companyJobPostEntity.setContext(postDto.getContext());
            companyJobPostEntity.setJobResponsibility(postDto.getJobResponsibility());
            companyJobPostEntity.setJobLevel(postDto.getJobLevel());
            companyJobPostEntity.setJobLocation(postDto.getJobLocation());
            companyJobPostEntity.setMaxSalary(postDto.getMaxSalary());
            companyJobPostEntity.setMinSalary(postDto.getMinSalary());
            companyJobPostEntity.setSalaryType(postDto.getSalaryType());
            companyJobPostEntity.setLunchFacilityType(postDto.getLunchFacilityType());
            companyJobPostEntity.setSalaryReview(postDto.getSalaryReview());
            companyJobPostEntity.setNumberOfYearlyBonus(postDto.getNumberOfYearlyBonus());
            companyJobPostEntity.setWorkplace(postDto.getWorkplace());
            companyJobPostEntity.setGenderType(postDto.getGenderType());
            companyJobPostEntity.setAgeMax(postDto.getAgeMax());
            companyJobPostEntity.setAgeMin(postDto.getAgeMin());
            companyJobPostEntity.setCompanyExperienceList(postDto.getCompanyExperienceList());
            companyJobPostEntity.setEducationQualificationList(postDto.getEducationQualificationList());
            companyJobPostEntity.setCompanyUserEntity(companyUserEntity);
            companyJobPostRepository.save(companyJobPostEntity);
         return true;
        }catch (Exception e){
            return false;
        }
    }
}
