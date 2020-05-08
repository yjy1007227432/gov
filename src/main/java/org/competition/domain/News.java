/*    */
package org.competition.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/*    */ public class News {
    private Integer id;
    /*    */   private String title;
    /*    */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    /*    */ private Date createTime;
    /*    */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    /*    */ private Date updateTime;
    /*    */   private String createUser;

    /*    */
    /* 10 */
    public News setId(Integer id) {
        this.id = id;
        return this;
    }

    private String updateUser;
    private String content;
    private Integer queueId;
    private String backup1;
    private String backup2;

    public News setTitle(String title) {
        this.title = title;
        return this;
    }

    public News setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public News setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public News setCreateUser(String createUser) {
        this.createUser = createUser;
        return this;
    }

    public News setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
        return this;
    }

    public News setContent(String content) {
        this.content = content;
        return this;
    }

    public News setQueueId(Integer queueId) {
        this.queueId = queueId;
        return this;
    }

    public News setBackup1(String backup1) {
        this.backup1 = backup1;
        return this;
    }

    public News setBackup2(String backup2) {
        this.backup2 = backup2;
        return this;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof News)) return false;
        News other = (News) o;
        if (!other.canEqual(this)) return false;
        Object this$id = getId(), other$id = other.getId();
        if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;
        Object this$title = getTitle(), other$title = other.getTitle();
        if ((this$title == null) ? (other$title != null) : !this$title.equals(other$title)) return false;
        Object this$createTime = getCreateTime(), other$createTime = other.getCreateTime();
        if ((this$createTime == null) ? (other$createTime != null) : !this$createTime.equals(other$createTime))
            return false;
        Object this$updateTime = getUpdateTime(), other$updateTime = other.getUpdateTime();
        if ((this$updateTime == null) ? (other$updateTime != null) : !this$updateTime.equals(other$updateTime))
            return false;
        Object this$createUser = getCreateUser(), other$createUser = other.getCreateUser();
        if ((this$createUser == null) ? (other$createUser != null) : !this$createUser.equals(other$createUser))
            return false;
        Object this$updateUser = getUpdateUser(), other$updateUser = other.getUpdateUser();
        if ((this$updateUser == null) ? (other$updateUser != null) : !this$updateUser.equals(other$updateUser))
            return false;
        Object this$content = getContent(), other$content = other.getContent();
        if ((this$content == null) ? (other$content != null) : !this$content.equals(other$content)) return false;
        Object this$queueId = getQueueId(), other$queueId = other.getQueueId();
        if ((this$queueId == null) ? (other$queueId != null) : !this$queueId.equals(other$queueId)) return false;
        Object this$backup1 = getBackup1(), other$backup1 = other.getBackup1();
        if ((this$backup1 == null) ? (other$backup1 != null) : !this$backup1.equals(other$backup1)) return false;
        Object this$backup2 = getBackup2(), other$backup2 = other.getBackup2();
        return !((this$backup2 == null) ? (other$backup2 != null) : !this$backup2.equals(other$backup2));
    }

    protected boolean canEqual(Object other) {
        return other instanceof News;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $id = getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        Object $title = getTitle();
        result = result * 59 + (($title == null) ? 43 : $title.hashCode());
        Date $createTime = getCreateTime();
        result = result * 59 + (($createTime == null) ? 43 : $createTime.hashCode());
        Date $updateTime = getUpdateTime();
        result = result * 59 + (($updateTime == null) ? 43 : $updateTime.hashCode());
        Object $createUser = getCreateUser();
        result = result * 59 + (($createUser == null) ? 43 : $createUser.hashCode());
        Object $updateUser = getUpdateUser();
        result = result * 59 + (($updateUser == null) ? 43 : $updateUser.hashCode());
        Object $content = getContent();
        result = result * 59 + (($content == null) ? 43 : $content.hashCode());
        Object $queueId = getQueueId();
        result = result * 59 + (($queueId == null) ? 43 : $queueId.hashCode());
        Object $backup1 = getBackup1();
        result = result * 59 + (($backup1 == null) ? 43 : $backup1.hashCode());
        Object $backup2 = getBackup2();
        return result * 59 + (($backup2 == null) ? 43 : $backup2.hashCode());
    }

    public String toString() {
        return "News(id=" + getId() + ", title=" + getTitle() + ", createTime=" + getCreateTime() + ", updateTime=" + getUpdateTime() + ", createUser=" + getCreateUser() + ", updateUser=" + getUpdateUser() + ", content=" + getContent() + ", queueId=" + getQueueId() + ", backup1=" + getBackup1() + ", backup2=" + getBackup2() + ")";
    }

    /*    */
    public Integer getId() {
        /* 12 */
        return this.id;
        /*    */
    }

    public String getTitle() {
        /* 14 */
        return this.title;
        /*    */
    }

    /*    */
    public Date getCreateTime() {
        /* 17 */
        return this.createTime;
        /*    */
    }

    public Date getUpdateTime() {
        /* 19 */
        return this.updateTime;
        /*    */
    }

    public String getCreateUser() {
        /* 21 */
        return this.createUser;
        /*    */
    }

    public String getUpdateUser() {
        /* 23 */
        return this.updateUser;
        /*    */
    }

    public String getContent() {
        /* 25 */
        return this.content;
        /*    */
    }

    public Integer getQueueId() {
        /* 27 */
        return this.queueId;
        /*    */
    }

    public String getBackup1() {
        /* 29 */
        return this.backup1;
        /*    */
    }

    public String getBackup2() {
        /* 31 */
        return this.backup2;
        /*    */
    }
}


/* Location:              C:\Users\Administrator\Desktop\gov1\WEB-INF\classes\!\org\competition\domain\News.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */