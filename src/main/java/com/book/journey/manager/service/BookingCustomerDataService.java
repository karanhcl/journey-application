package com.book.journey.manager.service;

import java.util.List;

import com.book.journey.manager.api.CustomerTO;
import com.book.journey.manager.model.Customer;

/**
 * 
 * API act as a service  responsible to book customer
 * data.
 *
 * @author karansingh
 * @version $Revision: 0.1 $
 */
public interface BookingCustomerDataService {
    
    /**
     * 
     * Method to add customer details.
     * 
     * @param customerTO
     */
    void addCustomerDetails(CustomerTO customerTO);
    
    /**
     * 
     * Method to display customer details.
     *
     */
    List<Customer> displayCustomerDetails();
}
