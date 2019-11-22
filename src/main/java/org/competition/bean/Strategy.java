package org.competition.bean;

import java.sql.Timestamp;
import java.util.List;
public class Strategy {

    private Long id;
    private String strTitle;
    private String mdContent;
    private String htmlContent;
    private Timestamp publishDate;
    private Timestamp editTime;
    private String summary;
    private Integer state;
    private String income;
    private Long iId;
    private Long uId;
    private List<User> userId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStrTitle() {
        return strTitle;
    }

    public void setStrTitle(String strTitle) {
        this.strTitle = strTitle;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public Long getiId() {
        return iId;
    }

    public void setiId(Long iId) {
        this.iId = iId;
    }

    public Long getuId() {
        return uId;
    }

    public List<User> getUserId() {
        return userId;
    }

    public void setUserId(List<User> userId) {
        this.userId = userId;
    }

    public String getMdContent() {
        return mdContent;
    }

    public void setMdContent(String mdContent) {
        this.mdContent = mdContent;
    }

    public String getHtmlContent() {
        return htmlContent;
    }

    public void setHtmlContent(String htmlContent) {
        this.htmlContent = htmlContent;
    }

    public Timestamp getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Timestamp publishDate) {
        this.publishDate = publishDate;
    }

    public Timestamp getEditTime() {
        return editTime;
    }

    public void setEditTime(Timestamp editTime) {
        this.editTime = editTime;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Long getuId(Long id) {
        return uId;
    }

    public void setuId(Long uId) {
        this.uId = uId;
    }
}
