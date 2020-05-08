/*    */ package org.competition.domain;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Result<T>
/*    */ {
/*    */   private long code;
/*    */   private String msg;
/*    */   private T data;
/*    */   
/*    */   public long getCode() {
/* 20 */     return this.code;
/*    */   }
/*    */   
/*    */   public void setCode(long code) {
/* 24 */     this.code = code;
/*    */   }
/*    */   
/*    */   public String getMsg() {
/* 28 */     return this.msg;
/*    */   }
/*    */   
/*    */   public void setMsg(String msg) {
/* 32 */     this.msg = msg;
/*    */   }
/*    */   
/*    */   public T getData() {
/* 36 */     return this.data;
/*    */   }
/*    */   
/*    */   public void setData(T data) {
/* 40 */     this.data = data;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\gov1\WEB-INF\classes\!\org\competition\domain\Result.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */