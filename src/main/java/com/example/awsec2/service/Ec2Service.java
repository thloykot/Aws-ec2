package com.example.awsec2.service;

import com.amazonaws.services.ec2.model.StartInstancesResult;
import com.amazonaws.services.ec2.model.StopInstancesResult;

public interface Ec2Service {

    StartInstancesResult startInstance(String id);

    StopInstancesResult stopInstance(String id);

    void uploadFile();
}
