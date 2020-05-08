/*     */
package org.competition.service;
/*     */
/*     */

import java.time.Instant;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ import java.util.Objects;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ import org.competition.domain.Product;
/*     */ import org.competition.mapper.ProductMapper;
/*     */ import org.springframework.beans.factory.annotation.Autowired;
/*     */ import org.springframework.stereotype.Component;
/*     */ import org.springframework.web.bind.annotation.CrossOrigin;
/*     */ import org.springframework.web.bind.annotation.RequestMapping;
/*     */ import org.springframework.web.bind.annotation.RequestParam;
/*     */ import org.springframework.web.bind.annotation.RestController;

/*     */
/*     */
/*     */
@Component
/*     */
@RestController
/*     */
@RequestMapping({"/gov/product"})
/*     */
@CrossOrigin(allowCredentials = "true", allowedHeaders = {"*"})
/*     */ public class ProductService
        /*     */ {
    /*  25 */   public static final Logger LOGGER = LogManager.getLogger(ProductService.class);

    /*     */
    @Autowired
    /*     */ ProductMapper productMapper;
    /*     */

    /*     */
    @RequestMapping({"/add"})
    /*     */ public int addProduct(@RequestParam(required = false) String name, @RequestParam(required = false) String content, @RequestParam(required = false) String createUser, @RequestParam(required = false) Integer queueId) {
        /*  41 */
        Product product = new Product();
        /*  42 */
        product.setName(name).setContent(content).setCreateUser(createUser)
/*  43 */.setCreateTime(Date.from(Instant.now())).setQueueId(queueId);
        /*  44 */
        int result = 0;
        /*     */
        try {
            /*  46 */
            result = this.productMapper.insert(product);
            /*  47 */
        } catch (Exception e) {
            /*  48 */
            LOGGER.error("productMapper.insert插入数据失败", e);
            /*     */
        }
        /*  50 */
        return result;
        /*     */
    }

    /*     */
    @RequestMapping({"/update"})
    /*     */ public int updateProduct(@RequestParam(required = false) String name, @RequestParam(required = false) String content, @RequestParam(required = false) String updateUser, Integer id, @RequestParam(required = false) Integer queueId) {
        /*  66 */
        Product product = new Product();
        /*  67 */
        product.setName(name).setContent(content).setUpdateUser(updateUser)
/*  68 */.setId(id).setUpdateTime(Date.from(Instant.now())).setQueueId(queueId);
        /*  69 */
        int result = 0;
        /*     */
        try {
            /*  71 */
            result = this.productMapper.updateByPrimaryKeySelective(product);
            /*  72 */
        } catch (Exception e) {
            /*  73 */
            LOGGER.error("productMapper.updateByPrimaryKey更新数据失败", e);
            /*     */
        }
        /*  75 */
        if (Objects.equals(Integer.valueOf(result), Integer.valueOf(0))) {
            /*  76 */
            LOGGER.error("无法查询到需要更新的数据");
            /*     */
        }
        /*  78 */
        return result;
        /*     */
    }

    /*     */
    /*     */
    @RequestMapping({"/delete"})
    /*     */ public int deleteProductById(int id) {
        /*  83 */
        int result = 0;
        /*     */
        try {
            /*  85 */
            result = this.productMapper.deleteByPrimaryKey(Integer.valueOf(id));
            /*  86 */
        } catch (Exception e) {
            /*  87 */
            LOGGER.error("productMapper.deleteByPrimaryKey 删除数据失败", e);
            /*     */
        }
        /*  89 */
        if (Objects.equals(Integer.valueOf(result), Integer.valueOf(0))) {
            /*  90 */
            LOGGER.error("无法删除不存在的数据");
            /*     */
        }
        /*  92 */
        return result;
        /*     */
    }

    /*     */
    /*     */
    @RequestMapping({"/list"})
    /*     */ public List<Product> ListProduct() {
        /*  97 */
        List<Product> productList = null;
        /*     */
        try {
            /*  99 */
            productList = this.productMapper.selectByExample(null);
            /* 100 */
        } catch (Exception e) {
            /* 101 */
            LOGGER.error("productMapper.selectByExample 查询数据失败", e);
            /*     */
        }
        /* 103 */
        return productList;
        /*     */
    }

    /*     */
    /*     */
    @RequestMapping({"/find"})
    /*     */ public Product findProductById(int id) {
        /* 108 */
        Product product = null;
        /*     */
        try {
            /* 110 */
            product = this.productMapper.selectByPrimaryKey(Integer.valueOf(id));
            /* 111 */
        } catch (Exception e) {
            /* 112 */
            LOGGER.error("productMapper.selectByPrimaryKey 查询数据失败", e);
            /*     */
        }
        /* 114 */
        if (Objects.equals(product, null)) {
            /* 115 */
            LOGGER.error("查询结果为空");
            /*     */
        }
        /* 117 */
        return product;
        /*     */
    }
    /*     */
}


/* Location:              C:\Users\Administrator\Desktop\gov1\WEB-INF\classes\!\org\competition\service\ProductService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */