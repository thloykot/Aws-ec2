package com.example.awsec2.service.impl;

import com.amazonaws.services.s3.AmazonS3;
import com.example.awsec2.service.S3Service;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.File;


@Service
@RequiredArgsConstructor
public class S3ServiceImpl implements S3Service {

    private final AmazonS3 amazonS3;
    private final File file = new File("src/main/resources/geometry-app/Geometry.jar");
    private final String bucketName = "test-bucket-geo";

    @Override
    public void uploadFile() {
        amazonS3.putObject(bucketName, file.getName(), file);
        System.out.println("endpoint");
    }


}
