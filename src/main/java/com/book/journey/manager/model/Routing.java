package com.book.journey.manager.model;

import java.io.Serializable;

/**
 *  Routing class holds info for departure and arrival 
 *  for a route.
 *
 * @author karansingh
 * @version $Revision: 0.1 $
 */
public class Routing implements Serializable{

    /**
     * serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Departure.
     */
    private String departure;

    /**
     * Arrival.
     */
    private String arrival;

    /**
     * @return the departure
     */
    public String getdeparture() {
        return departure;
    }

    /**
     * @param departure the departure to set
     */
    public void setdeparture(final String departure) {
        this.departure = departure;
    }

    /**
     * @return the arrival
     */
    public String getArrival() {
        return arrival;
    }

    /**
     * @param arrival the arrival to set
     */
    public void setArrival(final String arrival) {
        this.arrival = arrival;
    }
    
    /** 
     * {@inheritDoc} 
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((arrival == null) ? 0 : arrival.hashCode());
        result = prime * result + ((departure == null) ? 0 : departure.hashCode());
        return result;
    }

    /** 
     * {@inheritDoc} 
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Routing other = (Routing) obj;
        if (arrival == null) {
            if (other.arrival != null)
                return false;
        } else if (!arrival.equals(other.arrival))
            return false;
        if (departure == null) {
            if (other.departure != null)
                return false;
        } else if (!departure.equals(other.departure))
            return false;
        return true;
    }
}

