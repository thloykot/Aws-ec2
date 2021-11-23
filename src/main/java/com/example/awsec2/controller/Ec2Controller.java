package com.example.awsec2.controller;

import com.amazonaws.services.ec2.model.StartInstancesResult;
import com.amazonaws.services.ec2.model.StopInstancesResult;
import com.example.awsec2.service.Ec2Service;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("instance")
public class Ec2Controller {
    private final Ec2Service ec2Service;

    @GetMapping("/stop/{id}")
    public ResponseEntity<StopInstancesResult> stopInstance(@PathVariable("id") String id) {
        return ResponseEntity.ok(ec2Service.stopInstance(id));
    }

    @GetMapping("/start/{id}")
    public ResponseEntity<StartInstancesResult> startInstance(@PathVariable("id") String id) {
        return ResponseEntity.ok(ec2Service.startInstance(id));
    }

    @GetMapping("/upload")
    public ResponseEntity<Void> upload() {
        ec2Service.uploadFile();
        return ResponseEntity.ok().build();
    }
}
