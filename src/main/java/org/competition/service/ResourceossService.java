package org.competition.service;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.competition.domain.*;
import org.competition.mapper.ResourceossMapper;
import org.competition.mapper.ResourcerdsMapper;
import org.competition.mapper.ResourcevpsMapper;
import org.competition.utils.Stringstr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.*;
import java.util.stream.Collectors;

@Component
@RestController
@RequestMapping({"/gov/resourceoss"})
@CrossOrigin(allowCredentials = "true", allowedHeaders = {"*"})
public class ResourceossService {

    @Autowired
    private ResourceossMapper resourceossMapper;

    public static final Logger LOGGER = LogManager.getLogger(ResourceossService.class);

    @RequestMapping({"/add"})
    public int addResourceoss(String name,
                              @RequestParam(value = "order_id", required = false) Integer orderId,
                              @RequestParam(required = false) Integer size,
                              @RequestParam(required = false) Integer quantity,
                              @RequestParam(required = false) String backup,
                              @RequestParam(required = false) String backup1,
                              @RequestParam(required = false) String backup2,
                              @RequestParam(value = "create_user", required = false) String createUser
    ) {
        Resourceoss resourceoss = (new Resourceoss()).setName(name).setOrderId(orderId)
                .setSize(size).setQuantity(quantity).setBackup(backup).setBackup1(backup1)
                .setBackup2(backup2).setCreateUser(createUser).setCreateTime(Date.from(Instant.now()));
        int result = 0;
        try {
            result = this.resourceossMapper.insert(resourceoss);
        } catch (Exception e) {
            LOGGER.error("resourceossMapper.insert 插入数据失败", e);
        }
        return result;
    }


    @RequestMapping({"/delete"})
    public int deleteOssById(int id) {
        int result = 0;
        try {
            result = this.resourceossMapper.deleteByPrimaryKey(Integer.valueOf(id));
        } catch (Exception e) {
            LOGGER.error("dictvalueMapper.deleteByPrimaryKey 删除数据失败", e);
        }
        if (Objects.equals(Integer.valueOf(result), Integer.valueOf(0))) {
            LOGGER.error("无法删除不存在的数据");
        }
        return result;
    }


    @RequestMapping({"/find"})
    public Resourceoss findById(int id) {
        Resourceoss resourceoss = null;
        try {
            resourceoss = this.resourceossMapper.selectByPrimaryKey(Integer.valueOf(id));
        } catch (Exception e) {
            LOGGER.error("resourceossMapper.selectByPrimaryKey 查询数据失败", e);
        }
        if (Objects.equals(resourceoss, null)) {
            LOGGER.error("查询结果为空");
        }
        return resourceoss;
    }


    @RequestMapping({"/findlist"})
    public List<Resourceoss> findByOrderId(int order_id) {
        List<Resourceoss> resourceosses = new ArrayList<>();
        Resourceoss resourceoss = new Resourceoss().setOrderId(order_id);
        try {
            resourceosses = this.resourceossMapper.selectByResourceoss(resourceoss);
        } catch (Exception e) {
            LOGGER.error("resourceossMapper.selectByResourceoss 查询数据失败", e);
        }
        if (Objects.equals(resourceosses, null)) {
            LOGGER.error("查询结果为空");
        }
        return resourceosses;
    }

    public List<Integer> findOssIdByName(String name) {
        List<Resourceoss> resourceosses = null;
        try {
            ResourceossExample example = new ResourceossExample();
            ResourceossExample.Criteria criteria = example.createCriteria();
            criteria.andNameLike(Stringstr.parse(name));
            resourceosses = this.resourceossMapper.selectByExample(example);
        } catch (Exception e) {
            LOGGER.error("resourceossMapper.selectByExample查询数据失败", e);
        }
        if (Objects.equals(resourceosses, null)) {
            LOGGER.error("查询结果为空");
        }
        return resourceosses.stream().map(Resourceoss::getId).collect(Collectors.toList());
    }


    @RequestMapping({"/update"})
    public int update(Integer id,
                      @RequestParam(required = false) String name,
                      @RequestParam(value = "order_id", required = false) Integer orderId,
                      @RequestParam(value = "update_user", required = false) String updateUser,
                      @RequestParam(required = false) Integer size,
                      @RequestParam(required = false) Integer quantity,
                      @RequestParam(required = false) String backup,
                      @RequestParam(required = false) String backup1,
                      @RequestParam(required = false) String backup2
    ) {
        Resourceoss resourceoss = new Resourceoss().setId(id).setName(name).setOrderId(orderId).
                setUpdateTime(Date.from(Instant.now())).setUpdateUser(updateUser)
                .setSize(size).setQuantity(quantity).setBackup(backup).setBackup1(backup1)
                .setBackup2(backup2);
        int result = 0;
        try {
            result = this.resourceossMapper.updateByPrimaryKeySelective(resourceoss);
        } catch (Exception e) {
            LOGGER.error("resourceossMapper.updateByPrimaryKeySelective 更新数据失败", e);
        }
        if (Objects.equals(Integer.valueOf(result), Integer.valueOf(0))) {
            LOGGER.error("无法查询到需要更新的数据");
        }
        return result;
    }

    @RequestMapping({"/count"})
    public Integer count(int order_id) {

        int result = 0;
        Resourceoss resourceoss = new Resourceoss().setOrderId(order_id);
        try {
            result = this.resourceossMapper.countByExample(resourceoss);
        } catch (Exception e) {
            LOGGER.error("resourceossMapper.countByExample 查询数据失败", e);
        }
        return result;
    }

    @RequestMapping({"/deletebyorderid"})
    public Integer delete(int order_id) {
        ResourceossExample example = new ResourceossExample();
        example.createCriteria().andOrderIdEqualTo(order_id);
        int result = 0;
        try {
            result = this.resourceossMapper.deleteByExample(example);
        } catch (Exception e) {
            LOGGER.error("resourceossMapper.deleteByExample 删除数据失败", e);
        }
        return result;
    }

    public List<Resourceoss> findAll() {
        return resourceossMapper.selectByExample(null);
    }

    @RequestMapping({"/select"})
    public List<Resourceoss> select(@RequestParam(required = false) String name,
                                    @RequestParam(required = false) String startTime,
                                    @RequestParam(required = false) Integer size,
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

        ResourceossExample example = new ResourceossExample();
        ResourceossExample.Criteria criteria = example.createCriteria();
        if (name != null) {
            criteria.andNameLike(Stringstr.parse(name));
        }
        if (size != null) {
            criteria.andSizeEqualTo(size);
        }
        if (startTime != null && endTime != null) {
            criteria.andUpdateTimeBetween(beforedate, afterDate);
        }

        List<Resourceoss> resourceosses = resourceossMapper.selectByExample(example);
        return resourceosses;
    }

}
