/*    */
package org.competition.dao;
/*    */
/*    */

import org.competition.domain.Order;

/*    */
/*    */ public class OrderCustomer
        /*    */ extends Order {
    /*    */   private String name;

    /*    */
    /*    */
    public String toString() {
        /* 10 */
        return "OrderCustomer(name=" + getName() + ")";
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $name = getName();
        return result * 59 + (($name == null) ? 43 : $name.hashCode());
    }

    protected boolean canEqual(Object other) {
        return other instanceof OrderCustomer;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof OrderCustomer)) return false;
        OrderCustomer other = (OrderCustomer) o;
        if (!other.canEqual(this)) return false;
        Object this$name = getName(), other$name = other.getName();
        return !((this$name == null) ? (other$name != null) : !this$name.equals(other$name));
    }

    public OrderCustomer setName(String name) {
        this.name = name;
        return this;
    }

    /*    */
    /*    */
    public String getName() {
        /* 13 */
        return this.name;
        /*    */
    }
    /*    */
}

