/*    */ package org.competition.control;
/*    */ 
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import org.springframework.stereotype.Controller;
/*    */ import org.springframework.web.bind.annotation.RequestMapping;
/*    */ 
/*    */ 
/*    */ @Controller
/*    */ public class IndexController
/*    */ {
/*    */   @RequestMapping({"/"})
/*    */   public String uploadFile(HttpServletResponse response, HttpServletRequest request) {
/* 14 */     return "index";
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\gov1\WEB-INF\classes\!\org\competition\control\IndexController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */