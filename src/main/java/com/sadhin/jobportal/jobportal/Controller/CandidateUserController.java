package com.sadhin.jobportal.jobportal.Controller;

import com.sadhin.jobportal.jobportal.Dto.CandidateUserDto;
import com.sadhin.jobportal.jobportal.Dto.LoginDto;
import com.sadhin.jobportal.jobportal.Service.CandidateUserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
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
}
