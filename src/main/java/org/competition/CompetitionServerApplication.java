package org.competition;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableScheduling//开启定时任务支持
public class CompetitionServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CompetitionServerApplication.class, args);
    }
}
