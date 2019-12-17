package org.competition.mapper;

import org.competition.CompetitionServerApplication;
import org.competition.domain.News;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.Instant;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest(classes= CompetitionServerApplication.class)
@EnableAutoConfiguration
@MapperScan(basePackages ={"org.competition.mapper"})
public class NewsMapperTest {

    @Autowired
    private NewsMapper newsMapper;

    @Test
    public void test2(){
        News news1 = new News();
        news1.setTitle("111");
        news1.setContent("222");
        news1.setCreateUser("yjy");
        news1.setId(1);
        news1.setCreateTime(Date.from(Instant.now()));
        news1.setUpdateTime(Date.from(Instant.now()));
        news1.setUpdateUser("yjy");
        newsMapper.insert(news1);
    }




}