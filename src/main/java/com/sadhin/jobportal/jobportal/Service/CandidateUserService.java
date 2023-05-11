package com.sadhin.jobportal.jobportal.Service;

import com.sadhin.jobportal.jobportal.Dto.CandidateUserDto;

public interface CandidateUserService {

    boolean save(CandidateUserDto candidateUserDto);

    CandidateUserDto findByEmailAndPassword(String email, String password);



}
