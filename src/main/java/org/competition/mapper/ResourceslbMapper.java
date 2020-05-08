package org.competition.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.competition.domain.Resourceslb;
import org.competition.domain.ResourceslbExample;

public interface ResourceslbMapper {
    int countByExample(ResourceslbExample example);

    int deleteByExample(ResourceslbExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Resourceslb record);

    int insertSelective(Resourceslb record);

    List<Resourceslb> selectByExample(ResourceslbExample example);

    Resourceslb selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Resourceslb record, @Param("example") ResourceslbExample example);

    int updateByExample(@Param("record") Resourceslb record, @Param("example") ResourceslbExample example);

    int updateByPrimaryKeySelective(Resourceslb record);

    int updateByPrimaryKey(Resourceslb record);
}