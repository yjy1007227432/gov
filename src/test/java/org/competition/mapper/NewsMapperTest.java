package org.competition.mapper;

import org.competition.CompetitionServerApplication;
import org.competition.dao.IdAndName;
import org.competition.dao.OrderPojo;
import org.competition.domain.News;
import org.competition.service.CustomerService;
import org.competition.service.NewsService;
import org.competition.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes= CompetitionServerApplication.class)
@EnableAutoConfiguration
@MapperScan(basePackages ={"org.competition.mapper"})
public class NewsMapperTest {

    @Autowired
    private NewsMapper newsMapper;

    @Autowired
    private CustomerMapper customerMapper;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private OrderService orderService;

    @Autowired
    private NewsService newsService;


//    @Test
//    public void test2(){
//        News news1 = new News();
//        news1.setTitle("111");
//        news1.setContent("222");
//        news1.setCreateUser("yjy");
//        news1.setId(1);
//        news1.setCreateTime(Date.from(Instant.now()));
//        news1.setUpdateTime(Date.from(Instant.now()));
//        news1.setUpdateUser("yjy");
//        newsMapper.insert(news1);
//    }

//    @Test
//    public void selectIdAndName() {
//        List<IdAndName> result = new ArrayList<>();
//        result = customerService.selectIdAndName();
//
//        System.out.println();
//    }

//    @Test
//    public void testDate(){
//        //完整格式
//        Date d = new Date();
//        SimpleDateFormat s1 = new SimpleDateFormat("YYYY-MM-dd HH:MM:ss");
//        System.out.println(s1.format(d));
//    }
//
//
//    @Test
//    public void test3(){
//        OrderPojo orderPojo = new OrderPojo();
//        orderPojo.setContact("111");
//        orderPojo.setContactEmail("111");
//        orderPojo.setContactPhone("111");
//        orderPojo.setCustomerId(111);
//        orderPojo.setFeedback("111");
//        orderPojo.setUpdateUser("yjy");
//        orderPojo.setContent("111");
//
//        orderService.insertOrder(orderPojo);
//    }

    @Test
    public void newsTest(){
     newsService.addNews("111","111","yjy");
    // newsService.updateNews("222","222","yjy",84);

     // newsService.deleteNewsById(82);
        List<News> news = newsService.ListNews();

    }




}