package com.book.journey.manager.api;


import java.io.Serializable;
import java.util.List;

import com.book.journey.manager.model.Customer;
import com.book.journey.manager.model.Journey;


/**
 * 
 * Customer data response TO.
 *
 * @author karansingh
 * @version $Revision: 0.1 $
 */
public class BookingCustomerDataResponseTO  implements Serializable {

    /**
     * Comment for <code>serialVersionUID</code>
     */
    private static final long serialVersionUID = 1L;
    
    
    /**
     * Customer data read records.
     */
    private List<Customer> customerList;


    /**
     * 
     * Getter of {@link #customerList}.
     * 
     * @return {@link #customerList}
     */
    public List<Customer> getCustomerList() {
        return customerList;
    }


    /**
     * 
     * Setter of {@link #customerList}.
     * 
     * @param customerList 
     *            to be set
     */
    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }


    
}
