package org.competition.service;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.competition.domain.Resourceoss;
import org.competition.domain.Resourcevps;
import org.competition.domain.Solution;
import org.competition.mapper.ResourceossMapper;
import org.competition.mapper.ResourcerdsMapper;
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
@RequestMapping({"/gov/resourceoss"})
@CrossOrigin(allowCredentials = "true", allowedHeaders = {"*"})
public class ResourceossService {

    @Autowired
    private ResourceossMapper resourceossMapper;

    public static final Logger LOGGER = LogManager.getLogger(ResourceossService.class);

    @RequestMapping({"/add"})
    public int addResourceoss(String name,
                           @RequestParam(value="order_id") Integer orderId,
                           @RequestParam(required = false) Integer size,
                           @RequestParam(required = false) Integer quantity,
                           @RequestParam(required = false) String backup,
                           @RequestParam(required = false) String backup1,
                           @RequestParam(required = false) String backup2,
                           @RequestParam(value="create_user",required = false) String createUser
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

}
