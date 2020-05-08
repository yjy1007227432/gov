package org.competition.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.competition.domain.Resourcevps;
import org.competition.domain.ResourcevpsExample;

public interface ResourcevpsMapper {
    int countByExample(ResourcevpsExample example);

    int deleteByExample(ResourcevpsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Resourcevps record);

    int insertSelective(Resourcevps record);

    List<Resourcevps> selectByExample(ResourcevpsExample example);

    Resourcevps selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Resourcevps record, @Param("example") ResourcevpsExample example);

    int updateByExample(@Param("record") Resourcevps record, @Param("example") ResourcevpsExample example);

    int updateByPrimaryKeySelective(Resourcevps record);

    int updateByPrimaryKey(Resourcevps record);
}