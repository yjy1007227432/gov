package org.competition.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.competition.domain.Product;
import org.competition.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.net.URLDecoder;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.Objects;


@Component
@RestController
@RequestMapping("/gov/product")
@CrossOrigin(allowCredentials = "true", allowedHeaders = "*")
public class ProductService {

    public static final Logger LOGGER = LogManager.getLogger(ProductService.class);

    @Autowired
    ProductMapper productMapper;

    @GetMapping(value = "/add")
    public int addProduct(@RequestParam(required=false) String name,@RequestParam(required=false)  String content, @RequestParam(required=false) String createUser){
        name = URLDecoder.decode(name);
        content = URLDecoder.decode(content);
        createUser = URLDecoder.decode(createUser);
        Product product = new Product();
        product.setName(name).setContent(content).setCreateUser(createUser).setCreateTime(Date.from(Instant.now()));
        int result = 0;
        try {
            result = productMapper.insert(product);
        } catch (Exception e) {
            LOGGER.error("productMapper.insert插入数据失败", e);
        }
        return result;
    }

    @GetMapping(value = "/update")
    public int updateProduct(@RequestParam(required=false) String name,@RequestParam(required=false) String content, @RequestParam(required=false) String updateUser,Integer id){
        name = URLDecoder.decode(name);
        content = URLDecoder.decode(content);
        updateUser = URLDecoder.decode(updateUser);
        Product product = new Product();
        product.setName(name).setContent(content).setUpdateUser(updateUser).setId(id).setUpdateTime(Date.from(Instant.now()));
        int result = 0;
        try {
            result = productMapper.updateByPrimaryKeySelective(product);
        } catch (Exception e) {
            LOGGER.error("productMapper.updateByPrimaryKey更新数据失败", e);
        }
        if(Objects.equals(result,0)){
            LOGGER.error("无法查询到需要更新的数据");
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
        if(Objects.equals(product,null)){
            LOGGER.error("查询结果为空");
        }
        return product;
    }

}
