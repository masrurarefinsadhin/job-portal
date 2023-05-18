package com.sadhin.jobportal.jobportal.Controller;

import com.sadhin.jobportal.jobportal.Dto.*;
import com.sadhin.jobportal.jobportal.Service.CompanyUserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:4200","http://localhost:35549"} )
@RequestMapping("/common/company")
public class CompanyUserController {
    private final CompanyUserService companyUserService;

    public CompanyUserController(CompanyUserService companyUserService) {
        this.companyUserService = companyUserService;
    }
    @GetMapping("")
    public ResponseEntity<Boolean> candidate(){
        return ResponseEntity.ok(true);
    }

    @PostMapping("/register")
    public ResponseEntity<Boolean> register(@RequestBody CompanyUserDto companyUserDto){
        try {
            boolean result = companyUserService.save(companyUserDto);
            return ResponseEntity.ok(result);
        } catch (Exception e) {
            return ResponseEntity.ok(false);
        }
    }
    @PostMapping("/login")
    public ResponseEntity<CompanyUserDto> login(@RequestBody LoginDto loginDto){
        try {
            CompanyUserDto companyUserDto = companyUserService.findByEmailAndPassword(loginDto.getEmail(), loginDto.getPassword());
            return ResponseEntity.ok().body(companyUserDto);
        } catch (Exception e) {
            return ResponseEntity.ok(null);
        }
    }

    @PostMapping ("/create-job-post")
    public ResponseEntity<Boolean> createPost(@RequestBody PostDto postDto){
        try {
            boolean result = companyUserService.createJobPost(postDto);
            return ResponseEntity.ok(result);
        } catch (Exception e) {
            return ResponseEntity.ok(false);
        }
    }

    @GetMapping ("/get-resume-list")
    public ResponseEntity<List<ResumeDto>> getResumeList(){
        try {
            List<ResumeDto> result = companyUserService.getResumeList();
            return ResponseEntity.ok(result);
        } catch (Exception e) {
            return ResponseEntity.ok(null);
        }
    }
    @GetMapping ("/get-posted-job/{id}")
    public ResponseEntity<List<PostDto>> getPostedJob(@PathVariable("id") Long id){
        try {
            List<PostDto> result = companyUserService.getPostedJob(id);
            return ResponseEntity.ok(result);
        } catch (Exception e) {
            return ResponseEntity.ok(null);
        }
    }

}
