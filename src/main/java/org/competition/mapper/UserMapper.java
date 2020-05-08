package org.competition.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.competition.domain.User;
import org.competition.domain.UserExample;

public interface UserMapper {
  int countByExample(UserExample paramUserExample);
  
  int deleteByExample(UserExample paramUserExample);
  
  int deleteByPrimaryKey(Integer paramInteger);
  
  int insert(User paramUser);
  
  int insertSelective(User paramUser);
  
  List<User> selectByExample(UserExample paramUserExample);
  
  List<User> selectByPhone(String paramString);
  
  User selectByPrimaryKey(Integer paramInteger);
  
  int updateByExampleSelective(@Param("record") User paramUser, @Param("example") UserExample paramUserExample);
  
  int updateByExample(@Param("record") User paramUser, @Param("example") UserExample paramUserExample);
  
  int updateByPrimaryKeySelective(User paramUser);
  
  int updateByPrimaryKey(User paramUser);
}


/* Location:              C:\Users\Administrator\Desktop\gov1\WEB-INF\classes\!\org\competition\mapper\UserMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */