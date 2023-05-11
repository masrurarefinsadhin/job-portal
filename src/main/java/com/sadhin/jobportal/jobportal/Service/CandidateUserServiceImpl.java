package com.sadhin.jobportal.jobportal.Service;

import com.sadhin.jobportal.jobportal.Dto.CandidateUserDto;
import com.sadhin.jobportal.jobportal.Repository.CandidateUserRepository;
import com.sadhin.jobportal.jobportal.Service.Mapper.CandidateMapper;
import org.springframework.stereotype.Service;

@Service
public class CandidateUserServiceImpl implements CandidateUserService{
    private final CandidateUserRepository candidateUserRepository;

    private final CandidateMapper candidateMapper;
    public CandidateUserServiceImpl(CandidateUserRepository candidateUserRepository, CandidateMapper candidateMapper) {
        this.candidateUserRepository = candidateUserRepository;
        this.candidateMapper = candidateMapper;
    }

    @Override
    public boolean save(CandidateUserDto candidateUserDto) {
        try {
            candidateUserRepository.save(candidateMapper.convertToEntity(candidateUserDto));
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
}
