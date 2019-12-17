package org.competition.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.competition.domain.Solution;
import org.competition.domain.SolutionExample;

public interface SolutionMapper {
    int countByExample(SolutionExample example);

    int deleteByExample(SolutionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Solution record);

    int insertSelective(Solution record);

    List<Solution> selectByExample(SolutionExample example);

    Solution selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Solution record, @Param("example") SolutionExample example);

    int updateByExample(@Param("record") Solution record, @Param("example") SolutionExample example);

    int updateByPrimaryKeySelective(Solution record);

    int updateByPrimaryKey(Solution record);
}