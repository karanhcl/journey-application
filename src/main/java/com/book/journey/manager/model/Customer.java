package com.book.journey.manager.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import com.book.journey.manager.common.CustomerTypeEnum;
import com.book.journey.manager.constants.GeneralConstants;
import com.vladmihalcea.hibernate.type.json.JsonStringType;

/**
 * 
 * Customer entity class.
 *
 * @author karansingh
 * @version $Revision: 0.1 $
 */
@Entity
@TypeDef(name = GeneralConstants.JSON, typeClass = JsonStringType.class)
@Table(name = GeneralConstants.CUSTOMER_DATA_TABLE_NAME)
public class Customer implements Serializable {
    
    /**
     * serialVersionUID.
     */
    private static final long serialVersionUID = 1L;
    
   /**
    * 
    * Constructor.
    *
    */
    public Customer() {
        super();
    }
  
    
    /**
     * Id.
     */
    @Id
    @Column(name = GeneralConstants.CUSTOMER_ID, length = 12, nullable = false)
    private Long customerId;
    
    /**
     * Customer type.
     */
    @Column(name = GeneralConstants.CUSTOMER_TYPE, length = 12, nullable = false)
    @Enumerated(EnumType.STRING)
    private CustomerTypeEnum customerType;
    
    /**
     * Customer name.
     */
    @Column(name = GeneralConstants.CUSTOMER_NAME, length = 50, nullable = false)
    private String customerName;

    /**
     * Favourite route.
     */
    @Column(name = GeneralConstants.ROUTING, columnDefinition = GeneralConstants.JSON, nullable = true)
    @Type(type = GeneralConstants.JSON)
    private CustomerRoutingHolder favouriteRoute;
    
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
     * Setter of {@link #customerId}.
     * 
     * @param customerId 
     *            to be set
     */
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    /**
     * 
     * Getter of {@link #customerType}.
     * 
     * @return {@link #customerType}
     */
    public CustomerTypeEnum getCustomerType() {
        return customerType;
    }

    /**
     * 
     * Setter of {@link #customerType}.
     * 
     * @param customerType 
     *            to be set
     */
    public void setCustomerType(CustomerTypeEnum customerType) {
        this.customerType = customerType;
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
     * Setter of {@link #customerName}.
     * 
     * @param customerName 
     *            to be set
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * 
     * Getter of {@link #favouriteRoute}.
     * 
     * @return {@link #favouriteRoute}
     */
    public CustomerRoutingHolder getFavouriteRoute() {
        return favouriteRoute;
    }

    /**
     * 
     * Setter of {@link #favouriteRoute}.
     * 
     * @param favouriteRoute 
     *            to be set
     */
    public void setFavouriteRoute(CustomerRoutingHolder favouriteRoute) {
        this.favouriteRoute = favouriteRoute;
    }
 }
