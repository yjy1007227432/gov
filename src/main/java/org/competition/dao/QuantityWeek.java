package org.competition.dao;

import lombok.Data;

import java.util.Date;
import java.util.Map;

@Data
public class QuantityWeek {

    private Map<String,Integer> map;
    private String date;

}
