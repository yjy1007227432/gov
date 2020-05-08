package org.competition.domain;


import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class DictvalueKV {

    private Integer key;

    private String value;

}
