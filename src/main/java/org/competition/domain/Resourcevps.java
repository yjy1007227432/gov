package org.competition.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.experimental.Accessors;


import java.util.Date;

@Data
@Accessors(chain = true)
public class Resourcevps {
    private Integer id;

    private String name;

    private Integer orderId;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;

    private String createUser;

    private String updateUser;

    private Integer specification;

    private Integer harddiskType;

    private String harddiskSize;

    private Integer networkType;

    private Integer networkIspublic;

    private String networkSize;

    private Integer operating;

    private Integer quantity;

    private String backup;

    private String backup1;

    private String backup2;
}