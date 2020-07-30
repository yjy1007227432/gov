package org.competition.service;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.competition.domain.*;
import org.competition.mapper.OrderMapper;
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
@RequestMapping({"/gov/resourcerds"})
@CrossOrigin(allowCredentials = "true", allowedHeaders = {"*"})
public class ResourcerdsService {

    @Autowired
    private ResourcerdsMapper resourcerdsMapper;

    public static final Logger LOGGER = LogManager.getLogger(ResourcerdsService.class);

    @RequestMapping({"/add"})
    public int addResourcerds(String name,
                              @RequestParam(value = "order_id", required = false) Integer orderId,
                              @RequestParam(required = false) Integer type,
                              @RequestParam(required = false) Integer memory,
                              @RequestParam(required = false) Integer storage,
                              @RequestParam(required = false) Integer instance,
                              @RequestParam(required = false) Integer network,
                              @RequestParam(required = false) Integer quantity,
                              @RequestParam(required = false) String backup,
                              @RequestParam(required = false) String backup1,
                              @RequestParam(required = false) String backup2,
                              @RequestParam(value = "create_user", required = false) String createUser
    ) {
        Resourcerds resourcerds = (new Resourcerds()).setName(name).setOrderId(orderId)
                .setType(type).setMemory(memory).setStorage(storage).setNetwork(network)
                .setInstance(instance).setQuantity(quantity).setBackup(backup).setBackup1(backup1)
                .setBackup2(backup2).setCreateUser(createUser).setCreateTime(Date.from(Instant.now()));
        int result = 0;
        try {
            result = this.resourcerdsMapper.insert(resourcerds);
        } catch (Exception e) {
            LOGGER.error("resourcerdsMapper.insert 插入数据失败", e);
        }
        return result;
    }

    @RequestMapping({"/delete"})
    public int deleteRdsById(int id) {
        int result = 0;
        try {
            result = this.resourcerdsMapper.deleteByPrimaryKey(Integer.valueOf(id));
        } catch (Exception e) {
            LOGGER.error("resourcerdsMapper.deleteByPrimaryKey 删除数据失败", e);
        }
        if (Objects.equals(Integer.valueOf(result), Integer.valueOf(0))) {
            LOGGER.error("无法删除不存在的数据");
        }
        return result;
    }

    @RequestMapping({"/find"})
    public Resourcerds findById(int id) {
        Resourcerds resourcerds = null;
        try {
            resourcerds = this.resourcerdsMapper.selectByPrimaryKey(Integer.valueOf(id));
        } catch (Exception e) {
            LOGGER.error("resourcerdsMapper.selectByPrimaryKey 查询数据失败", e);
        }
        if (Objects.equals(resourcerds, null)) {
            LOGGER.error("查询结果为空");
        }
        return resourcerds;
    }

    @RequestMapping({"/findlist"})
    public List<Resourcerds> findByOrderId(int order_id) {
        List<Resourcerds> resourcerdses = new ArrayList<>();
        Resourcerds resourcerds = new Resourcerds().setOrderId(order_id);
        try {
            resourcerdses = this.resourcerdsMapper.selectByResourcerds(resourcerds);
        } catch (Exception e) {
            LOGGER.error("resourcerdsMapper.selectByResourcerds 查询数据失败", e);
        }
        if (Objects.equals(resourcerdses, null)) {
            LOGGER.error("查询结果为空");
        }
        return resourcerdses;
    }

    @RequestMapping({"/update"})
    public int update(Integer id,
                      @RequestParam(required = false) String name,
                      @RequestParam(value = "order_id", required = false) Integer orderId,
                      @RequestParam(value = "update_user", required = false) String updateUser,
                      @RequestParam(required = false) Integer type,
                      @RequestParam(required = false) Integer memory,
                      @RequestParam(required = false) Integer storage,
                      @RequestParam(required = false) Integer instance,
                      @RequestParam(required = false) Integer network,
                      @RequestParam(required = false) Integer quantity,
                      @RequestParam(required = false) String backup,
                      @RequestParam(required = false) String backup1,
                      @RequestParam(required = false) String backup2
    ) {
        Resourcerds resourcerds = new Resourcerds().setId(id).setName(name).setOrderId(orderId).
                setUpdateTime(Date.from(Instant.now())).setUpdateUser(updateUser)
                .setType(type).setMemory(memory).setStorage(storage)
                .setInstance(instance).setNetwork(network)
                .setQuantity(quantity).setBackup(backup).setBackup1(backup1)
                .setBackup2(backup2);
        int result = 0;
        try {
            result = this.resourcerdsMapper.updateByPrimaryKeySelective(resourcerds);
        } catch (Exception e) {
            LOGGER.error("resourcerdsMapper.updateByPrimaryKeySelective 更新数据失败", e);
        }
        if (Objects.equals(Integer.valueOf(result), Integer.valueOf(0))) {
            LOGGER.error("无法查询到需要更新的数据");
        }
        return result;
    }

    @RequestMapping({"/count"})
    public Integer count(int order_id) {

        int result = 0;
        Resourcerds resourcerds = new Resourcerds().setOrderId(order_id);
        try {
            result = this.resourcerdsMapper.countByExample(resourcerds);
        } catch (Exception e) {
            LOGGER.error("resourcerdsMapper.countByExample 查询数据失败", e);
        }
        return result;
    }

    @RequestMapping({"/deletebyorderid"})
    public Integer delete(int order_id) {
        ResourcerdsExample example = new ResourcerdsExample();
        example.createCriteria().andOrderIdEqualTo(order_id);
        int result = 0;
        try {
            result = this.resourcerdsMapper.deleteByExample(example);
        } catch (Exception e) {
            LOGGER.error("resourcerdsMapper.deleteByExample 删除数据失败", e);
        }
        return result;
    }

    public List<Resourcerds> findAll() {
        return resourcerdsMapper.selectByExample(null);
    }


    public List<Integer> findRdsIdByName(String name) {
        List<Resourcerds> resourcerdses = null;
        try {
            ResourcerdsExample example = new ResourcerdsExample();
            ResourcerdsExample.Criteria criteria = example.createCriteria();
            criteria.andNameLike(Stringstr.parse(name));
            resourcerdses = this.resourcerdsMapper.selectByExample(example);
        } catch (Exception e) {
            LOGGER.error("resourcerdsMapper.selectByExample查询数据失败", e);
        }
        if (Objects.equals(resourcerdses, null)) {
            LOGGER.error("查询结果为空");
        }
        return resourcerdses.stream().map(Resourcerds::getId).collect(Collectors.toList());
    }


    @RequestMapping({"/select"})
    public List<Resourcerds> select(@RequestParam(required = false) String name,
                                    @RequestParam(required = false) String startTime,
                                    @RequestParam(required = false) Integer type,
                                    @RequestParam(required = false) Integer memory,
                                    @RequestParam(required = false) Integer storage,
                                    @RequestParam(required = false) Integer instance,
                                    @RequestParam(required = false) Integer network,
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


        ResourcerdsExample example = new ResourcerdsExample();
        ResourcerdsExample.Criteria criteria = example.createCriteria();


        if (name != null) {
            criteria.andNameLike(Stringstr.parse(name));
        }
        if (type != null) {
            criteria.andTypeEqualTo(type);
        }
        if(memory!=null) {
            criteria.andMemoryEqualTo(memory);
        }
        if(startTime != null && endTime != null) {
            criteria.andUpdateTimeBetween(beforedate, afterDate);
        }
        if (instance!=null) {
            criteria.andInstanceEqualTo(instance);
        }
        if(storage!=null) {
            criteria.andStorageEqualTo(storage);
        }
        if (network!=null) {
            criteria.andNetworkEqualTo(network);
        };


        List<Resourcerds> resourcerdses = resourcerdsMapper.selectByExample(example);
        return resourcerdses;
    }


}
