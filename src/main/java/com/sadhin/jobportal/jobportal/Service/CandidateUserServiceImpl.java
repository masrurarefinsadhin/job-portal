package com.sadhin.jobportal.jobportal.Service;

import com.sadhin.jobportal.jobportal.Dto.CandidateUserDto;
import com.sadhin.jobportal.jobportal.Dto.PostDto;
import com.sadhin.jobportal.jobportal.Dto.ResumeDto;
import com.sadhin.jobportal.jobportal.Entity.CandidateResumeEntity;
import com.sadhin.jobportal.jobportal.Entity.CandidateUserEntity;
import com.sadhin.jobportal.jobportal.Entity.UserEntity;
import com.sadhin.jobportal.jobportal.Repository.CandidateResumeRepository;
import com.sadhin.jobportal.jobportal.Repository.CandidateUserRepository;
import com.sadhin.jobportal.jobportal.Repository.CompanyJobPostRepository;
import com.sadhin.jobportal.jobportal.Repository.UserRepository;
import com.sadhin.jobportal.jobportal.Service.Mapper.CandidateMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CandidateUserServiceImpl implements CandidateUserService{
    private final CandidateUserRepository candidateUserRepository;
    private final CandidateResumeRepository candidateResumeRepository;
    private final UserRepository userRepository;
    private final CandidateMapper candidateMapper;

    private final CompanyJobPostRepository jopPostRepository;
    public CandidateUserServiceImpl(CandidateUserRepository candidateUserRepository, CandidateResumeRepository candidateResumeRepository, UserRepository userRepository, CandidateMapper candidateMapper, CompanyJobPostRepository jopPostRepository) {
        this.candidateUserRepository = candidateUserRepository;
        this.candidateResumeRepository = candidateResumeRepository;
        this.userRepository = userRepository;
        this.candidateMapper = candidateMapper;
        this.jopPostRepository = jopPostRepository;
    }

    @Override
    public boolean save(CandidateUserDto candidateUserDto) {
        try {
            CandidateUserEntity candidateUserEntity=candidateMapper.convertToEntity(candidateUserDto);
            UserEntity userEntity =userRepository.save(candidateUserEntity.getUserEntity());
            candidateUserEntity.setUserEntity(userEntity);
            candidateUserRepository.save(candidateUserEntity);
            return true;
        } catch (Exception e) {
            return false;
        }
    }


    @Override
    public CandidateUserDto findByEmailAndPassword(String email, String password){
        return candidateUserRepository.findByEmailAndPassword(email, password)
                .map(candidateMapper::convertToDto)
                .orElse(null);
    }

    @Override
    public boolean createResume(ResumeDto resumeDto) {
        try {
            CandidateUserEntity candidateUserEntity= candidateUserRepository.findById(resumeDto.getCandidateUserId()).orElse(null);
            CandidateResumeEntity candidateResumeEntity=new CandidateResumeEntity();
            candidateResumeEntity.setCandidateUserEntity(candidateUserEntity);
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
            candidateResumeEntity.setBloodGroup(resumeDto.getBloodGroup());
            candidateResumeEntity.setBloodGroup(resumeDto.getBloodGroup());
            candidateResumeEntity.setSecondaryEmail(resumeDto.getSecondaryEmail());
            candidateResumeRepository.save(candidateResumeEntity);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<PostDto> getJobList() {
        try {
            return jopPostRepository.findAll().stream().map(i->{
                PostDto postDto=new PostDto();
                postDto.setId(i.getId());
                postDto.setJobTitle(i.getJobTitle());
                postDto.setVacancy(i.getVacancy());
                postDto.setRequiredSkill(i.getRequiredSkill());
                postDto.setJobType(i.getJobType());
                postDto.setDeadline(i.getDeadline());
                postDto.setContext(i.getContext());
                postDto.setJobResponsibility(i.getJobResponsibility());
                postDto.setJobLevel(i.getJobLevel());
                postDto.setJobLocation(i.getJobLocation());
                postDto.setMaxSalary(i.getMaxSalary());
                postDto.setMinSalary(i.getMinSalary());
                postDto.setSalaryType(i.getSalaryType());
                postDto.setLunchFacilityType(i.getLunchFacilityType());
                postDto.setSalaryReview(i.getSalaryReview());
                postDto.setNumberOfYearlyBonus(i.getNumberOfYearlyBonus());
                postDto.setWorkplace(i.getWorkplace());
                postDto.setGenderType(i.getGenderType());
                postDto.setAgeMax(i.getAgeMax());
                postDto.setAgeMin(i.getAgeMin());
                postDto.setCompanyUserId(i.getCompanyUserEntity().getId());
                return postDto;
            }).collect(Collectors.toList());
        }catch (Exception e){
         return null;
        }
    }


}
