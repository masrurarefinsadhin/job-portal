package com.sadhin.jobportal.jobportal.Service.Mapper;

import com.sadhin.jobportal.jobportal.Dto.CandidateEducationDto;
import com.sadhin.jobportal.jobportal.Dto.CandidateExperienceDto;
import com.sadhin.jobportal.jobportal.Dto.CandidateUserDto;
import com.sadhin.jobportal.jobportal.Entity.CandidateEducationEntity;
import com.sadhin.jobportal.jobportal.Entity.CandidateExperienceEntity;
import com.sadhin.jobportal.jobportal.Entity.CandidateUserEntity;
import com.sadhin.jobportal.jobportal.Entity.UserEntity;
import com.sadhin.jobportal.jobportal.Repository.UserRepository;
import org.springframework.stereotype.Service;

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

}

