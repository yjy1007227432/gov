/*     */ package org.competition.service;
/*     */ 
/*     */ import java.time.Instant;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ import java.util.Objects;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ import org.competition.domain.User;
/*     */ import org.competition.mapper.UserMapper;
/*     */ import org.springframework.beans.factory.annotation.Autowired;
/*     */ import org.springframework.stereotype.Component;
/*     */ import org.springframework.web.bind.annotation.CrossOrigin;
/*     */ import org.springframework.web.bind.annotation.RequestMapping;
/*     */ import org.springframework.web.bind.annotation.RequestParam;
/*     */ import org.springframework.web.bind.annotation.RestController;
/*     */ 
/*     */ @Component
/*     */ @RestController
/*     */ @RequestMapping({"/gov/user"})
/*     */ @CrossOrigin(allowCredentials = "true", allowedHeaders = {"*"})
/*     */ public class UserService {
    /*  23 */   private static final Logger LOGGER = LogManager.getLogger(ProductService.class);
    /*     */
    /*     */
    /*     */
    /*     */
    @Autowired
    /*     */ UserMapper userMapper;

    /*     */
    /*     */
    /*     */
    /*     */
    /*     */
    @RequestMapping({"/add"})
    /*     */ public int addUser(@RequestParam(required = false) String loginId,
                                 @RequestParam(required = false) String createUser,
                                 String name,
                                 String phone,
                                 String password,
                                 @RequestParam(required = false) String userType) {
        /*  35 */
        User user = new User();
        /*  36 */
        user.setLoginId(loginId).setCreateTime(Date.from(Instant.now())).
                setCreateUser(createUser).setName(name).setPhone(phone)
/*  37 */.setPassword(password).setUserType(userType);
        /*  38 */
        int result = 0;
        /*     */
        try {
            /*  40 */
            result = this.userMapper.insert(user);
            /*  41 */
        } catch (Exception e) {
            /*  42 */
            LOGGER.error(" userMapper.insert  插入数据失败", e);
            /*     */
        }
        /*  44 */
        return result;
        /*     */
    }

    /*     */
    /*     */
    /*     */
    /*     */
    @RequestMapping({"/delete"})
    /*     */ public int deleteUserById(int id) {
        /*  51 */
        int result = 0;
        /*     */
        try {
            /*  53 */
            result = this.userMapper.deleteByPrimaryKey(Integer.valueOf(id));
            /*  54 */
        } catch (Exception e) {
            /*  55 */
            LOGGER.error("userMapper.deleteByPrimaryKey 删除数据失败", e);
            /*     */
        }
        /*  57 */
        if (Objects.equals(Integer.valueOf(result), Integer.valueOf(0))) {
            /*  58 */
            LOGGER.error("无法删除不存在的数据");
            /*     */
        }
        /*  60 */
        return result;
        /*     */
    }

    /*     */
    /*     */
    /*     */
    @RequestMapping({"/list"})
    /*     */ public List<User> ListUser() {
        /*  66 */
        List<User> userList = null;
        /*     */
        try {
            /*  68 */
            userList = this.userMapper.selectByExample(null);
            /*  69 */
        } catch (Exception e) {
            /*  70 */
            LOGGER.error("solutionMapper.selectByExample 查询数据失败", e);
            /*     */
        }
        /*  72 */
        return userList;
        /*     */
    }

    /*     */
    /*     */
    @RequestMapping({"/find"})
    /*     */ public User findUserById(int id) {
        /*  77 */
        User user = null;
        /*     */
        try {
            /*  79 */
            user = this.userMapper.selectByPrimaryKey(Integer.valueOf(id));
            /*  80 */
        } catch (Exception e) {
            /*  81 */
            LOGGER.error("userMapper.selectByPrimaryKey 查询数据失败", e);
            /*     */
        }
        /*  83 */
        if (Objects.equals(user, null)) {
            /*  84 */
            LOGGER.error("查询结果为空");
            /*     */
        }
        /*  86 */
        return user;
        /*     */
    }

    /*     */
    /*     */
    @RequestMapping({"/select"})
    /*     */ public List<User> findUserByPhone(String phone) {
        /*  91 */
        List<User> userList = null;
        /*     */
        try {
            /*  93 */
            userList = this.userMapper.selectByPhone(phone);
            /*  94 */
        } catch (Exception e) {
            /*  95 */
            LOGGER.error("userMapper.selectByPrimaryKey 查询数据失败", e);
            /*     */
        }
        /*  97 */
        if (Objects.equals(userList, null)) {
            /*  98 */
            LOGGER.error("查询结果为空");
            /*     */
        }
        /* 100 */
        return userList;
        /*     */
    }
    @RequestMapping({"/updatepassword"})
    /*     */ public String updatePassword(String name, String phone, String password, String newPassword) {
        /* 105 */
        int result = 0;
        /*     */
        /*     */
        /* 108 */
        List<User> userList = this.userMapper.selectByPhone(phone);
        /* 109 */
        if (userList == null) {
            /* 110 */
            return "用户名为空";
            /*     */
        }
        /* 112 */
        if (Objects.equals(((User) userList.get(0)).getPassword(), password) && Objects.equals(((User) userList.get(0)).getPhone(), phone) && Objects.equals(((User) userList.get(0)).getName(), name)) {
            /* 113 */
            ((User) userList.get(0)).setPhone(phone).setId(((User) userList.get(0)).getId()).setPassword(newPassword);
            /*     */
            try {
                /* 115 */
                ((User) userList.get(0)).setPassword(newPassword);
                /* 116 */
                result = this.userMapper.updateByPrimaryKeySelective(userList.get(0));
                /* 117 */
            } catch (Exception e) {
                /* 118 */
                LOGGER.error("  userMapper.updateByPrimaryKey 更新数据失败", e);
                /*     */
            }
            /* 120 */
            return "密码修改成功";
            /*     */
        }
        /*     */
        /* 123 */
        return "密码或姓名错误";
        /*     */
    }
    @RequestMapping({"/updateuser"})
    /*     */ public int updateUser(@RequestParam(required = false) String loginId, @RequestParam(required = false) String updateUser, @RequestParam(required = false) String name, String phone, @RequestParam(required = false) String password, @RequestParam(required = false) String userType) {
        /* 134 */
        List<User> userList = this.userMapper.selectByPhone(phone);
        /* 135 */
        if (userList == null) {
            /* 136 */
            LOGGER.error("用户名为空");
            /*     */
        }
        /* 138 */
        User user = userList.get(0);
        /* 139 */
        user.setLoginId(loginId).setUpdateTime(Date.from(Instant.now()))
/* 140 */.setUpdateUser(updateUser).setName(name).setPhone(phone).setPassword(password).setUserType(userType);
        /* 141 */
        int result = 0;
        /*     */
        try {
            /* 143 */
            result = this.userMapper.updateByPrimaryKeySelective(user);
            /* 144 */
        } catch (Exception e) {
            /* 145 */
            LOGGER.error(" userMapper.updateByPrimaryKeySelective  更新数据失败", e);
            /*     */
        }
        /* 147 */
        return result;
        /*     */
    }

    /*     */
    @RequestMapping({"/updateuserbyid"})
    public Integer updatePasswordById(Integer id, String newPassword, String newPassword2, String password) {
        User user = userMapper.selectByPrimaryKey(id);
        if(user==null){
            LOGGER.error("没有此用户");
            return 2;
        }
        if(user.getPassword().equals(password)){
            user.setPassword(newPassword);
            userMapper.updateByPrimaryKey(user);
            return 1;
        }else {
            LOGGER.error("密码错误");
            return 0;

        }

    }
}

/* Location:              C:\Users\Administrator\Desktop\gov1\WEB-INF\classes\!\org\competition\service\UserService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */