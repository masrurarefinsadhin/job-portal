package com.sadhin.jobportal.jobportal.Service.Mapper;

import com.sadhin.jobportal.jobportal.Dto.CandidateEducationDto;
import com.sadhin.jobportal.jobportal.Dto.CandidateExperienceDto;
import com.sadhin.jobportal.jobportal.Dto.CandidateUserDto;
import com.sadhin.jobportal.jobportal.Dto.ResumeDto;
import com.sadhin.jobportal.jobportal.Entity.*;
import com.sadhin.jobportal.jobportal.Repository.UserRepository;
import net.bytebuddy.pool.TypePool;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.stream.Collectors;

@Service
public class CandidateMapper {
    private final UserRepository userRepository;

    public CandidateMapper(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public CandidateUserDto convertToDto(CandidateUserEntity candidateUser) {
        if (candidateUser == null) {
            return null;
        }

        CandidateUserDto candidateUserDto = new CandidateUserDto();
        candidateUserDto.setCandidateId(candidateUser.getId());
        candidateUserDto.setUserId(candidateUser.getUserEntity().getId());
        candidateUserDto.setFirstName(candidateUser.getFirstName());
        candidateUserDto.setLastName(candidateUser.getLastName());
        candidateUserDto.setPrimaryEmail(candidateUser.getUserEntity().getPrimaryEmail());
        candidateUserDto.setPassword(candidateUser.getUserEntity().getPassword());
        candidateUserDto.setPrimaryContactNumber(candidateUser.getUserEntity().getPrimaryContactNumber());
        candidateUserDto.setCratedAt(candidateUser.getUserEntity().getCratedAt());
        candidateUserDto.setUpdatedAt(candidateUser.getUserEntity().getUpdatedAt());
        candidateUserDto.setGenderType(candidateUser.getGenderType());
        candidateUserDto.setUserType(candidateUser.getUserEntity().getUserType());
        candidateUserDto.setSkillType(candidateUser.getSkillType());

        return candidateUserDto;
    }
    public CandidateUserEntity convertToEntity(CandidateUserDto candidateUserDto) {
        if (candidateUserDto == null) {
            return null;
        }
        CandidateUserEntity candidateUserEntity = new CandidateUserEntity();
        candidateUserEntity.setId(candidateUserDto.getCandidateId());
        candidateUserEntity.setFirstName(candidateUserDto.getFirstName());
        candidateUserEntity.setLastName(candidateUserDto.getLastName());
        candidateUserEntity.setGenderType(candidateUserDto.getGenderType());
        candidateUserEntity.setSkillType(candidateUserDto.getSkillType());
        UserEntity userEntity = new UserEntity();
        userEntity.setPrimaryEmail(candidateUserDto.getPrimaryEmail());
        userEntity.setPassword(candidateUserDto.getPassword());
        userEntity.setPreviousPassword(candidateUserDto.getPreviousPassword());
        userEntity.setPrimaryContactNumber(candidateUserDto.getPrimaryContactNumber());
        userEntity.setCratedAt(candidateUserDto.getCratedAt());
        userEntity.setUpdatedAt(candidateUserDto.getUpdatedAt());
        userEntity.setUserType(candidateUserDto.getUserType());
        candidateUserEntity.setUserEntity(userEntity);
        return candidateUserEntity;
    }
    public CandidateEducationDto convertToCandidateEducationDto (CandidateEducationEntity educationEntity){
        CandidateEducationDto educationDto = new CandidateEducationDto();
        educationDto.setId(educationEntity.getId());
        educationDto.setDegreeName(educationEntity.getDegreeName());
        educationDto.setDegreeType(educationEntity.getDegreeType());
        educationDto.setInstituteName(educationEntity.getInstituteName());
        educationDto.setInstituteAddress(educationEntity.getInstituteAddress());
        educationDto.setBoardName(educationEntity.getBoardName());
        educationDto.setStartDate(educationEntity.getStartDate());
        educationDto.setEndDate(educationEntity.getEndDate());
        educationDto.setMaxGrade(educationEntity.getMaxGrade());
        educationDto.setAchievedGrade(educationEntity.getAchievedGrade());
        educationDto.setDescription(educationEntity.getDescription());
        educationDto.setMajorSubject(educationEntity.getMajorSubject());
        return educationDto;
    }
    public CandidateEducationEntity convertToCandidateEducationEntity (CandidateEducationDto educationDto){
        CandidateEducationEntity educationEntity = new CandidateEducationEntity();
        educationEntity.setId(educationDto.getId());
        educationEntity.setDegreeName(educationDto.getDegreeName());
        educationEntity.setDegreeType(educationDto.getDegreeType());
        educationEntity.setInstituteName(educationDto.getInstituteName());
        educationEntity.setInstituteAddress(educationDto.getInstituteAddress());
        educationEntity.setBoardName(educationDto.getBoardName());
        educationEntity.setStartDate(educationDto.getStartDate());
        educationEntity.setEndDate(educationDto.getEndDate());
        educationEntity.setMaxGrade(educationDto.getMaxGrade());
        educationEntity.setAchievedGrade(educationDto.getAchievedGrade());
        educationEntity.setDescription(educationDto.getDescription());
        educationEntity.setMajorSubject(educationDto.getMajorSubject());
        return educationEntity;
    }
    public CandidateExperienceEntity convertToCandidateExperienceEntity (CandidateExperienceDto experienceDto){
        CandidateExperienceEntity experienceEntity = new CandidateExperienceEntity();
        experienceEntity.setId(experienceDto.getId());
        experienceEntity.setExperienceType(experienceDto.getExperienceType());
        experienceEntity.setExperienceTitle(experienceDto.getExperienceTitle());
        experienceEntity.setCompanyName(experienceDto.getCompanyName());
        experienceEntity.setDesignation(experienceDto.getDesignation());
        experienceEntity.setStartDate(experienceDto.getStartDate());
        experienceEntity.setEndDate(experienceDto.getEndDate());
        experienceEntity.setDescription(experienceDto.getDescription());
        return experienceEntity;
    }
    public CandidateExperienceDto convertToCandidateExperienceDto(CandidateExperienceEntity experienceEntity){
        CandidateExperienceDto experienceDto = new CandidateExperienceDto();
        experienceDto.setId(experienceEntity.getId());
        experienceDto.setExperienceType(experienceEntity.getExperienceType());
        experienceDto.setExperienceTitle(experienceEntity.getExperienceTitle());
        experienceDto.setCompanyName(experienceEntity.getCompanyName());
        experienceDto.setDesignation(experienceEntity.getDesignation());
        experienceDto.setStartDate(experienceEntity.getStartDate());
        experienceDto.setEndDate(experienceEntity.getEndDate());
        experienceDto.setDescription(experienceEntity.getDescription());
        return experienceDto;
    }
    public  CandidateResumeEntity convertToCandidateResumeEntity(ResumeDto resumeDto) {
        CandidateResumeEntity resumeEntity = new CandidateResumeEntity();
        resumeEntity.setId(resumeDto.getId());
        resumeEntity.setFatherName(resumeDto.getFatherName());
        resumeEntity.setMotherName(resumeDto.getMotherName());
        resumeEntity.setPresentAddress(resumeDto.getPresentAddress());
        resumeEntity.setPermanentAddress(resumeDto.getPermanentAddress());
        resumeEntity.setDateOfBirth(resumeDto.getDateOfBirth());
        resumeEntity.setNationalityType(resumeDto.getNationalityType());
        resumeEntity.setNationalIdNumber(resumeDto.getNationalIdNumber());
        resumeEntity.setReligionType(resumeDto.getReligionType());
        resumeEntity.setMaritalStatus(resumeDto.getMaritalStatus());
        resumeEntity.setSecondaryContactNumber(resumeDto.getSecondaryContactNumber());
        resumeEntity.setBloodGroup(resumeDto.getBloodGroup());
        resumeEntity.setSecondaryEmail(resumeDto.getSecondaryEmail());
        //resumeEntity.setEducationList(resumeDto.getEducationList());
        //resumeEntity.setExperienceList(resumeDto.getExperienceList());
        resumeEntity.setEducationList(null);
        resumeEntity.setExperienceList(null);
        return resumeEntity;
    }
    public  ResumeDto convertToResumeDto(CandidateResumeEntity resumeEntity) {
        ResumeDto resumeDto = new ResumeDto();
        resumeDto.setId(resumeEntity.getId());
        resumeDto.setFatherName(resumeEntity.getFatherName());
        resumeDto.setMotherName(resumeEntity.getMotherName());
        resumeDto.setPresentAddress(resumeEntity.getPresentAddress());
        resumeDto.setPermanentAddress(resumeEntity.getPermanentAddress());
        resumeDto.setDateOfBirth(resumeEntity.getDateOfBirth());
        resumeDto.setNationalityType(resumeEntity.getNationalityType());
        resumeDto.setNationalIdNumber(resumeEntity.getNationalIdNumber());
        resumeDto.setReligionType(resumeEntity.getReligionType());
        resumeDto.setMaritalStatus(resumeEntity.getMaritalStatus());
        resumeDto.setSecondaryContactNumber(resumeEntity.getSecondaryContactNumber());
        resumeDto.setBloodGroup(resumeEntity.getBloodGroup());
        resumeDto.setSecondaryEmail(resumeEntity.getSecondaryEmail());
        if (resumeEntity.getEducationList()!=null){
            resumeDto.setEducationList(resumeEntity.getEducationList()
                    .stream().map(this::convertToCandidateEducationDto).collect(Collectors.toList()));
        }
        if (resumeEntity.getExperienceList()!=null){
            resumeDto.setExperienceList(resumeEntity.getExperienceList()
                    .stream().map(this::convertToCandidateExperienceDto).collect(Collectors.toList()));
        }
        resumeDto.setCandidateUserId(resumeEntity.getCandidateUserEntity().getId());
        return resumeDto;
    }




}

