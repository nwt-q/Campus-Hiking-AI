package org.com.campushikingai;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.com.campushikingai.mapper")
@Slf4j
public class CampusHikingAiApplication {
    public static void main(String[] args) {
        SpringApplication.run(CampusHikingAiApplication.class, args);
    }
}
