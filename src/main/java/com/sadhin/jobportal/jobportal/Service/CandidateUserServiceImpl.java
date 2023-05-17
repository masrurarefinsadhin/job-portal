package com.sadhin.jobportal.jobportal.Service;

import com.sadhin.jobportal.jobportal.Dto.ApplyDto;
import com.sadhin.jobportal.jobportal.Dto.CandidateUserDto;
import com.sadhin.jobportal.jobportal.Dto.PostDto;
import com.sadhin.jobportal.jobportal.Dto.ResumeDto;
import com.sadhin.jobportal.jobportal.Entity.*;
import com.sadhin.jobportal.jobportal.Repository.*;
import com.sadhin.jobportal.jobportal.Service.Mapper.CandidateMapper;
import com.sadhin.jobportal.jobportal.Service.Mapper.CompanyMapper;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CandidateUserServiceImpl implements CandidateUserService{
    private final CandidateUserRepository candidateUserRepository;
    private final CandidateResumeRepository candidateResumeRepository;
    private final UserRepository userRepository;
    private final ApplyRepository applyRepository;
    private final CandidateMapper candidateMapper;
    private final CompanyMapper companyMapper;
    private final CompanyJobPostRepository jopPostRepository;
    public CandidateUserServiceImpl(CandidateUserRepository candidateUserRepository, CandidateResumeRepository candidateResumeRepository, UserRepository userRepository, ApplyRepository applyRepository, CandidateMapper candidateMapper, CompanyMapper companyMapper, CompanyJobPostRepository jopPostRepository) {
        this.candidateUserRepository = candidateUserRepository;
        this.candidateResumeRepository = candidateResumeRepository;
        this.userRepository = userRepository;
        this.applyRepository = applyRepository;
        this.candidateMapper = candidateMapper;
        this.companyMapper = companyMapper;
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


            Optional<CandidateResumeEntity> candidateResume = candidateResumeRepository.findByCandidateUserId(resumeDto.getCandidateUserId());
            //candidateResume.ifPresent(resumeEntity -> candidateResumeEntity.setId(resumeEntity.getId()));

            CandidateUserEntity candidateUserEntity= candidateUserRepository.findById(resumeDto.getCandidateUserId()).orElse(null);
            CandidateResumeEntity candidateResumeEntity= candidateMapper.convertToCandidateResumeEntity(resumeDto);

            candidateResume.ifPresent(resumeEntity -> candidateResumeEntity.setId(resumeEntity.getId()));
            //candidateResumeEntity.setId(candidateResume.get().getId());
            candidateResumeEntity.setCandidateUserEntity(candidateUserEntity);

            /*candidateResumeEntity.setFatherName(resumeDto.getFatherName());
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
            candidateResumeEntity.setSecondaryEmail(resumeDto.getSecondaryEmail());*/

            candidateResumeRepository.save(candidateResumeEntity);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<PostDto> getJobList() {
        try {
            /*List<PostDto> listOfPost= jopPostRepository.findAll().stream().map(entity->{
                PostDto postDto=new PostDto();
                postDto.setId(entity.getId());
                postDto.setJobTitle(entity.getJobTitle());
                postDto.setVacancy(entity.getVacancy());
                postDto.setRequiredSkill(entity.getRequiredSkill());
                postDto.setJobType(entity.getJobType());
                postDto.setDeadline(entity.getDeadline());
                postDto.setContext(entity.getContext());
                postDto.setJobResponsibility(entity.getJobResponsibility());
                postDto.setJobLevel(entity.getJobLevel());
                postDto.setJobLocation(entity.getJobLocation());
                postDto.setMaxSalary(entity.getMaxSalary());
                postDto.setMinSalary(entity.getMinSalary());
                postDto.setSalaryType(entity.getSalaryType());
                postDto.setLunchFacilityType(entity.getLunchFacilityType());
                postDto.setSalaryReview(entity.getSalaryReview());
                postDto.setNumberOfYearlyBonus(entity.getNumberOfYearlyBonus());
                postDto.setWorkplace(entity.getWorkplace());
                postDto.setGenderType(entity.getGenderType());
                postDto.setAgeMax(entity.getAgeMax());
                postDto.setAgeMin(entity.getAgeMin());
                postDto.setCompanyUserId(entity.getCompanyUserEntity().getId());
                if (entity.getCompanyExperienceList() !=null){
                    postDto.setCompanyExperienceList(entity.getCompanyExperienceList().stream().map(
                            companyMapper::convertToCompanyExperienceDto).collect(Collectors.toList()));
                }
                if(entity.getEducationQualificationList() != null){
                    postDto.setEducationQualificationList(entity.getEducationQualificationList().stream().map(
                            companyMapper::convertToCompanyEducationDto).collect(Collectors.toList()));

                }
                return postDto;
            }).collect(Collectors.toList());
            return listOfPost;
                */
            return jopPostRepository.findAll().stream().map(companyMapper::convertToPostDto).collect(Collectors.toList());

        }catch (Exception e){
         return null;
        }
    }

    @Override
    public Optional<PostDto> getJobPostById(Long id) {
        try {
            /*CompanyJobPostEntity companyJobPostEntity=jopPostRepository.findById(id).orElse(null);
            PostDto postDto=new PostDto();
            postDto.setId(companyJobPostEntity.getId());
            postDto.setJobTitle(companyJobPostEntity.getJobTitle());
            postDto.setVacancy(companyJobPostEntity.getVacancy());
            postDto.setRequiredSkill(companyJobPostEntity.getRequiredSkill());
            postDto.setJobType(companyJobPostEntity.getJobType());
            postDto.setDeadline(companyJobPostEntity.getDeadline());
            postDto.setContext(companyJobPostEntity.getContext());
            postDto.setJobResponsibility(companyJobPostEntity.getJobResponsibility());
            postDto.setJobLevel(companyJobPostEntity.getJobLevel());
            postDto.setJobLocation(companyJobPostEntity.getJobLocation());
            postDto.setMaxSalary(companyJobPostEntity.getMaxSalary());
            postDto.setMinSalary(companyJobPostEntity.getMinSalary());
            postDto.setSalaryType(companyJobPostEntity.getSalaryType());
            postDto.setLunchFacilityType(companyJobPostEntity.getLunchFacilityType());
            postDto.setSalaryReview(companyJobPostEntity.getSalaryReview());
            postDto.setNumberOfYearlyBonus(companyJobPostEntity.getNumberOfYearlyBonus());
            postDto.setWorkplace(companyJobPostEntity.getWorkplace());
            postDto.setGenderType(companyJobPostEntity.getGenderType());
            postDto.setAgeMax(companyJobPostEntity.getAgeMax());
            postDto.setAgeMin(companyJobPostEntity.getAgeMin());
            postDto.setCompanyUserId(companyJobPostEntity.getCompanyUserEntity().getId());
            if (companyJobPostEntity.getEducationQualificationList() !=null){
                postDto.setCompanyExperienceList(companyJobPostEntity.getCompanyExperienceList().stream().map(
                        companyMapper::convertToCompanyExperienceDto).collect(Collectors.toList()));
            }
            if(companyJobPostEntity.getCompanyExperienceList() !=null){
                postDto.setEducationQualificationList(companyJobPostEntity.getEducationQualificationList().stream().map(
                        companyMapper::convertToCompanyEducationDto).collect(Collectors.toList()));
            }
            return Optional.of(postDto);*/
            CompanyJobPostEntity companyJobPostEntity=jopPostRepository.findById(id).orElse(null);
            PostDto postDto=companyMapper.convertToPostDto(companyJobPostEntity);
            postDto.setCompanyUserId(companyJobPostEntity.getCompanyUserEntity().getId());
            return Optional.of(postDto);
        }
        catch (Exception e){
            return Optional.empty();
        }
    }

    @Override
    public boolean applyForJob(ApplyDto applyDto) {
        try {
            CandidateUserEntity candidateUserEntity=candidateUserRepository.findById(applyDto.getCandidateUserId()).orElse(null);
            if (candidateUserEntity==null){
                return false;
            }
            CandidateResumeEntity candidateResumeEntity=candidateResumeRepository.findByCandidateUserId(candidateUserEntity.getId()).orElse(null);
            if (candidateResumeEntity==null){
                return false;
            }
            CompanyJobPostEntity companyJobPostEntity=jopPostRepository.findById(applyDto.getJobPostId()).orElse(null);
            ApplyEntity applyEntity=new ApplyEntity();
            applyEntity.setCandidateResume(candidateResumeEntity);
            applyEntity.setJobPost(companyJobPostEntity);
            applyEntity.setAppliedAt(Instant.now());
            applyRepository.save(applyEntity);
            return true;
        }catch (Exception e){
            return false;
        }
    }


}
