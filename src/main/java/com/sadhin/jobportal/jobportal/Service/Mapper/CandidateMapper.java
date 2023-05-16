package com.sadhin.jobportal.jobportal.Service.Mapper;

import com.sadhin.jobportal.jobportal.Dto.CandidateUserDto;
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

}

