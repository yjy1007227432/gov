package org.competition.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;


import java.util.Date;

@Data
@Accessors(chain = true)
public class Resourcevps {
    private Integer id;

    private String name;

    @JsonProperty("order_id")
    private Integer orderId;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @JsonProperty("create_time")
    private Date createTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @JsonProperty("update_time")
    private Date updateTime;

    @JsonProperty("create_user")
    private String createUser;

    @JsonProperty("update_user")
    private String updateUser;

    private Integer specification;

    @JsonProperty("harddisk_type")
    private Integer harddiskType;

    @JsonProperty("harddisk_size")
    private String harddiskSize;

    @JsonProperty("network_type")
    private Integer networkType;

    @JsonProperty("network_ispublic")
    private Integer networkIspublic;

    @JsonProperty("network_size")
    private String networkSize;

    private Integer operating;

    private Integer quantity;

    private String backup;

    private String backup1;

    private String backup2;
}