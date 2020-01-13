package org.competition;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling//开启定时任务支持
@MapperScan(basePackages ={"org.competition.mapper"})
public class CompetitionServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CompetitionServerApplication.class, args);
    }
}
