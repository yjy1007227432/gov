/*    */ package org.competition.dao;
/*    */ 
/*    */ public class OrderPojo {
/*    */   private Integer customerId;
/*    */   private String updateUser;
/*    */   private String contact;
/*    */   
/*  8 */   public void setCustomerId(Integer customerId) { this.customerId = customerId; } private String contactPhone; private String contactEmail; private String content; private String feedback; public void setUpdateUser(String updateUser) { this.updateUser = updateUser; } public void setContact(String contact) { this.contact = contact; } public void setContactPhone(String contactPhone) { this.contactPhone = contactPhone; } public void setContactEmail(String contactEmail) { this.contactEmail = contactEmail; } public void setContent(String content) { this.content = content; } public void setFeedback(String feedback) { this.feedback = feedback; }
/*    */   
/*    */   public Integer getCustomerId() {
/* 11 */     return this.customerId;
/*    */   } public String getUpdateUser() {
/* 13 */     return this.updateUser;
/*    */   } public String getContact() {
/* 15 */     return this.contact;
/*    */   } public String getContactPhone() {
/* 17 */     return this.contactPhone;
/*    */   } public String getContactEmail() {
/* 19 */     return this.contactEmail;
/*    */   } public String getContent() {
/* 21 */     return this.content;
/*    */   } public String getFeedback() {
/* 23 */     return this.feedback;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\gov1\WEB-INF\classes\!\org\competition\dao\OrderPojo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */