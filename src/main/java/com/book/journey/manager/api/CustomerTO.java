package com.book.journey.manager.api;

import java.io.Serializable;
import java.util.List;

import com.book.journey.manager.model.Routing;

/**
 * 
 * Customer Transfer Object.
 *
 * @author karansingh
 * @version $Revision: 0.1 $
 */
public class CustomerTO  implements Serializable{

    /**
     * Comment for <code>serialVersionUID</code>
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * 
     * Constructor.
     *
     */
    public CustomerTO() {
        super();
    }
    
    /**
     * customerName.
     */
    private String customerName;
    
    /**
     * customerId
     */
    private Long customerId;
    
    /**
     * customerType
     */
    private String customerType;
    
    /**
     * favouriteRoute.
     */
    private List<Routing> favouriteRoute;
    
    /**
     * 
     * Constructor.
     *
     * @param customerName
     * @param customerId
     * @param customerType
     * @param favouriteRoute
     */
    public CustomerTO(String customerName, Long customerId, String customerType, List<Routing> favouriteRoute) {
        super();
        this.customerName = customerName;
        this.customerId = customerId;
        this.customerType = customerType;
        this.favouriteRoute = favouriteRoute;
    }

    /**
     * 
     * Getter of {@link #customerName}.
     * 
     * @return {@link #customerName}
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * 
     * Getter of {@link #customerId}.
     * 
     * @return {@link #customerId}
     */
    public Long getCustomerId() {
        return customerId;
    }

    /**
     * 
     * Getter of {@link #customerType}.
     * 
     * @return {@link #customerType}
     */
    public String getCustomerType() {
        return customerType;
    }

    /**
     * 
     * Getter of {@link #favouriteRoute}.
     * 
     * @return {@link #favouriteRoute}
     */
    public List<Routing> getFavouriteRoute() {
        return favouriteRoute;
    }

}
