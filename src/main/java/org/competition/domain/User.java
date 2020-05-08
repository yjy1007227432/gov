/*    */
package org.competition.domain;

import java.util.Date;

/*    */ public class User {
    /*    */   private Integer id;
    /*    */   private String loginId;
    /*    */   private Date createTime;
    /*    */   private Date updateTime;
    /*    */   private String createUser;

    /*    */
    /*  9 */
    public User setId(Integer id) {
        this.id = id;
        return this;
    }

    private String updateUser;
    private String name;
    private String phone;
    private String password;
    private String userType;

    public User setLoginId(String loginId) {
        this.loginId = loginId;
        return this;
    }

    public User setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public User setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public User setCreateUser(String createUser) {
        this.createUser = createUser;
        return this;
    }

    public User setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
        return this;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public User setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public User setUserType(String userType) {
        this.userType = userType;
        return this;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof User)) return false;
        User other = (User) o;
        if (!other.canEqual(this)) return false;
        Object this$id = getId(), other$id = other.getId();
        if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;
        Object this$loginId = getLoginId(), other$loginId = other.getLoginId();
        if ((this$loginId == null) ? (other$loginId != null) : !this$loginId.equals(other$loginId)) return false;
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
        Object this$name = getName(), other$name = other.getName();
        if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name)) return false;
        Object this$phone = getPhone(), other$phone = other.getPhone();
        if ((this$phone == null) ? (other$phone != null) : !this$phone.equals(other$phone)) return false;
        Object this$password = getPassword(), other$password = other.getPassword();
        if ((this$password == null) ? (other$password != null) : !this$password.equals(other$password)) return false;
        Object this$userType = getUserType(), other$userType = other.getUserType();
        return !((this$userType == null) ? (other$userType != null) : !this$userType.equals(other$userType));
    }

    protected boolean canEqual(Object other) {
        return other instanceof User;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $id = getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        Object $loginId = getLoginId();
        result = result * 59 + (($loginId == null) ? 43 : $loginId.hashCode());
        Date  $createTime = getCreateTime();
        result = result * 59 + (($createTime == null) ? 43 : $createTime.hashCode());
        Date $updateTime = getUpdateTime();
        result = result * 59 + (($updateTime == null) ? 43 : $updateTime.hashCode());
        Object $createUser = getCreateUser();
        result = result * 59 + (($createUser == null) ? 43 : $createUser.hashCode());
        Object $updateUser = getUpdateUser();
        result = result * 59 + (($updateUser == null) ? 43 : $updateUser.hashCode());
        Object $name = getName();
        result = result * 59 + (($name == null) ? 43 : $name.hashCode());
        Object $phone = getPhone();
        result = result * 59 + (($phone == null) ? 43 : $phone.hashCode());
        Object $password = getPassword();
        result = result * 59 + (($password == null) ? 43 : $password.hashCode());
        Object $userType = getUserType();
        return result * 59 + (($userType == null) ? 43 : $userType.hashCode());
    }

    public String toString() {
        return "User(id=" + getId() + ", loginId=" + getLoginId() + ", createTime=" + getCreateTime() + ", updateTime=" + getUpdateTime() + ", createUser=" + getCreateUser() + ", updateUser=" + getUpdateUser() + ", name=" + getName() + ", phone=" + getPhone() + ", password=" + getPassword() + ", userType=" + getUserType() + ")";
    }

    /*    */
    public Integer getId() {
        /* 11 */
        return this.id;
        /*    */
    }

    public String getLoginId() {
        /* 13 */
        return this.loginId;
        /*    */
    }

    public Date getCreateTime() {
        /* 15 */
        return this.createTime;
        /*    */
    }

    public Date getUpdateTime() {
        /* 17 */
        return this.updateTime;
        /*    */
    }

    public String getCreateUser() {
        /* 19 */
        return this.createUser;
        /*    */
    }

    public String getUpdateUser() {
        /* 21 */
        return this.updateUser;
        /*    */
    }

    public String getName() {
        /* 23 */
        return this.name;
        /*    */
    }

    public String getPhone() {
        /* 25 */
        return this.phone;
        /*    */
    }

    public String getPassword() {
        /* 27 */
        return this.password;
        /*    */
    }

    public String getUserType() {
        /* 29 */
        return this.userType;
        /*    */
    }
    /*    */
}


/* Location:              C:\Users\Administrator\Desktop\gov1\WEB-INF\classes\!\org\competition\domain\User.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */