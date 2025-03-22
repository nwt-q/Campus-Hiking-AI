package org.com.campushikingai;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("org.com.campushikingai.mapper")
public class CampusHikingAiApplication {
    public static void main(String[] args) {
        SpringApplication.run(CampusHikingAiApplication.class, args);
    }
}
