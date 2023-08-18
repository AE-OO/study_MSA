package com.example.study_msa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // 서버의 자격으로 등록
public class StudyMsaApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyMsaApplication.class, args);
    }

}
