package org.competition.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.competition.domain.Solution;
import org.competition.domain.SolutionExample;

public interface SolutionMapper {
  int countByExample(SolutionExample paramSolutionExample);
  
  int deleteByExample(SolutionExample paramSolutionExample);
  
  int deleteByPrimaryKey(Integer paramInteger);
  
  int insert(Solution paramSolution);
  
  int insertSelective(Solution paramSolution);
  
  List<Solution> selectByExample(SolutionExample paramSolutionExample);
  
  Solution selectByPrimaryKey(Integer paramInteger);
  
  int updateByExampleSelective(@Param("record") Solution paramSolution, @Param("example") SolutionExample paramSolutionExample);
  
  int updateByExample(@Param("record") Solution paramSolution, @Param("example") SolutionExample paramSolutionExample);
  
  int updateByPrimaryKeySelective(Solution paramSolution);
  
  int updateByPrimaryKey(Solution paramSolution);
}


/* Location:              C:\Users\Administrator\Desktop\gov1\WEB-INF\classes\!\org\competition\mapper\SolutionMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */