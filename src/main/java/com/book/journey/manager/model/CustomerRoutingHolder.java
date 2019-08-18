package com.book.journey.manager.model;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * Customer route holder class.
 *
 * @author karansingh
 * @version $Revision: 0.1 $
 */
public class CustomerRoutingHolder implements Serializable {
    /**
     * serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Selection routing.
     */
    private List<Routing> routings;

    /**
     *
     * Constructor.
     *
     */
    public CustomerRoutingHolder() {
        super();
    }

    /**
    *
    * Parameterized Constructor.
    * @param routings the user routings
    *
    */
   public CustomerRoutingHolder(final List<Routing> routings) {
       this.routings = routings;
   }

    /**
     * @return the routing
     */
    public List<Routing> getRouting() {
        return routings;
    }

    /**
     * @param routing the routing to set
     */
    public void setRouting(final List<Routing> routings) {
        this.routings = routings;
    }

}