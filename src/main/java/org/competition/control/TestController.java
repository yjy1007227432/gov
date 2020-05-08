/*    */ package org.competition.control;
/*    */ 
/*    */ import org.springframework.stereotype.Controller;
/*    */ import org.springframework.web.bind.annotation.GetMapping;
/*    */ import org.springframework.web.bind.annotation.RequestMapping;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Controller
/*    */ public class TestController
/*    */ {
/*    */   @RequestMapping({"/upload"})
/*    */   public String test() {
/* 16 */     return "index";
/*    */   }
/*    */   
/*    */   @GetMapping({"/dashboard"})
/*    */   public String hello() {
/* 21 */     return "dashboard";
/*    */   }
/*    */   
/*    */   @GetMapping({"/error"})
/*    */   public String error() {
/* 26 */     return "error";
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\gov1\WEB-INF\classes\!\org\competition\control\TestController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */