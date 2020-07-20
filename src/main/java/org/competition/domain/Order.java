package org.competition.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.experimental.Accessors;

import java.util.Date;

@Accessors(chain = true)
@lombok.Data
public class Order {
    private Integer id;

    private Integer customerId;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;

    private String updateUser;

    private String contact;

    private String kcontact;

    private String kcontactPhone;

    private String kcontactEmail;

    private String orderNumber;

    private String name;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date startDate;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date finishDate;

    private String contactPhone;

    private String contactEmail;

    private String content;

    private String feedback;

    private Integer queueId;

    private String backup1;

    private String backup2;

    public Order setId(Integer id) {
        this.id = id;
        return this;
    }

    public Order setCustomerId(Integer customerId) {
        this.customerId = customerId;
        return this;
    }

    public Order setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Order setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public Order setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
        return this;
    }

    public Order setContact(String contact) {
        this.contact = contact;
        return this;
    }

    public Order setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
        return this;
    }

    public Order setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
        return this;
    }

    public Order setContent(String content) {
        this.content = content;
        return this;
    }

    public Order setFeedback(String feedback) {
        this.feedback = feedback;
        return this;
    }

    public Order setQueueId(Integer queueId) {
        this.queueId = queueId;
        return this;
    }

    public Order setBackup1(String backup1) {
        this.backup1 = backup1;
        return this;
    }

    public Order setBackup2(String backup2) {
        this.backup2 = backup2;
        return this;
    }

    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Order))
            return false;
        Order other = (Order) o;
        if (!other.canEqual(this))
            return false;
        Object this$id = getId(), other$id = other.getId();
        if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id))
            return false;
        Object this$customerId = getCustomerId(), other$customerId = other.getCustomerId();
        if ((this$customerId == null) ? (other$customerId != null) : !this$customerId.equals(other$customerId))
            return false;
        Object this$createTime = getCreateTime(), other$createTime = other.getCreateTime();
        if ((this$createTime == null) ? (other$createTime != null) : !this$createTime.equals(other$createTime))
            return false;
        Object this$updateTime = getUpdateTime(), other$updateTime = other.getUpdateTime();
        if ((this$updateTime == null) ? (other$updateTime != null) : !this$updateTime.equals(other$updateTime))
            return false;
        Object this$updateUser = getUpdateUser(), other$updateUser = other.getUpdateUser();
        if ((this$updateUser == null) ? (other$updateUser != null) : !this$updateUser.equals(other$updateUser))
            return false;
        Object this$contact = getContact(), other$contact = other.getContact();
        if ((this$contact == null) ? (other$contact != null) : !this$contact.equals(other$contact))
            return false;
        Object this$contactPhone = getContactPhone(), other$contactPhone = other.getContactPhone();
        if ((this$contactPhone == null) ? (other$contactPhone != null) : !this$contactPhone.equals(other$contactPhone))
            return false;
        Object this$contactEmail = getContactEmail(), other$contactEmail = other.getContactEmail();
        if ((this$contactEmail == null) ? (other$contactEmail != null) : !this$contactEmail.equals(other$contactEmail))
            return false;
        Object this$content = getContent(), other$content = other.getContent();
        if ((this$content == null) ? (other$content != null) : !this$content.equals(other$content))
            return false;
        Object this$feedback = getFeedback(), other$feedback = other.getFeedback();
        if ((this$feedback == null) ? (other$feedback != null) : !this$feedback.equals(other$feedback))
            return false;
        Object this$queueId = getQueueId(), other$queueId = other.getQueueId();
        if ((this$queueId == null) ? (other$queueId != null) : !this$queueId.equals(other$queueId))
            return false;
        Object this$backup1 = getBackup1(), other$backup1 = other.getBackup1();
        if ((this$backup1 == null) ? (other$backup1 != null) : !this$backup1.equals(other$backup1))
            return false;
        Object this$backup2 = getBackup2(), other$backup2 = other.getBackup2();
        return !((this$backup2 == null) ? (other$backup2 != null) : !this$backup2.equals(other$backup2));
    }

    protected boolean canEqual(Object other) {
        return other instanceof Order;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $id = getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        Object $customerId = getCustomerId();
        result = result * 59 + (($customerId == null) ? 43 : $customerId.hashCode());
        Object $createTime = getCreateTime();
        result = result * 59 + (($createTime == null) ? 43 : $createTime.hashCode());
        Object $updateTime = getUpdateTime();
        result = result * 59 + (($updateTime == null) ? 43 : $updateTime.hashCode());
        Object $updateUser = getUpdateUser();
        result = result * 59 + (($updateUser == null) ? 43 : $updateUser.hashCode());
        Object $contact = getContact();
        result = result * 59 + (($contact == null) ? 43 : $contact.hashCode());
        Object $contactPhone = getContactPhone();
        result = result * 59 + (($contactPhone == null) ? 43 : $contactPhone.hashCode());
        Object $contactEmail = getContactEmail();
        result = result * 59 + (($contactEmail == null) ? 43 : $contactEmail.hashCode());
        Object $content = getContent();
        result = result * 59 + (($content == null) ? 43 : $content.hashCode());
        Object $feedback = getFeedback();
        result = result * 59 + (($feedback == null) ? 43 : $feedback.hashCode());
        Object $queueId = getQueueId();
        result = result * 59 + (($queueId == null) ? 43 : $queueId.hashCode());
        Object $backup1 = getBackup1();
        result = result * 59 + (($backup1 == null) ? 43 : $backup1.hashCode());
        Object $backup2 = getBackup2();
        return result * 59 + (($backup2 == null) ? 43 : $backup2.hashCode());
    }

    public String toString() {
        return "Order(id=" + getId() + ", customerId=" + getCustomerId() + ", createTime=" + getCreateTime() + ", updateTime=" + getUpdateTime() + ", updateUser=" + getUpdateUser() + ", contact=" + getContact() + ", contactPhone=" + getContactPhone() + ", contactEmail=" + getContactEmail() + ", content=" + getContent() + ", feedback=" + getFeedback() + ", queueId=" + getQueueId() + ", backup1=" + getBackup1() + ", backup2=" + getBackup2() + ")";
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getCustomerId() {
        return this.customerId;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public Date getUpdateTime() {
        return this.updateTime;
    }

    public String getUpdateUser() {
        return this.updateUser;
    }

    public String getContact() {
        return this.contact;
    }

    public String getContactPhone() {
        return this.contactPhone;
    }

    public String getContactEmail() {
        return this.contactEmail;
    }

    public String getContent() {
        return this.content;
    }

    public String getFeedback() {
        return this.feedback;
    }

    public Integer getQueueId() {
        return this.queueId;
    }

    public String getBackup1() {
        return this.backup1;
    }

    public String getBackup2() {
        return this.backup2;
    }
}
