package org.competition.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.competition.domain.Product;
import org.competition.domain.User;
import org.competition.mapper.UserMapper;
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
@RequestMapping("/gov/user")
@CrossOrigin(allowCredentials = "true", allowedHeaders = "*")
public class UserService {
    public static final Logger LOGGER = LogManager.getLogger(ProductService.class);

    @Autowired
    UserMapper userMapper;

    @GetMapping(value = "/add")
    public int addUser(@RequestParam(required=false) String loginId, @RequestParam(required=false)  String createUser, String name, String phone, String password, @RequestParam(required=false)  String userType){
        name = URLDecoder.decode(name);
        createUser = URLDecoder.decode(createUser);
        User user = new User();
        user.setLoginId(loginId).setCreateTime(Date.from(Instant.now())).setCreateUser(createUser).setName(name).setPhone(phone)
                .setPassword(password).setUserType(userType);
        int result = 0;
        try {
            result = userMapper.insert(user);
        } catch (Exception e) {
            LOGGER.error(" userMapper.insert  插入数据失败", e);
        }
        return result;
    }



    @GetMapping(value = "/delete")
    public int deleteUserById(int id){
        int result = 0;
        try {
            result = userMapper.deleteByPrimaryKey(id);
        } catch (Exception e) {
            LOGGER.error("userMapper.deleteByPrimaryKey 删除数据失败", e);
        }
        if(Objects.equals(result,0)){
            LOGGER.error("无法删除不存在的数据");
        }
        return result;

    }

    @GetMapping(value = "/list")
    public List<User> ListUser(){
        List<User> userList = null;
        try {
            userList = userMapper.selectByExample(null);
        } catch (Exception e) {
            LOGGER.error("solutionMapper.selectByExample 查询数据失败", e);
        }
        return userList;
    }

    @GetMapping(value = "/find")
    public User findUserById(int id){
        User user = null;
        try {
            user = userMapper.selectByPrimaryKey(id);
        } catch (Exception e) {
            LOGGER.error("userMapper.selectByPrimaryKey 查询数据失败", e);
        }
        if(Objects.equals(user,null)){
            LOGGER.error("查询结果为空");
        }
        return user;
    }

    @GetMapping(value = "/select")
    public List<User> findUserByPhone(String phone){
        List<User> userList = null;
        try {
            userList = userMapper.selectByPhone(phone);
        } catch (Exception e) {
            LOGGER.error("userMapper.selectByPrimaryKey 查询数据失败", e);
        }
        if(Objects.equals(userList,null)){
            LOGGER.error("查询结果为空");
        }
        return userList;
    }

}
