/*    */ package org.competition.utils;
/*    */ 
/*    */ import java.net.URLDecoder;
/*    */ 
/*    */ public class Decode {
/*    */   public static String DeCode(String str) {
/*  7 */     String[] strings = str.split("%2B");
/*  8 */     String result = "";
/*  9 */     for (int i = 0; i < strings.length; i++) {
/* 10 */       if (i == strings.length - 1) {
/* 11 */         result = result + URLDecoder.decode(strings[i]);
/*    */       } else {
/*    */         
/* 14 */         result = result + URLDecoder.decode(strings[i]) + "+";
/*    */       } 
/*    */     } 
/* 17 */     return result;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\gov1\WEB-INF\classes\!\org\competitio\\utils\Decode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */