package org.competition.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.experimental.Accessors;

import java.util.Date;

@Accessors(chain = true)
@lombok.Data
public class Ordertask {
    private Integer id;

    @JsonProperty("customer_id")
    private Integer customerId;

    @JsonProperty("order_id")
    private Integer orderId;

    @JsonProperty("resource_id")
    private Integer resourceId;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @JsonProperty("create_time")
    private Date createTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @JsonProperty("update_time")
    private Date updateTime;

    @JsonProperty("update_user")
    private String updateUser;

    @JsonProperty("task_action")
    private String taskAction;

    @JsonProperty("task_type")
    private String taskType;

    private String status;

    private String name;

    private Integer quantity;

    private String attachment;

    private String backup;

    private String keyword1;

    private String keyword2;

    private String keyword3;

    private String keyword4;

    private String keyword5;

    private String keyword6;

    private String keyword7;

    private String keyword8;

    private String keyword9;

    private String keyword10;

    private String keyword11;

    private String keyword12;

    private String keyword13;

    private String keyword14;

    private String keyword15;

}