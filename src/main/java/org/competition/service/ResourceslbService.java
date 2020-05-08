package org.competition.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.competition.domain.Resourceslb;
import org.competition.domain.Resourcevps;
import org.competition.mapper.ResourceslbMapper;
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
@RequestMapping({"/gov/resourceslb"})
@CrossOrigin(allowCredentials = "true", allowedHeaders = {"*"})
public class ResourceslbService {

    @Autowired
    private ResourceslbMapper resourceslbMapper;

    public static final Logger LOGGER = LogManager.getLogger(ResourceslbService.class);


    @RequestMapping({"/add"})
    public int addResourceslb(String name,
                              @RequestParam(value="order_id") Integer orderId,
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

}