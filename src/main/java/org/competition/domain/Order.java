package org.competition.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

@Accessors(chain = true)
@Data
public class Order {
    private Integer id;

    private Integer customerId;

    private Date createTime;

    private Date updateTime;

    private String updateUser;

    private String contact;

    private String contactPhone;

    private String contactEmail;

    private String content;

    private String feedback;
}