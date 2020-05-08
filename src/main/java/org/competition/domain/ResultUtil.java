/*    */ package org.competition.domain;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ResultUtil
/*    */ {
/*    */   public static Result success() {
/* 10 */     return success(null);
/*    */   }
/*    */   public static Result success(Object object) {
/* 13 */     Result<Object> result = new Result();
/* 14 */     result.setCode(ResultCode.SUCCESS.intValue());
/* 15 */     result.setMsg("成功");
/* 16 */     result.setData(object);
/* 17 */     return result;
/*    */   }
/*    */   public static Result success(Integer code, Object object) {
/* 20 */     Result<Object> result = new Result();
/* 21 */     result.setCode(code.intValue());
/* 22 */     result.setMsg("成功");
/* 23 */     result.setData(object);
/* 24 */     return result;
/*    */   }
/*    */   public static Result success(Integer code, String msg, Object object) {
/* 27 */     Result<Object> result = new Result();
/* 28 */     result.setCode(code.intValue());
/* 29 */     result.setMsg(msg);
/* 30 */     result.setData(object);
/* 31 */     return result;
/*    */   }
/*    */   public static Result error(String msg) {
/* 34 */     Result result = new Result();
/* 35 */     result.setCode(ResultCode.ERROR.intValue());
/* 36 */     result.setMsg(msg);
/* 37 */     return result;
/*    */   }
/*    */   public static Result error(Integer code, String msg) {
/* 40 */     Result result = new Result();
/* 41 */     result.setCode(code.intValue());
/* 42 */     result.setMsg(msg);
/* 43 */     return result;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\gov1\WEB-INF\classes\!\org\competition\domain\ResultUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */