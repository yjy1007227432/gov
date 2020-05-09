package org.competition.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.competition.domain.*;
import org.competition.mapper.ResourceslbMapper;
import org.competition.mapper.ResourcevpsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;


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
                              @RequestParam(value="order_id",required = false) Integer orderId,
                              @RequestParam(required = false) Integer type,
                              @RequestParam(required = false) Integer network,
                              @RequestParam(required = false) String ipaddress,
                              @RequestParam(required = false) Integer port,
                              @RequestParam(required = false) Integer quantity,
                              @RequestParam(required = false) String backup,
                              @RequestParam(required = false) String backup1,
                              @RequestParam(required = false) String backup2,
                              @RequestParam(value="create_user",required = false) String createUser
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
                      @RequestParam(value = "order_id",required = false) Integer orderId,
                      @RequestParam(value = "update_user",required = false) String updateUser,
                      @RequestParam(required = false) Integer type,
                      @RequestParam(required = false) Integer network,
                      @RequestParam(required = false) String ipaddress,
                      @RequestParam(required = false) Integer port,
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



}
