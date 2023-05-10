package com.sadhin.jobportal.jobportal.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/common/candidate")
public class CandidateUserController {

    @GetMapping("/candidate")
    public ResponseEntity<Boolean> candidate(){
        return ResponseEntity.ok(true);
    }
}
