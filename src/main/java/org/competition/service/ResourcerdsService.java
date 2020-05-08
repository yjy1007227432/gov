package org.competition.service;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.competition.domain.Resourcerds;
import org.competition.domain.Resourcevps;
import org.competition.mapper.OrderMapper;
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
@RequestMapping({"/gov/resourcerds"})
@CrossOrigin(allowCredentials = "true", allowedHeaders = {"*"})
public class ResourcerdsService {

    @Autowired
    private ResourcerdsMapper resourcerdsMapper;

    public static final Logger LOGGER = LogManager.getLogger(ResourcerdsService.class);

    @RequestMapping({"/add"})
    public int addResourcerds(String name,
                              @RequestParam(value = "order_id") Integer orderId,
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


}
