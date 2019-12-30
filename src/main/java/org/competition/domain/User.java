package org.competition.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;


@Accessors(chain = true)
@Data
public class User {
    private Integer id;

    private String loginId;

    private Date createTime;

    private Date updateTime;

    private String createUser;

    private String updateUser;

    private String name;

    private String phone;

    private String password;

    private String userType;}