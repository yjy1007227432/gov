package org.competition.dao;

import lombok.Data;
import org.competition.domain.Ordertask;


@Data
public class OrderTaskResult extends Ordertask {

    private String customer_name;

    private String order_name;

    private String resource_name;

}
