package org.competition.mapper;

import org.competition.CompetitionServerApplication;
import org.competition.dao.*;
import org.competition.domain.*;
import org.competition.service.*;
import org.competition.utils.TimeParse;
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
    private UserService userService;

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
    private ResourcevpsService resourcevpsService;

    @Autowired
    private ResourceossService resourceossService;


    @Autowired
    private SolutionService solutionService;


    @Autowired
    private OrderTaskService orderTaskService;




    @Test
    public void selectIdAndName() {
//        orderTaskService.updateOrderTask(88,90,null,null,
//                null,null,null,null,null,null,null,null,null);

//        orderTaskService.deleteById(88);


       // List<OrderCustomer> orderCustomers = orderService.ListCustomer(81);
//      int result =  orderService.addOrder(111,"contact","111","111","111",
//                "111",11,"111","111","111","111","111","111","Wed Jul 22 2020 11:51:09 GMT+0800 (中国标准时间)"
//                ,"Wed Jul 22 2020 11:51:09 GMT+0800 (中国标准时间)");
//
//        orderService.deleteOrderById(126);

 //         List<OrderTaskResult> orderTaskResults =  orderTaskService.findList();
//        List<OrderCustomer> orderCustomers = orderService.ListCustomer(100);
//        orderTaskService.deleteById(104);
//        orderService.updateOrder(100,null,null,null,null,
//                null,null,100, 1111,"null",null,null,
//                "null","null","Wed Jul 22 2020 11:51:09 GMT+0800 (中国标准时间)","Wed Jul 22 2020 11:51:09 GMT+0800 (中国标准时间)");

//        List<OrderReport> orderReports = orderService.findOrderReport();
//        List<QuantityWeek> quantityWeeks = orderService.quantityWeek();
//        userService.updatePasswordById(108,"11111","1111","123456");
//
//        List<Resourceoss> resourceosses = resourceossService.select("回",null,
//                null);
//        List<OrderCustomer> orderCustomer = orderService.select(null,null,null,null,
//                null,null,null,null,"2020-07-22","2020-07-25");


        List<OrderTaskResult> orderTaskResults = orderTaskService.select(null,
                null,"回",null,null,
                null,null,null,null);

        System.out.println();
    }

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



}