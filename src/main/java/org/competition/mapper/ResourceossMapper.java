package org.competition.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.competition.domain.Resourceoss;
import org.competition.domain.ResourceossExample;

public interface ResourceossMapper {
    int countByExample(ResourceossExample example);

    int deleteByExample(ResourceossExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Resourceoss record);

    int insertSelective(Resourceoss record);

    List<Resourceoss> selectByExample(ResourceossExample example);

    Resourceoss selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Resourceoss record, @Param("example") ResourceossExample example);

    int updateByExample(@Param("record") Resourceoss record, @Param("example") ResourceossExample example);

    int updateByPrimaryKeySelective(Resourceoss record);

    int updateByPrimaryKey(Resourceoss record);
}