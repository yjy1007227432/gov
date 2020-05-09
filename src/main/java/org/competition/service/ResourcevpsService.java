package org.competition.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.competition.domain.*;
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
@RequestMapping({"/gov/resourcevps"})
@CrossOrigin(allowCredentials = "true", allowedHeaders = {"*"})
public class ResourcevpsService {

    @Autowired
    private ResourcevpsMapper resourcevpsMapper;

    public static final Logger LOGGER = LogManager.getLogger(ResourcevpsService.class);

    @RequestMapping({"/add"})
    public int addResourcevps(String name,
                              @RequestParam(value = "order_id", required = false) Integer orderId,
                              @RequestParam(required = false) Integer specification,
                              @RequestParam(value = "harddisk_type", required = false) Integer harddiskType,
                              @RequestParam(value = "harddisk_size", required = false) String harddiskSize,
                              @RequestParam(value = "network_type", required = false) Integer networkType,
                              @RequestParam(value = "network_ispublic", required = false) Integer networkIspublic,
                              @RequestParam(value = "network_size", required = false) String networkSize,
                              @RequestParam(required = false) Integer operating,
                              @RequestParam(required = false) Integer quantity,
                              @RequestParam(required = false) String backup,
                              @RequestParam(required = false) String backup1,
                              @RequestParam(required = false) String backup2,
                              @RequestParam(value = "create_user", required = false) String createUser
    ) {
        Resourcevps resourcevps = (new Resourcevps()).setName(name).setOrderId(orderId)
                .setSpecification(specification).setHarddiskType(harddiskType)
                .setHarddiskSize(harddiskSize).setNetworkType(networkType).setNetworkIspublic(networkIspublic)
                .setNetworkSize(networkSize).setOperating(operating)
                .setQuantity(quantity).setBackup(backup).setBackup1(backup1)
                .setBackup2(backup2).setCreateUser(createUser).setCreateTime(Date.from(Instant.now()));
        int result = 0;
        try {
            result = this.resourcevpsMapper.insert(resourcevps);
        } catch (Exception e) {
            LOGGER.error("resourcerdsMapper.insert 插入数据失败", e);
        }
        return result;
    }

    @RequestMapping({"/delete"})
    public int deleteVpsById(int id) {
        int result = 0;
        try {
            result = this.resourcevpsMapper.deleteByPrimaryKey(Integer.valueOf(id));
        } catch (Exception e) {
            LOGGER.error("resourcevpsMapper.deleteByPrimaryKey 删除数据失败", e);
        }
        if (Objects.equals(Integer.valueOf(result), Integer.valueOf(0))) {
            LOGGER.error("无法删除不存在的数据");
        }
        return result;
    }

    @RequestMapping({"/find"})
    public Resourcevps findById(int id) {
        Resourcevps resourcevps = null;
        try {
            resourcevps = this.resourcevpsMapper.selectByPrimaryKey(Integer.valueOf(id));
        } catch (Exception e) {
            LOGGER.error("resourcevpsMapper.selectByPrimaryKey 查询数据失败", e);
        }
        if (Objects.equals(resourcevps, null)) {
            LOGGER.error("查询结果为空");
        }
        return resourcevps;
    }


    @RequestMapping({"/findlist"})
    public List<Resourcevps> findByOrderId(Integer order_id) {
        List<Resourcevps> resourcevpses = new ArrayList<>();
        Resourcevps resourcevps = new Resourcevps().setOrderId(order_id);
        try {
            resourcevpses = this.resourcevpsMapper.selectByResourcevps(resourcevps);
        } catch (Exception e) {
            LOGGER.error("resourceslbMapper.selectByResourceslb 查询数据失败", e);
        }
        if (Objects.equals(resourcevpses, null)) {
            LOGGER.error("查询结果为空");
        }
        return resourcevpses;
    }

    @RequestMapping({"/update"})
    public int update(Integer id,
                      @RequestParam(required = false) String name,
                      @RequestParam(value = "order_id", required = false) Integer orderId,
                      @RequestParam(value = "update_user", required = false) String updateUser,
                      @RequestParam(required = false) Integer specification,
                      @RequestParam(value = "harddisk_type", required = false) Integer harddiskType,
                      @RequestParam(value = "harddisk_size", required = false) String harddiskSize,
                      @RequestParam(value = "network_type", required = false) Integer networkType,
                      @RequestParam(value = "network_ispublic", required = false) Integer networkIspublic,
                      @RequestParam(value = "network_size", required = false) String networkSize,
                      @RequestParam(required = false) Integer operating,
                      @RequestParam(required = false) Integer quantity,
                      @RequestParam(required = false) String backup,
                      @RequestParam(required = false) String backup1,
                      @RequestParam(required = false) String backup2

    ) {
        Resourcevps resourcevps = new Resourcevps().setId(id).setName(name).setOrderId(orderId).
                setSpecification(specification).setHarddiskType(harddiskType).setHarddiskSize(harddiskSize)
                .setNetworkType(networkType).setNetworkIspublic(networkIspublic).setNetworkSize(networkSize).setOperating(operating).setUpdateTime(Date.from(Instant.now())).setUpdateUser(updateUser)
                .setQuantity(quantity).setBackup(backup).setBackup1(backup1)
                .setBackup2(backup2);
        int result = 0;
        try {
            result = this.resourcevpsMapper.updateByPrimaryKeySelective(resourcevps);
        } catch (Exception e) {
            LOGGER.error("resourcevpsMapper.updateByPrimaryKeySelective 更新数据失败", e);
        }
        if (Objects.equals(Integer.valueOf(result), Integer.valueOf(0))) {
            LOGGER.error("无法查询到需要更新的数据");
        }
        return result;
    }

    @RequestMapping({"/count"})
    public Integer count(int order_id) {

        int result = 0;
        Resourcevps resourcevps = new Resourcevps().setOrderId(order_id);
        try {
            result = this.resourcevpsMapper.countByExample(resourcevps);
        } catch (Exception e) {
            LOGGER.error("resourcevpsMapper.countByExample 查询数据失败", e);
        }
        return result;
    }

    @RequestMapping({"/deletebyorderid"})
    public Integer delete(int order_id) {
        ResourcevpsExample example = new ResourcevpsExample();
        example.createCriteria().andOrderIdEqualTo(order_id);
        int result = 0;
        try {
            result = this.resourcevpsMapper.deleteByExample(example);
        } catch (Exception e) {
            LOGGER.error("resourcevpsMapper.deleteByExample 删除数据失败", e);
        }
        return result;
    }



}
