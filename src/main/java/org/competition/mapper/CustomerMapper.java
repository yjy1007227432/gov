package org.competition.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.competition.domain.Customer;
import org.competition.domain.CustomerExample;

public interface CustomerMapper {
  int countByExample(CustomerExample paramCustomerExample);
  
  int deleteByExample(CustomerExample paramCustomerExample);
  
  int deleteByPrimaryKey(Integer paramInteger);
  
  int insert(Customer paramCustomer);
  
  int insertSelective(Customer paramCustomer);
  
  List<Customer> selectByExample(CustomerExample paramCustomerExample);
  
  Customer selectByPrimaryKey(Integer paramInteger);
  
  int updateByExampleSelective(@Param("record") Customer paramCustomer, @Param("example") CustomerExample paramCustomerExample);
  
  int updateByExample(@Param("record") Customer paramCustomer, @Param("example") CustomerExample paramCustomerExample);
  
  int updateByPrimaryKeySelective(Customer paramCustomer);
  
  int updateByPrimaryKey(Customer paramCustomer);
}


/* Location:              C:\Users\Administrator\Desktop\gov1\WEB-INF\classes\!\org\competition\mapper\CustomerMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */