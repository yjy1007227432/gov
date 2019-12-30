package org.competition.dao;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderPojo {

    private Integer customerId;

    private String updateUser;

    private String contact;

    private String contactPhone;

    private String contactEmail;

    private String content;

    private String feedback;

}
