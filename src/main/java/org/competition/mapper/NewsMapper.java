package org.competition.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.competition.domain.News;
import org.competition.domain.NewsExample;

public interface NewsMapper {
  int countByExample(NewsExample paramNewsExample);
  
  int deleteByExample(NewsExample paramNewsExample);
  
  int deleteByPrimaryKey(Integer paramInteger);
  
  int insert(News paramNews);
  
  int insertSelective(News paramNews);
  
  List<News> selectByExample(NewsExample paramNewsExample);
  
  News selectByPrimaryKey(Integer paramInteger);
  
  int updateByExampleSelective(@Param("record") News paramNews, @Param("example") NewsExample paramNewsExample);
  
  int updateByExample(@Param("record") News paramNews, @Param("example") NewsExample paramNewsExample);
  
  int updateByPrimaryKeySelective(News paramNews);
  
  int updateByPrimaryKey(News paramNews);
}


/* Location:              C:\Users\Administrator\Desktop\gov1\WEB-INF\classes\!\org\competition\mapper\NewsMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */