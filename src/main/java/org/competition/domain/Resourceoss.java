package org.competition.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;


@Data
@Accessors(chain = true)
public class Resourceoss {
    private Integer id;

    private String name;

    @JsonProperty("order_id")
    private Integer orderId;

    @JsonProperty("create_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    @JsonProperty("update_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;

    @JsonProperty("create_user")
    private String createUser;

    @JsonProperty("update_user")
    private String updateUser;

    private Integer size;

    private Integer quantity;

    private String backup;

    private String backup1;

    private String backup2;

}