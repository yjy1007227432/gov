package org.competition.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.competition.domain.Resourcerds;
import org.competition.domain.Resourcevps;
import org.competition.mapper.ResourcevpsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.Date;



@Component
@RestController
@RequestMapping({"/gov/resourcevps"})
@CrossOrigin(allowCredentials = "true", allowedHeaders = {"*"})
public class ResourcevpsService{

    @Autowired
    private ResourcevpsMapper resourcevpsMapper;

    public static final Logger LOGGER = LogManager.getLogger(ResourcevpsService.class);

    @RequestMapping({"/add"})
    public int addResourcevps(String name,
                              @RequestParam(value = "order_id") Integer orderId,
                              @RequestParam(required = false) Integer specification,
                              @RequestParam(value = "harddisk_type",required = false) Integer harddiskType,
                              @RequestParam(value = "harddisk_size",required = false) String harddiskSize,
                              @RequestParam(value = "network_type",required = false) Integer networkType,
                              @RequestParam(value = "network_ispublic",required = false) Integer networkIspublic,
                              @RequestParam(value = "network_size",required = false) String networkSize,
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



}
