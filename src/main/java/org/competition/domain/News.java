package org.competition.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

@Accessors(chain = true)
@Data
public class News {
    private Integer id;

    private String title;

    private Date createTime;

    private Date updateTime;

    private String createUser;

    private String updateUser;

    private String content;
}