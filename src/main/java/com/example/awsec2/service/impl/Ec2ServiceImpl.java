package com.example.awsec2.service.impl;

import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.model.StartInstancesRequest;
import com.amazonaws.services.ec2.model.StartInstancesResult;
import com.amazonaws.services.ec2.model.StopInstancesRequest;
import com.amazonaws.services.ec2.model.StopInstancesResult;
import com.example.awsec2.service.Ec2Service;
import com.example.awsec2.service.S3Service;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class Ec2ServiceImpl implements Ec2Service {

    private final AmazonEC2 amazonEC2;
    private final S3Service s3Service;

    @Override
    public StartInstancesResult startInstance(String id) {
        return amazonEC2.startInstances(
                new StartInstancesRequest(List.of(id))
        );
    }

    @Override
    public StopInstancesResult stopInstance(String id) {
        return amazonEC2.stopInstances(
                new StopInstancesRequest(List.of(id))
        );
    }

    @Override
    public void uploadFile() {
        amazonEC2.copy
        s3Service.uploadFile();
    }
}
