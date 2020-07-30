package org.competition.dao;


import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Accessors(chain = true)
@Data
public class OrderReport extends OrderCustomer {

    private List<Integer> rds_memory;

    private List<String> rds_value;

    private List<Integer> rds_quantity;

    private List<Integer> rds_storage;

    private List<Integer> vps_specification;

    private List<String> vps_value;

    private List<Integer> vps_quantity;

    private List<Integer> oss_size;

    private List<Integer> oss_quantity;

    private List<Integer> slb_quantity;
}
