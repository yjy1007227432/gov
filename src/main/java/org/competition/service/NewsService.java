/*     */ package org.competition.service;
/*     */ 
/*     */ import java.time.Instant;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ import java.util.Objects;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ import org.competition.domain.News;
/*     */ import org.competition.mapper.NewsMapper;
/*     */ import org.springframework.beans.factory.annotation.Autowired;
/*     */ import org.springframework.stereotype.Component;
/*     */ import org.springframework.web.bind.annotation.CrossOrigin;
/*     */ import org.springframework.web.bind.annotation.RequestMapping;
/*     */ import org.springframework.web.bind.annotation.RequestParam;
/*     */ import org.springframework.web.bind.annotation.RestController;
/*     */ 
/*     */ @Component
/*     */ @RestController
/*     */ @RequestMapping({"/gov/news"})
/*     */ @CrossOrigin(allowCredentials = "true", allowedHeaders = {"*"})
/*     */ public class NewsService
/*     */ {
/*  24 */   static final Logger LOGGER = LogManager.getLogger(NewsService.class);

/*     */   @Autowired
/*     */   private NewsMapper newsMapper;
/*     */
/*     */   
/*     */   @RequestMapping({"/add"})
/*     */   public int addNews(@RequestParam(required = false) String title, @RequestParam(required = false) String content, @RequestParam(required = false) String createUser, @RequestParam(required = false) Integer queueId) {
/*  40 */     News news = new News();
/*  41 */     news.setContent(content).setCreateUser(createUser).setTitle(title)
/*  42 */       .setCreateTime(Date.from(Instant.now())).setQueueId(queueId);
/*  43 */     int result = 0;
/*     */     try {
/*  45 */       result = this.newsMapper.insert(news);
/*  46 */     } catch (Exception e) {
/*  47 */       LOGGER.error("newsMapper.insert插入数据失败", e);
/*     */     } 
/*  49 */     return result;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RequestMapping({"/update"})
/*     */   public int updateNews(@RequestParam(required = false) String title, @RequestParam(required = false) String content, @RequestParam(required = false) String updateUser, int id, @RequestParam(required = false) Integer queueId) {
/*  64 */     News news = new News();
/*  65 */     news.setContent(content).setUpdateUser(updateUser).setTitle(title)
/*  66 */       .setId(Integer.valueOf(id)).setUpdateTime(Date.from(Instant.now())).setQueueId(queueId);
/*  67 */     int result = 0;
/*     */     try {
/*  69 */       result = this.newsMapper.updateByPrimaryKeySelective(news);
/*  70 */     } catch (Exception e) {
/*  71 */       LOGGER.error("newsMapper.updateByPrimaryKey更新数据失败", e);
/*     */     } 
/*  73 */     if (Objects.equals(Integer.valueOf(result), Integer.valueOf(0))) {
/*  74 */       LOGGER.error("无法查询到需要更新的数据");
/*     */     }
/*  76 */     return result;
/*     */   }
/*     */   
/*     */   @RequestMapping({"/delete"})
/*     */   public int deleteNewsById(int id) {
/*  81 */     int result = 0;
/*     */     try {
/*  83 */       result = this.newsMapper.deleteByPrimaryKey(Integer.valueOf(id));
/*  84 */     } catch (Exception e) {
/*  85 */       LOGGER.error("newsMapper.deleteByPrimaryKey删除数据失败", e);
/*     */     } 
/*  87 */     if (Objects.equals(Integer.valueOf(result), Integer.valueOf(0))) {
/*  88 */       LOGGER.error("无法删除不存在的数据");
/*     */     }
/*  90 */     return result;
/*     */   }
/*     */   
/*     */   @RequestMapping({"/list"})
/*     */   public List<News> ListNews() {
/*  95 */     List<News> newsList = null;
/*     */     try {
/*  97 */       newsList = this.newsMapper.selectByExample(null);
/*  98 */     } catch (Exception e) {
/*  99 */       LOGGER.error("newsMapper.selectByExample查询数据失败", e);
/*     */     } 
/* 101 */     return newsList;
/*     */   }
/*     */   
/*     */   @RequestMapping({"/find"})
/*     */   public News findNewsById(int id) {
/* 106 */     News news = null;
/*     */     try {
/* 108 */       news = this.newsMapper.selectByPrimaryKey(Integer.valueOf(id));
/* 109 */     } catch (Exception e) {
/* 110 */       LOGGER.error("newsMapper.selectByExample查询数据失败", e);
/*     */     } 
/* 112 */     if (Objects.equals(news, null)) {
/* 113 */       LOGGER.error("查询结果为空");
/*     */     }
/* 115 */     return news;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\gov1\WEB-INF\classes\!\org\competition\service\NewsService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */