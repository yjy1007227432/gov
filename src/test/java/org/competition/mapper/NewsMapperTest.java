package org.competition.mapper;

import org.competition.CompetitionServerApplication;
import org.competition.dao.IdAndName;
import org.competition.dao.OrderPojo;
import org.competition.domain.News;
import org.competition.domain.Order;
import org.competition.domain.Solution;
import org.competition.domain.User;
import org.competition.service.*;
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

    @Autowired
    private UserService userService;

    @Autowired
    private ResourcevpsService resourcevpsService;


    @Autowired
    private SolutionService solutionService;




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
        userService.addUser("1","1","yjy","123","123","1");
    }




}