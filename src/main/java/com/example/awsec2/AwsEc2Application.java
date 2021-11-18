package com.example.awsec2;

import com.amazonaws.auth.EnvironmentVariableCredentialsProvider;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.AmazonEC2Client;
import com.example.awsec2.service.Ec2Service;
import com.example.awsec2.service.impl.Ec2ServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AwsEc2Application {

    @Bean
    EnvironmentVariableCredentialsProvider credentialsProvider(){
        return new EnvironmentVariableCredentialsProvider();
    }

    @Bean
    AmazonEC2 amazonEC2() {
        return AmazonEC2Client.builder().withRegion(Regions.US_EAST_1)
                .withCredentials(credentialsProvider()).build();
    }

    public static void main(String[] args) {
        SpringApplication.run(AwsEc2Application.class, args);

    }

}
