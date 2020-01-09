package org.competition.control;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.competition.domain.User;
import org.competition.mapper.UserMapper;
import org.competition.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.net.URLDecoder;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class UserController {
    public static final Logger LOGGER = LogManager.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    @GetMapping(value = "/update")
    public String updateUser(String name, String phone, String password, String newPassword) {
        int result = 0;
        name = URLDecoder.decode(name);
        //验证用户名和密码，输入正确，跳转到dashboard
        List<User> userList = userService.findUserByPhone(phone);
        if (userList == null) {
            return "用户名为空";
        }
        if (Objects.equals(userList.get(0).getPassword(), password) && Objects.equals(userList.get(0).getPhone(), phone)) {
            userList.get(0).setPhone(phone).setId(userList.get(0).getId()).setPassword(newPassword);
            try {
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
}