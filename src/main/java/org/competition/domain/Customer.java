package org.competition.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;


@Accessors(chain = true)
@Data
public class Customer {
    private Integer id;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createTime;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date updateTime;

    private String createUser;

    private String updateUser;

    private String vipcard;

    private String name;

    private String customerManager;

    private String managerPhone;

    private String contact;

    private String contactPhone;

    private String customerType;

    private String customerGroup;

}