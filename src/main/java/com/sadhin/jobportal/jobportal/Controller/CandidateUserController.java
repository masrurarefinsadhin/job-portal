package com.sadhin.jobportal.jobportal.Controller;

import com.sadhin.jobportal.jobportal.Dto.*;
import com.sadhin.jobportal.jobportal.Service.CandidateUserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:4200","http://localhost:35549"} )
@RequestMapping("/common/candidate")
public class CandidateUserController {

    private final CandidateUserService candidateUserService;

    public CandidateUserController(CandidateUserService candidateUserService) {
        this.candidateUserService = candidateUserService;
    }

    @GetMapping("")
    public ResponseEntity<Boolean> candidate(){
        return ResponseEntity.ok(true);
    }

    @PostMapping("/register")
    public ResponseEntity<Boolean> register(@RequestBody CandidateUserDto candidateUserDto){
        try {
            boolean result = candidateUserService.save(candidateUserDto);
            return ResponseEntity.ok(result);
        } catch (Exception e) {
            return ResponseEntity.ok(false);
        }
    }
    @PostMapping("/login")
    public ResponseEntity<CandidateUserDto> login(@RequestBody LoginDto loginDto){
        try {
            CandidateUserDto candidateUserDto = candidateUserService.findByEmailAndPassword(loginDto.getEmail(), loginDto.getPassword());
            return ResponseEntity.ok().body(candidateUserDto);
        } catch (Exception e) {
            return ResponseEntity.ok(null);
        }
    }
    @PostMapping ("create-resume")
    public ResponseEntity<Boolean> createResume(@RequestBody ResumeDto resume){
        try {
            boolean result = candidateUserService.createResume(resume);
            return ResponseEntity.ok(result);
        } catch (Exception e) {
            return ResponseEntity.ok(false);
        }
    }
    @GetMapping ("/get-job-list")
    public ResponseEntity<List<PostDto>> getJobList(){
        try {
            List<PostDto> result = candidateUserService.getJobList();
            return ResponseEntity.ok(result);
        } catch (Exception e) {
            return ResponseEntity.ok(null);
        }
    }
    @GetMapping("/get-job-post-by-id/{id}")
    public ResponseEntity<PostDto> getJobPostById(@PathVariable("id") Long id){
        try {
            PostDto result = candidateUserService.getJobPostById(id).get();
            return ResponseEntity.ok(result);
        } catch (Exception e) {
            return ResponseEntity.ok(null);
        }
    }


}
