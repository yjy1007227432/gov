package org.competition.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.competition.domain.Product;
import org.competition.domain.ProductExample;

public interface ProductMapper {
  int countByExample(ProductExample paramProductExample);
  
  int deleteByExample(ProductExample paramProductExample);
  
  int deleteByPrimaryKey(Integer paramInteger);
  
  int insert(Product paramProduct);
  
  int insertSelective(Product paramProduct);
  
  List<Product> selectByExample(ProductExample paramProductExample);
  
  Product selectByPrimaryKey(Integer paramInteger);
  
  int updateByExampleSelective(@Param("record") Product paramProduct, @Param("example") ProductExample paramProductExample);
  
  int updateByExample(@Param("record") Product paramProduct, @Param("example") ProductExample paramProductExample);
  
  int updateByPrimaryKeySelective(Product paramProduct);
  
  int updateByPrimaryKey(Product paramProduct);
}


/* Location:              C:\Users\Administrator\Desktop\gov1\WEB-INF\classes\!\org\competition\mapper\ProductMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */