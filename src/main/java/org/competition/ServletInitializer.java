/*    */ package org.competition;
/*    */ 
/*    */ import org.springframework.boot.builder.SpringApplicationBuilder;
/*    */ import org.springframework.boot.web.support.SpringBootServletInitializer;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ServletInitializer
/*    */   extends SpringBootServletInitializer
/*    */ {
/*    */   protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
/* 12 */     return application.sources(new Class[] { CompetitionServerApplication.class });
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\gov1\WEB-INF\classes\!\org\competition\ServletInitializer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */