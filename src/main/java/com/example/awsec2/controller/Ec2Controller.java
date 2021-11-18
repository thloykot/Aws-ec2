package com.example.awsec2.controller;

import com.example.awsec2.service.Ec2Service;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("instance")
public class Ec2Controller {
    private final Ec2Service ec2Service;

    @GetMapping("/stop")
    public ResponseEntity<Void> stopInstance() {
        ec2Service.stopInstance();
        return ResponseEntity.ok().build();
    }

    @GetMapping("/start")
    public ResponseEntity<Void> startInstance() {
        ec2Service.startInstance();
        return ResponseEntity.ok().build();
    }
}
