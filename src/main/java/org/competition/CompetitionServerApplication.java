/*    */ package org.competition;
/*    */ 
/*    */ import org.mybatis.spring.annotation.MapperScan;
/*    */ import org.springframework.boot.SpringApplication;
/*    */ import org.springframework.boot.autoconfigure.SpringBootApplication;
/*    */ import org.springframework.scheduling.annotation.EnableScheduling;
/*    */ 
/*    */ @SpringBootApplication
/*    */ @EnableScheduling
/*    */ @MapperScan(basePackages = {"org.competition.mapper"})
/*    */ public class CompetitionServerApplication
/*    */ {
/*    */   public static void main(String[] args) {
/* 14 */     SpringApplication.run(CompetitionServerApplication.class, args);
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\gov1\WEB-INF\classes\!\org\competition\CompetitionServerApplication.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */