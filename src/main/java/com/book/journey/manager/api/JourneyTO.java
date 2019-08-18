package com.book.journey.manager.api;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import com.book.journey.manager.model.Routing;

public class JourneyTO implements Serializable {

    /**
     * Comment for <code>serialVersionUID</code>
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * customerId
     */
    private Long customerId;

    /**
     * route
     */
    private Routing route;

    /**
     * journeyTime
     */
    private LocalDateTime journeyTime;

    /**
     * 
     * Getter of {@link #cutomerId}.
     * 
     * @return {@link #cutomerId}
     */
    public Long getCustomerId() {
        return customerId;
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
     * Getter of {@link #journeyTime}.
     * 
     * @return {@link #journeyTime}
     */
    public LocalDateTime getJourneyTime() {
        return journeyTime;
    }
}
