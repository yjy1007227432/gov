package org.competition.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.competition.domain.Ordertask;
import org.competition.domain.OrdertaskExample;

public interface OrdertaskMapper {
    int countByExample(OrdertaskExample example);

    int deleteByExample(OrdertaskExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Ordertask record);

    int insertSelective(Ordertask record);

    List<Ordertask> selectByExample(OrdertaskExample example);

    Ordertask selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Ordertask record, @Param("example") OrdertaskExample example);

    int updateByExample(@Param("record") Ordertask record, @Param("example") OrdertaskExample example);

    int updateByPrimaryKeySelective(Ordertask record);

    int updateByPrimaryKey(Ordertask record);
}