package com.book.journey.manager.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.book.journey.manager.constants.GeneralConstants;

/**
 * 
 * API interface is responsible to add and 
 * display customers details.
 *
 * @author karansingh
 * @version $Revision: 0.1 $
 */
public interface BookCustomerDataController {


    /**
     * Interface method to fetch all customer details from
     *  customer store.
     *
     * @return List<>
     */
    @GetMapping(value = "/bookingdata/customer/list",  consumes = GeneralConstants.JSON_MEDIA_TYPE, produces = GeneralConstants.JSON_MEDIA_TYPE)
    ResponseEntity<BookingCustomerDataResponseTO> getCustomerDetails();
    
    /**
     * 
     * Interface method to add customer details into customer store.
     * 
     * @return
     */
    @PostMapping(value = "/bookingdata/customer", consumes = GeneralConstants.JSON_MEDIA_TYPE, produces = GeneralConstants.JSON_MEDIA_TYPE)
    ResponseEntity<ResponseTO<Void>> addCustomerDetails(@RequestBody CustomerTO customerTO);
}
