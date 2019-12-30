package org.competition.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;


@Accessors(chain = true)
@Data
public class Product {
    private Integer id;

    private String name;

    private Date createTime;

    private Date updateTime;

    private String createUser;

    private String updateUser;

    private String content;
}