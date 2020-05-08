package org.competition.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.competition.domain.Resourceoss;
import org.competition.domain.Resourcerds;
import org.competition.domain.ResourcerdsExample;

public interface ResourcerdsMapper {
    int countByExample(ResourcerdsExample example);

    int deleteByExample(ResourcerdsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Resourcerds record);

    int insertSelective(Resourcerds record);

    List<Resourcerds> selectByExample(ResourcerdsExample example);

    List<Resourcerds> selectByResourcerds(Resourcerds Resourcerds);


    Resourcerds selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Resourcerds record, @Param("example") ResourcerdsExample example);

    int updateByExample(@Param("record") Resourcerds record, @Param("example") ResourcerdsExample example);

    int updateByPrimaryKeySelective(Resourcerds record);

    int updateByPrimaryKey(Resourcerds record);
}