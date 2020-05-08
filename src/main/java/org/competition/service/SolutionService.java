/*     */ package org.competition.service;
/*     */ 
/*     */ import java.time.Instant;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ import java.util.Objects;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ import org.competition.domain.Solution;
/*     */ import org.competition.mapper.SolutionMapper;
/*     */ import org.springframework.beans.factory.annotation.Autowired;
/*     */ import org.springframework.stereotype.Component;
/*     */ import org.springframework.web.bind.annotation.CrossOrigin;
/*     */ import org.springframework.web.bind.annotation.RequestMapping;
/*     */ import org.springframework.web.bind.annotation.RequestParam;
/*     */ import org.springframework.web.bind.annotation.RestController;
/*     */ 
/*     */ 
/*     */ @Component
/*     */ @RestController
/*     */ @RequestMapping({"/gov/solution"})
/*     */ @CrossOrigin(allowCredentials = "true", allowedHeaders = {"*"})
/*     */ public class SolutionService
/*     */ {
/*  25 */   public static final Logger LOGGER = LogManager.getLogger(SolutionService.class);
/*     */ 
/*     */ 
/*     */
/*     */   @Autowired
/*     */   private SolutionMapper solutionMapper;
/*     */ 

/*     */   @RequestMapping({"/add"})
/*     */   public int addSolution(@RequestParam(required = false) String name,
                                   @RequestParam(required = false) String content,
                                   @RequestParam(required = false) String createUser,
                                   @RequestParam(required = false) Integer queueId) {
/*  37 */     Solution solution = (new Solution()).setName(name).setContent(content).setCreateUser(createUser).setCreateTime(Date.from(Instant.now())).setQueueId(queueId);
/*  38 */     int result = 0;
/*     */     try {
/*  40 */       result = this.solutionMapper.insert(solution);
/*  41 */     } catch (Exception e) {
/*  42 */       LOGGER.error("solutionMapper.insert 插入数据失败", e);
/*     */     } 
/*  44 */     return result;
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
/*     */ 
/*     */ 
/*     */   
/*     */   @RequestMapping({"/update"})
/*     */   public int updateSolution(@RequestParam(required = false) String name, @RequestParam(required = false) String content, @RequestParam(required = false) String updateUser, Integer id, @RequestParam(required = false) Integer queueId) {
/*  62 */     Solution solution = (new Solution()).setName(name).setContent(content).setUpdateUser(updateUser).setId(id).setUpdateTime(Date.from(Instant.now())).setQueueId(queueId);
/*  63 */     int result = 0;
/*     */     try {
/*  65 */       result = this.solutionMapper.updateByPrimaryKeySelective(solution);
/*  66 */     } catch (Exception e) {
/*  67 */       LOGGER.error("solutionMapper.updateByPrimaryKeySelective 更新数据失败", e);
/*     */     } 
/*  69 */     if (Objects.equals(Integer.valueOf(result), Integer.valueOf(0))) {
/*  70 */       LOGGER.error("无法查询到需要更新的数据");
/*     */     }
/*  72 */     return result;
/*     */   }
/*     */   
/*     */   @RequestMapping({"/delete"})
/*     */   public int deleteSolutionById(int id) {
/*  77 */     int result = 0;
/*     */     try {
/*  79 */       result = this.solutionMapper.deleteByPrimaryKey(Integer.valueOf(id));
/*  80 */     } catch (Exception e) {
/*  81 */       LOGGER.error("solutionMapper.deleteByPrimaryKey 删除数据失败", e);
/*     */     } 
/*  83 */     if (Objects.equals(Integer.valueOf(result), Integer.valueOf(0))) {
/*  84 */       LOGGER.error("无法删除不存在的数据");
/*     */     }
/*  86 */     return result;
/*     */   }
/*     */ 
/*     */   
/*     */   @RequestMapping({"/list"})
/*     */   public List<Solution> ListSolution() {
/*  92 */     List<Solution> solutionList = null;
/*     */     try {
/*  94 */       solutionList = this.solutionMapper.selectByExample(null);
/*  95 */     } catch (Exception e) {
/*  96 */       LOGGER.error("solutionMapper.selectByExample 查询数据失败", e);
/*     */     } 
/*  98 */     return solutionList;
/*     */   }
/*     */   
/*     */   @RequestMapping({"/find"})
/*     */   public Solution findSolutionById(int id) {
/* 103 */     Solution solution = null;
/*     */     try {
/* 105 */       solution = this.solutionMapper.selectByPrimaryKey(Integer.valueOf(id));
/* 106 */     } catch (Exception e) {
/* 107 */       LOGGER.error("solutionMapper.selectByPrimaryKey 查询数据失败", e);
/*     */     } 
/* 109 */     if (Objects.equals(solution, null)) {
/* 110 */       LOGGER.error("查询结果为空");
/*     */     }
/* 112 */     return solution;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\gov1\WEB-INF\classes\!\org\competition\service\SolutionService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */