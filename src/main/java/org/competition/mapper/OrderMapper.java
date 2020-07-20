package org.competition.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.competition.domain.Order;
import org.competition.domain.OrderExample;

public interface OrderMapper {
  int countByExample(OrderExample paramOrderExample);
  
  int deleteByExample(OrderExample paramOrderExample);
  
  int deleteByPrimaryKey(Integer paramInteger);
  
  int insert(Order paramOrder);
  
  int insertSelective(Order paramOrder);
  
  List<Order> selectByExample(OrderExample paramOrderExample);

  List<Order> selectByExample2(OrderExample paramOrderExample);
  
  Order selectByPrimaryKey(Integer paramInteger);
  
  int updateByExampleSelective(@Param("record") Order paramOrder, @Param("example") OrderExample paramOrderExample);
  
  int updateByExample(@Param("record") Order paramOrder, @Param("example") OrderExample paramOrderExample);
  
  int updateByPrimaryKeySelective(Order paramOrder);
  
  int updateByPrimaryKey(Order paramOrder);
}


/* Location:              C:\Users\Administrator\Desktop\gov1\WEB-INF\classes\!\org\competition\mapper\OrderMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */