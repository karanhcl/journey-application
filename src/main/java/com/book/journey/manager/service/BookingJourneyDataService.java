package com.book.journey.manager.service;

import java.util.List;

import com.book.journey.manager.api.JourneyTO;
import com.book.journey.manager.model.Journey;

/**
 * 
 * API act as a service  responsible to book journey
 * data.
 *
 * @author karansingh
 * @version $Revision: 0.1 $
 */
public interface BookingJourneyDataService {
    
    /**
     * 
     * Method to add journey details.
     * 
     * @param journeyTO
     */
    void addJourneyDetails(JourneyTO journeyTO);
    
    /**
     * 
     * Method to display journey details.
     *
     */
    List<Journey>  dispalyJourneyDetails();
}
