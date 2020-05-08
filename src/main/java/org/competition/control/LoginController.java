/*    */ package org.competition.control;
/*    */ 
/*    */ import java.util.List;
/*    */ import java.util.Objects;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ import org.competition.domain.LoginResult;
/*    */ import org.competition.domain.User;
/*    */ import org.competition.service.UserService;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.stereotype.Component;
/*    */ import org.springframework.web.bind.annotation.CrossOrigin;
/*    */ import org.springframework.web.bind.annotation.RequestMapping;
/*    */ import org.springframework.web.bind.annotation.RestController;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Component
/*    */ @RestController
/*    */ @RequestMapping({"/gov/login"})
/*    */ @CrossOrigin(allowCredentials = "true", allowedHeaders = {"*"})
/*    */ public class LoginController
/*    */ {
/*    */   @Autowired
/*    */   UserService userService;
/* 29 */   private static final Logger LOGGER = LogManager.getLogger(LoginController.class);
/*    */ 
/*    */   
/*    */   @RequestMapping({"/login"})
/*    */   public LoginResult login(String username, String password) {
/* 34 */     List<User> userList = null;
/*    */     try {
/* 36 */       userList = this.userService.findUserByPhone(username);
/* 37 */     } catch (Exception e) {
/* 38 */       LOGGER.error("userService.findUserByPhone 删除数据失败", e);
/*    */     } 
/* 40 */     if (userList == null || userList.size() > 1) {
/* 41 */       return new LoginResult(false, null, "用户名或密码错误");
/*    */     }
/* 43 */     if (Objects.equals(Integer.valueOf(userList.size()), Integer.valueOf(1)) && Objects.equals(((User)userList.get(0)).getPassword(), password)) {
/* 44 */       return new LoginResult(true, userList.get(0), "登录成功");
/*    */     }
/*    */ 
/*    */     
/* 48 */     return new LoginResult(false, null, "用户名或密码错误");
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\gov1\WEB-INF\classes\!\org\competition\control\LoginController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */