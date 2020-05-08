/*    */ package org.competition.domain;
/*    */ 
/*    */ 
/*    */ public class RespBean
/*    */ {
/*    */   private String status;
/*    */   private String msg;
/*    */   
/*    */   public RespBean() {}
/*    */   
/*    */   public RespBean(String status, String msg) {
/* 12 */     this.status = status;
/* 13 */     this.msg = msg;
/*    */   }
/*    */   
/*    */   public String getStatus() {
/* 17 */     return this.status;
/*    */   }
/*    */   
/*    */   public void setStatus(String status) {
/* 21 */     this.status = status;
/*    */   }
/*    */   
/*    */   public String getMsg() {
/* 25 */     return this.msg;
/*    */   }
/*    */   
/*    */   public void setMsg(String msg) {
/* 29 */     this.msg = msg;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\gov1\WEB-INF\classes\!\org\competition\domain\RespBean.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */