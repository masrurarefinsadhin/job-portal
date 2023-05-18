package com.sadhin.jobportal.jobportal.Service;

import com.sadhin.jobportal.jobportal.Dto.*;
import com.sadhin.jobportal.jobportal.Entity.*;
import com.sadhin.jobportal.jobportal.Repository.*;
import com.sadhin.jobportal.jobportal.Service.Mapper.CandidateMapper;
import com.sadhin.jobportal.jobportal.Service.Mapper.CompanyMapper;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CompanyUserServiceImpl implements CompanyUserService{

    private final CompanyUserRepository companyUserRepository;
    private final UserRepository userRepository;
    private final CompanyJobPostRepository companyJobPostRepository;

    private final CompanyExperienceRepository companyExperienceRepository;

    private final CompanyEducationRepository companyEducationRepository;
    private final CompanyMapper companyMapper;

    private final CandidateMapper candidateMapper;

    private final CandidateResumeRepository candidateResumeRepository;

    public CompanyUserServiceImpl(CompanyUserRepository companyUserRepository,
                                  UserRepository userRepository,
                                  CompanyJobPostRepository companyJobPostRepository,
                                  CompanyExperienceRepository companyExperienceRepository,
                                  CompanyEducationRepository companyEducationRepository,
                                  CompanyMapper companyMapper,
                                  CandidateMapper candidateMapper, CandidateResumeRepository candidateResumeRepository
    ) {
        this.companyUserRepository = companyUserRepository;
        this.userRepository = userRepository;
        this.companyJobPostRepository = companyJobPostRepository;
        this.companyExperienceRepository = companyExperienceRepository;
        this.companyEducationRepository = companyEducationRepository;
        this.companyMapper = companyMapper;
        this.candidateMapper = candidateMapper;
        this.candidateResumeRepository = candidateResumeRepository;
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
            /*CompanyUserEntity companyUserEntity= companyUserRepository.findById(postDto.getCompanyUserId()).orElse(null);
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
            companyJobPostEntity.setCompanyUserEntity(companyUserEntity);
            companyJobPostEntity = companyJobPostRepository.save(companyJobPostEntity);

            if (postDto.getCompanyExperienceList() != null){
                for(CompanyExperienceDto experienceDto:postDto.getCompanyExperienceList()){
                    CompanyExperience companyExperience = companyMapper.convertToCompanyExperience(experienceDto);
                    companyExperience.setJobPost(companyJobPostEntity);
                    companyExperienceRepository.save(companyExperience);
                }
            }
            if(postDto.getEducationQualificationList() != null){
                for (CompanyEducationQualificationDto educationDto:postDto.getEducationQualificationList()){
                    CompanyEducationQualification companyEducationQualificationEntity = companyMapper.convertToCompanyEducation(educationDto);
                    companyEducationQualificationEntity.setJobPost(companyJobPostEntity);
                    companyEducationRepository.save(companyEducationQualificationEntity);
                }
            }
*/
            CompanyUserEntity companyUserEntity= companyUserRepository.findById(postDto.getCompanyUserId()).orElse(null);
            CompanyJobPostEntity companyJobPostEntity= companyMapper.convertToCompanyJobPostEntity(postDto);
            companyJobPostEntity.setCompanyUserEntity(companyUserEntity);
            companyJobPostRepository.save(companyJobPostEntity);

            if (postDto.getCompanyExperienceList() != null){
                for(CompanyExperienceDto experienceDto:postDto.getCompanyExperienceList()){
                    CompanyExperience companyExperience = companyMapper.convertToCompanyExperience(experienceDto);
                    companyExperience.setJobPost(companyJobPostEntity);
                    companyExperienceRepository.save(companyExperience);
                }
            }

            if(postDto.getEducationQualificationList() != null) {
                for (CompanyEducationQualificationDto educationDto : postDto.getEducationQualificationList()) {
                    CompanyEducationQualification companyEducationQualificationEntity = companyMapper.convertToCompanyEducation(educationDto);
                    companyEducationQualificationEntity.setJobPost(companyJobPostEntity);
                    companyEducationRepository.save(companyEducationQualificationEntity);
                }
            }
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public List<ResumeDto> getResumeList() {
        try {
            return candidateResumeRepository.findAll().stream().map(
                    candidateMapper::convertToResumeDto).collect(Collectors.toList());
        }catch (Exception e){
            return null;
        }
    }

    @Override
    public List<PostDto> getPostedJob(Long id) {
        /*try {
            return companyJobPostRepository.findAllByCompanyUserEntityId(id).stream().map(
                    companyMapper::convertToPostDto).collect(Collectors.toList());
        }
        catch (Exception e){
            return null;
        }*/
        return null;
    }
}
