package com.sadhin.jobportal.jobportal.Service;

import com.sadhin.jobportal.jobportal.Dto.CandidateUserDto;
import com.sadhin.jobportal.jobportal.Dto.PostDto;
import com.sadhin.jobportal.jobportal.Dto.ResumeDto;
import com.sadhin.jobportal.jobportal.Entity.CandidateResumeEntity;

import java.util.List;

public interface CandidateUserService {

    boolean save(CandidateUserDto candidateUserDto);

    CandidateUserDto findByEmailAndPassword(String email, String password);

    boolean createResume(ResumeDto resumeDto);

    List<PostDto> getJobList();



}
