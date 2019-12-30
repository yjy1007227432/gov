package org.competition.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;


@Accessors(chain = true)
@Data
public class Customer {
    private Integer id;

    private Date createTime;

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