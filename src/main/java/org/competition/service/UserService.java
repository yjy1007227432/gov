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
    private static final Logger LOGGER = LogManager.getLogger(ProductService.class);

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

    @GetMapping(value = "/updatepassword")
    public String updatePassword(String name, String phone, String password, String newPassword) {
        int result = 0;
        name = URLDecoder.decode(name);
        //验证用户名和密码，输入正确，跳转到dashboard
        List<User> userList = userMapper.selectByPhone(phone);
        if (userList == null) {
            return "用户名为空";
        }
        if (Objects.equals(userList.get(0).getPassword(), password) && Objects.equals(userList.get(0).getPhone(), phone)&& Objects.equals(userList.get(0).getName(), name)) {
            userList.get(0).setPhone(phone).setId(userList.get(0).getId()).setPassword(newPassword);
            try {
                userList.get(0).setPassword(newPassword);
                result = userMapper.updateByPrimaryKeySelective(userList.get(0));
            } catch (Exception e) {
                LOGGER.error("  userMapper.updateByPrimaryKey 更新数据失败", e);
            }
            return "密码修改成功";
        }
        else {
            return "密码或姓名错误";
        }
    }

    @GetMapping(value = "/updateuser")
    public int updateUser(@RequestParam(required=false) String loginId, @RequestParam(required=false) String updateUser, @RequestParam(required=false) String name, String phone, @RequestParam(required=false) String password, @RequestParam(required=false)  String userType){
        name = URLDecoder.decode(name);
        updateUser = URLDecoder.decode(updateUser);
        List<User> userList = userMapper.selectByPhone(phone);
        if (userList == null) {
            LOGGER.error("用户名为空");
        }
        User user = userList.get(0);
        user.setLoginId(loginId).setUpdateTime(Date.from(Instant.now())).
                setUpdateUser(updateUser).setName(name).setPhone(phone).setPassword(password).setUserType(userType);
        int result = 0;
        try {
            result = userMapper.updateByPrimaryKeySelective(user);
        } catch (Exception e) {
            LOGGER.error(" userMapper.updateByPrimaryKeySelective  更新数据失败", e);
        }
        return result;
    }

}
