/*    */
package org.competition.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/*    */ public class Customer {
    private Integer id;
    /*    */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    /*    */ private Date createTime;
    /*    */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    /*    */ private Date updateTime;
    /*    */   private String createUser;
    /*    */   private String updateUser;
    /*    */   private String vipcard;

    /*    */
    /* 11 */
    public Customer setId(Integer id) {
        this.id = id;
        return this;
    }

    private String name;
    private String customerManager;
    private String managerPhone;
    private String contact;
    private String contactPhone;
    private String customerType;
    private String customerGroup;

    public Customer setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Customer setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public Customer setCreateUser(String createUser) {
        this.createUser = createUser;
        return this;
    }

    public Customer setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
        return this;
    }

    public Customer setVipcard(String vipcard) {
        this.vipcard = vipcard;
        return this;
    }

    public Customer setName(String name) {
        this.name = name;
        return this;
    }

    public Customer setCustomerManager(String customerManager) {
        this.customerManager = customerManager;
        return this;
    }

    public Customer setManagerPhone(String managerPhone) {
        this.managerPhone = managerPhone;
        return this;
    }

    public Customer setContact(String contact) {
        this.contact = contact;
        return this;
    }

    public Customer setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
        return this;
    }

    public Customer setCustomerType(String customerType) {
        this.customerType = customerType;
        return this;
    }

    public Customer setCustomerGroup(String customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Customer)) return false;
        Customer other = (Customer) o;
        if (!other.canEqual(this)) return false;
        Object this$id = getId(), other$id = other.getId();
        if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;
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
        Object this$vipcard = getVipcard(), other$vipcard = other.getVipcard();
        if ((this$vipcard == null) ? (other$vipcard != null) : !this$vipcard.equals(other$vipcard)) return false;
        Object this$name = getName(), other$name = other.getName();
        if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name)) return false;
        Object this$customerManager = getCustomerManager(), other$customerManager = other.getCustomerManager();
        if ((this$customerManager == null) ? (other$customerManager != null) : !this$customerManager.equals(other$customerManager))
            return false;
        Object this$managerPhone = getManagerPhone(), other$managerPhone = other.getManagerPhone();
        if ((this$managerPhone == null) ? (other$managerPhone != null) : !this$managerPhone.equals(other$managerPhone))
            return false;
        Object this$contact = getContact(), other$contact = other.getContact();
        if ((this$contact == null) ? (other$contact != null) : !this$contact.equals(other$contact)) return false;
        Object this$contactPhone = getContactPhone(), other$contactPhone = other.getContactPhone();
        if ((this$contactPhone == null) ? (other$contactPhone != null) : !this$contactPhone.equals(other$contactPhone))
            return false;
        Object this$customerType = getCustomerType(), other$customerType = other.getCustomerType();
        if ((this$customerType == null) ? (other$customerType != null) : !this$customerType.equals(other$customerType))
            return false;
        Object this$customerGroup = getCustomerGroup(), other$customerGroup = other.getCustomerGroup();
        return !((this$customerGroup == null) ? (other$customerGroup != null) : !this$customerGroup.equals(other$customerGroup));
    }

    protected boolean canEqual(Object other) {
        return other instanceof Customer;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $id = getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        Object $createTime = getCreateTime();
        result = result * 59 + (($createTime == null) ? 43 : $createTime.hashCode());
        Object $updateTime = getUpdateTime();
        result = result * 59 + (($updateTime == null) ? 43 : $updateTime.hashCode());
        Object $createUser = getCreateUser();
        result = result * 59 + (($createUser == null) ? 43 : $createUser.hashCode());
        Object $updateUser = getUpdateUser();
        result = result * 59 + (($updateUser == null) ? 43 : $updateUser.hashCode());
        Object $vipcard = getVipcard();
        result = result * 59 + (($vipcard == null) ? 43 : $vipcard.hashCode());
        Object $name = getName();
        result = result * 59 + (($name == null) ? 43 : $name.hashCode());
        Object $customerManager = getCustomerManager();
        result = result * 59 + (($customerManager == null) ? 43 : $customerManager.hashCode());
        Object $managerPhone = getManagerPhone();
        result = result * 59 + (($managerPhone == null) ? 43 : $managerPhone.hashCode());
        Object $contact = getContact();
        result = result * 59 + (($contact == null) ? 43 : $contact.hashCode());
        Object $contactPhone = getContactPhone();
        result = result * 59 + (($contactPhone == null) ? 43 : $contactPhone.hashCode());
        Object $customerType = getCustomerType();
        result = result * 59 + (($customerType == null) ? 43 : $customerType.hashCode());
        Object $customerGroup = getCustomerGroup();
        return result * 59 + (($customerGroup == null) ? 43 : $customerGroup.hashCode());
    }

    public String toString() {
        return "Customer(id=" + getId() + ", createTime=" + getCreateTime() + ", updateTime=" + getUpdateTime() + ", createUser=" + getCreateUser() + ", updateUser=" + getUpdateUser() + ", vipcard=" + getVipcard() + ", name=" + getName() + ", customerManager=" + getCustomerManager() + ", managerPhone=" + getManagerPhone() + ", contact=" + getContact() + ", contactPhone=" + getContactPhone() + ", customerType=" + getCustomerType() + ", customerGroup=" + getCustomerGroup() + ")";
    }

    /*    */
    public Integer getId() {
        /* 13 */
        return this.id;
        /*    */
    }

    /*    */
    public Date getCreateTime() {
        /* 16 */
        return this.createTime;
        /*    */
    }

    /*    */
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

    public String getVipcard() {
        /* 25 */
        return this.vipcard;
        /*    */
    }

    public String getName() {
        /* 27 */
        return this.name;
        /*    */
    }

    public String getCustomerManager() {
        /* 29 */
        return this.customerManager;
        /*    */
    }

    public String getManagerPhone() {
        /* 31 */
        return this.managerPhone;
        /*    */
    }

    public String getContact() {
        /* 33 */
        return this.contact;
        /*    */
    }

    public String getContactPhone() {
        /* 35 */
        return this.contactPhone;
        /*    */
    }

    public String getCustomerType() {
        /* 37 */
        return this.customerType;
        /*    */
    }

    public String getCustomerGroup() {
        /* 39 */
        return this.customerGroup;
        /*    */
    }
}


/* Location:              C:\Users\Administrator\Desktop\gov1\WEB-INF\classes\!\org\competition\domain\Customer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */