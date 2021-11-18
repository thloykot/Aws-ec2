package com.example.awsec2.service.impl;

import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.model.Instance;
import com.amazonaws.services.ec2.model.StartInstancesRequest;
import com.amazonaws.services.ec2.model.StopInstancesRequest;
import com.example.awsec2.service.Ec2Service;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class Ec2ServiceImpl implements Ec2Service {

    private final AmazonEC2 amazonEC2;

    @Override
    public void startInstance() {
        StartInstancesRequest request = new StartInstancesRequest(List.of("i-060ddbed9b4867cb9"));
        amazonEC2.startInstances(request);
    }

    @Override
    public void stopInstance() {
        StopInstancesRequest request = new StopInstancesRequest(List.of(""));
        amazonEC2.stopInstances(request);
    }
}
