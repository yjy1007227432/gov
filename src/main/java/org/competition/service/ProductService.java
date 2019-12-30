package org.competition.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.competition.domain.Order;
import org.competition.domain.Product;
import org.competition.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Objects;


@Component
@RestController
@RequestMapping("/gov/product")
@CrossOrigin
public class ProductService {

    public static final Logger LOGGER = LogManager.getLogger(ProductService.class);

    @Autowired
    ProductMapper productMapper;

    @GetMapping(value = "/add")
    public int addProduct(String name, String content, String createUser){
        Product product = new Product();
        product.setName(name).setContent(content).setCreateUser(createUser);
        int result = 0;
        try {
            result = productMapper.insert(product);
        } catch (Exception e) {
            LOGGER.error("productMapper.insert插入数据失败", e);
        }
        return result;
    }

    @GetMapping(value = "/update")
    public int updateByPrimaryKeySelective(String name,String content, String updateUser,int id){
        Product product = new Product();
        product.setName(name).setContent(content).setUpdateUser(updateUser).setId(id);
        int result = 0;
        try {
            result = productMapper.updateByPrimaryKey(product);
        } catch (Exception e) {
            LOGGER.error("productMapper.updateByPrimaryKey更新数据失败", e);
        }
        return result;
    }

    @GetMapping(value = "/delete")
    public int deleteProductById(int id){
        int result = 0;
        try {
            result = productMapper.deleteByPrimaryKey(id);
        } catch (Exception e) {
            LOGGER.error("productMapper.deleteByPrimaryKey 删除数据失败", e);
        }
        if(Objects.equals(result,0)){
            LOGGER.error("无法删除不存在的数据");
        }
        return result;
    }

    @GetMapping(value = "/list")
    public List<Product> ListProduct(){
        List<Product> productList = null;
        try {
            productList = productMapper.selectByExample(null);
        } catch (Exception e) {
            LOGGER.error("productMapper.selectByExample 查询数据失败", e);
        }
        return productList;
    }

    @GetMapping(value = "/find")
    public Product findProductById(int id){
        Product product = null;
        try {
            product = productMapper.selectByPrimaryKey(id);
        } catch (Exception e) {
            LOGGER.error("productMapper.selectByPrimaryKey 查询数据失败", e);
        }
        return product;
    }

}