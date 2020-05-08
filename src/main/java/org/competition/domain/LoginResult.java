/*    */
package org.competition.domain;

import java.io.Serializable;

/*    */
/*    */ public class LoginResult implements Serializable {
    /*    */   private static final long serialVersionUID = 2782974536561798941L;
    /*    */   private boolean success;

    /*    */
    /*  7 */
    public void setSuccess(boolean success) {
        this.success = success;
    }

    private User user;
    private String msg;

    public void setUser(User user) {
        this.user = user;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof LoginResult)) return false;
        LoginResult other = (LoginResult) o;
        if (!other.canEqual(this)) return false;
        if (isSuccess() != other.isSuccess()) return false;
        Object this$user = getUser(), other$user = other.getUser();
        if ((this$user == null) ? (other$user != null) : !this$user.equals(other$user)) return false;
        Object this$msg = getMsg(), other$msg = other.getMsg();
        return !((this$msg == null) ? (other$msg != null) : !this$msg.equals(other$msg));
    }

    protected boolean canEqual(Object other) {
        return other instanceof LoginResult;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + (isSuccess() ? 79 : 97);
        Object $user = getUser();
        result = result * 59 + (($user == null) ? 43 : $user.hashCode());
        Object $msg = getMsg();
        return result * 59 + (($msg == null) ? 43 : $msg.hashCode());
    }

    /*    */
    /*    */
    /* 10 */
    public boolean isSuccess() {
        return this.success;
    }

    /* 11 */
    public User getUser() {
        return this.user;
    }

    public String getMsg() {
        /* 12 */
        return this.msg;
        /*    */
    }

    /*    */
    public LoginResult(boolean success, User user, String msg) {
        /* 15 */
        this.msg = msg;
        /* 16 */
        this.user = user;
        /* 17 */
        this.success = success;
        /*    */
    }

    /*    */
    /*    */
    /*    */
    public String toString() {
        /* 22 */
        return "SuccessOrFailure [success=" + this.success + ", msg=" + this.msg + "]";
        /*    */
    }
    /*    */
}


/* Location:              C:\Users\Administrator\Desktop\gov1\WEB-INF\classes\!\org\competition\domain\LoginResult.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */