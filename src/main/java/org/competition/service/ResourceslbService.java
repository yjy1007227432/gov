package org.competition.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.competition.domain.*;
import org.competition.mapper.ResourceslbMapper;
import org.competition.mapper.ResourcevpsMapper;
import org.competition.utils.Stringstr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.expression.Strings;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.*;
import java.util.stream.Collectors;


@Component
@RestController
@RequestMapping({"/gov/resourceslb"})
@CrossOrigin(allowCredentials = "true", allowedHeaders = {"*"})
public class ResourceslbService {

    @Autowired
    private ResourceslbMapper resourceslbMapper;

    public static final Logger LOGGER = LogManager.getLogger(ResourceslbService.class);


    @RequestMapping({"/add"})
    public int addResourceslb(String name,
                              @RequestParam(value = "order_id", required = false) Integer orderId,
                              @RequestParam(required = false) Integer type,
                              @RequestParam(required = false) Integer network,
                              @RequestParam(required = false) String ipaddress,
                              @RequestParam(required = false) String port,
                              @RequestParam(required = false) Integer quantity,
                              @RequestParam(required = false) String backup,
                              @RequestParam(required = false) String backup1,
                              @RequestParam(required = false) String backup2,
                              @RequestParam(value = "create_user", required = false) String createUser
    ) {
        Resourceslb resourceslb = (new Resourceslb()).setName(name).setOrderId(orderId)
                .setType(type).setIpaddress(ipaddress).setPort(port)
                .setNetwork(network).setQuantity(quantity).setBackup(backup).setBackup1(backup1)
                .setBackup2(backup2).setCreateUser(createUser).setCreateTime(Date.from(Instant.now()));
        int result = 0;
        try {
            result = this.resourceslbMapper.insert(resourceslb);
        } catch (Exception e) {
            LOGGER.error("resourceslbMapper.insert 插入数据失败", e);
        }
        return result;
    }

    @RequestMapping({"/delete"})
    public int deleteSlbById(int id) {
        int result = 0;
        try {
            result = this.resourceslbMapper.deleteByPrimaryKey(Integer.valueOf(id));
        } catch (Exception e) {
            LOGGER.error("resourceslbMapper.deleteByPrimaryKey 删除数据失败", e);
        }
        if (Objects.equals(Integer.valueOf(result), Integer.valueOf(0))) {
            LOGGER.error("无法删除不存在的数据");
        }
        return result;
    }

    @RequestMapping({"/find"})
    public Resourceslb findById(int id) {
        Resourceslb resourceslb = null;
        try {
            resourceslb = this.resourceslbMapper.selectByPrimaryKey(Integer.valueOf(id));
        } catch (Exception e) {
            LOGGER.error("resourcerdsMapper.selectByPrimaryKey 查询数据失败", e);
        }
        if (Objects.equals(resourceslb, null)) {
            LOGGER.error("查询结果为空");
        }
        return resourceslb;
    }


    @RequestMapping({"/findlist"})
    public List<Resourceslb> findByOrderId(int order_id) {
        List<Resourceslb> resourceslbs = new ArrayList<>();
        Resourceslb resourceslb = new Resourceslb().setOrderId(order_id);
        try {
            resourceslbs = this.resourceslbMapper.selectByResourceslb(resourceslb);
        } catch (Exception e) {
            LOGGER.error("resourceslbMapper.selectByResourceslb 查询数据失败", e);
        }
        if (Objects.equals(resourceslbs, null)) {
            LOGGER.error("查询结果为空");
        }
        return resourceslbs;
    }

    @RequestMapping({"/update"})
    public int update(Integer id,
                      @RequestParam(required = false) String name,
                      @RequestParam(value = "order_id", required = false) Integer orderId,
                      @RequestParam(value = "update_user", required = false) String updateUser,
                      @RequestParam(required = false) Integer type,
                      @RequestParam(required = false) Integer network,
                      @RequestParam(required = false) String ipaddress,
                      @RequestParam(required = false) String port,
                      @RequestParam(required = false) Integer quantity,
                      @RequestParam(required = false) String backup,
                      @RequestParam(required = false) String backup1,
                      @RequestParam(required = false) String backup2
    ) {
        Resourceslb resourceslb = new Resourceslb().setId(id).setName(name).setOrderId(orderId).
                setUpdateTime(Date.from(Instant.now())).setUpdateUser(updateUser)
                .setType(type).setNetwork(network).setIpaddress(ipaddress).setPort(port)
                .setNetwork(network).setQuantity(quantity).setBackup(backup).setBackup1(backup1)
                .setBackup2(backup2);
        int result = 0;
        try {
            result = this.resourceslbMapper.updateByPrimaryKeySelective(resourceslb);
        } catch (Exception e) {
            LOGGER.error("resourceslbMapper.updateByPrimaryKeySelective 更新数据失败", e);
        }
        if (Objects.equals(Integer.valueOf(result), Integer.valueOf(0))) {
            LOGGER.error("无法查询到需要更新的数据");
        }
        return result;
    }


    @RequestMapping({"/count"})
    public Integer count(int order_id) {

        int result = 0;
        Resourceslb resourceslb = new Resourceslb().setOrderId(order_id);
        try {
            result = this.resourceslbMapper.countByExample(resourceslb);
        } catch (Exception e) {
            LOGGER.error("resourceslbMapper.countByExample 查询数据失败", e);
        }
        return result;
    }

    @RequestMapping({"/deletebyorderid"})
    public Integer delete(int order_id) {
        ResourceslbExample example = new ResourceslbExample();
        example.createCriteria().andOrderIdEqualTo(order_id);
        int result = 0;
        try {
            result = this.resourceslbMapper.deleteByExample(example);
        } catch (Exception e) {
            LOGGER.error("resourceslbMapper.deleteByExample 删除数据失败", e);
        }
        return result;
    }
    public List<Integer> findslbIdByName(String name) {
        List<Resourceslb> resourceslbes = null;
        try {
            ResourceslbExample example = new ResourceslbExample();
            ResourceslbExample.Criteria criteria = example.createCriteria();
            criteria.andNameLike(Stringstr.parse(name));
            resourceslbes = this.resourceslbMapper.selectByExample(example);
        } catch (Exception e) {
            LOGGER.error("resourceslbMapper.selectByExample查询数据失败", e);
        }
        if (Objects.equals(resourceslbes, null)) {
            LOGGER.error("查询结果为空");
        }
        return resourceslbes.stream().map(Resourceslb::getId).collect(Collectors.toList());
    }


    public List<Resourceslb> findAll() {
        return resourceslbMapper.selectByExample(null);
    }

    @RequestMapping({"/select"})
    public List<Resourceslb> select(@RequestParam(required = false) String name,
                                    @RequestParam(required = false) String startTime,
                                    @RequestParam(required = false) Integer type,
                                    @RequestParam(required = false) Integer network,
                                    @RequestParam(required = false) String ipaddress,
                                    @RequestParam(required = false) String port,
                                    @RequestParam(required = false) String endTime) {

        Date beforedate = null;
        Date afterDate = null;

        if (startTime != null && endTime != null) {
            startTime += " 00:00:00";
            endTime += " 23:59:59";


            try {
                beforedate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(startTime);
                afterDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(endTime);
            } catch (ParseException e) {
                LOGGER.error("日期转化错误");
            }

        }


        ResourceslbExample example = new ResourceslbExample();
        ResourceslbExample.Criteria criteria = example.createCriteria();

        if (name != null) {
            criteria.andNameLike(Stringstr.parse(name));
        }
        if (type != null) {
            criteria.andTypeEqualTo(type);
        }
        if(startTime != null && endTime != null) {
            criteria.andUpdateTimeBetween(beforedate, afterDate);
        }
        if(network!=null){
            criteria.andNetworkEqualTo(network);
        }
        if(ipaddress!=null) {
            criteria.andIpaddressLike(Stringstr.parse(ipaddress));
        }
        if(port!=null) {
            criteria.andPortLike(Stringstr.parse(port));
        }

        List<Resourceslb> resourceslbes = resourceslbMapper.selectByExample(example);
        return resourceslbes;
    }


}
