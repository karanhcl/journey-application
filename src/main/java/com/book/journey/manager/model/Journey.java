package com.book.journey.manager.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import com.book.journey.manager.constants.GeneralConstants;
import com.vladmihalcea.hibernate.type.json.JsonStringType;

/**
 * 
 * Journey entity class.
 *
 * @author karansingh
 * @version $Revision: 0.1 $
 */
@Entity
@TypeDef(name = GeneralConstants.JSON, typeClass = JsonStringType.class)
@Table(name = GeneralConstants.JOURNEY_DATA_TABLE_NAME)
public class Journey implements Serializable{
    
    /**
     * Auto generated Id.
     */
    @Id
    @Column(name = GeneralConstants.JOURNEY_ID)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long journeyId; 
    
    /**
     * Customer Id.
     */
    @Column(name = GeneralConstants.CUSTOMER_ID)
    private Long customerId;    
    
    /**
     * Route
     */
    @Column(name = GeneralConstants.ROUTE, columnDefinition = GeneralConstants.JSON)
    @Type(type = GeneralConstants.JSON)
    private Routing route;
    
    /**
     * Journey time.
     */
    @Column(name = GeneralConstants.JOURNEY_TIME)
    private LocalDateTime journeyTime;
    
    /**
     * Journey price.
     */
    @Column(name = GeneralConstants.JOURNEY_PRICE)
    private Double journeyPrice;

    /**
     * 
     * Getter of {@link #journeyPrice}.
     * 
     * @return {@link #journeyPrice}
     */
    public Double getJourneyPrice() {
        return journeyPrice;
    }

    /**
     * 
     * Setter of {@link #journeyPrice}.
     * 
     * @param journeyPrice 
     *            to be set
     */
    public void setJourneyPrice(Double journeyPrice) {
        this.journeyPrice = journeyPrice;
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
     * Setter of {@link #cutomerId}.
     * 
     * @param cutomerId 
     *            to be set
     */
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    /**
     * 
     * Getter of {@link #route}.
     * 
     * @return {@link #route}
     */
    public Routing getRoute() {
        return route;
    }

    /**
     * 
     * Setter of {@link #route}.
     * 
     * @param route 
     *            to be set
     */
    public void setRoute(Routing route) {
        this.route = route;
    }

    /**
     * 
     * Getter of {@link #journeyTime}.
     * 
     * @return {@link #journeyTime}
     */
    public LocalDateTime getJourneyTime() {
        return journeyTime;
    }

    /**
     * 
     * Setter of {@link #journeyTime}.
     * 
     * @param journeyTime 
     *            to be set
     */
    public void setJourneyTime(LocalDateTime journeyTime) {
        this.journeyTime = journeyTime;
    }

    /**
     * 
     * Getter of {@link #journeyId}.
     * 
     * @return {@link #journeyId}
     */
    public Long getJourneyId() {
        return journeyId;
    }

}
