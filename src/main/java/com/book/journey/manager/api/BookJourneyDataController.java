package com.book.journey.manager.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.book.journey.manager.constants.GeneralConstants;

/**
 * 
 * API interface is responsible to add and 
 * display journey details.
 *
 * @author karansingh
 * @version $Revision: 0.1 $
 */
public interface BookJourneyDataController {

    /**
     * Interface method to fetch all journey details from
     *  journey store.
     *
     * @return List<>
     */
    @GetMapping(value = "/bookingdata/journey/list",  consumes = GeneralConstants.JSON_MEDIA_TYPE, produces = GeneralConstants.JSON_MEDIA_TYPE)
    ResponseEntity<BookingJourneyDataResponseTO>  getBookingDataJourney();
    
    /**
     * 
     * Interface method to add journey details into journey store.
     * 
     * @return
     */
    @PostMapping(value = "/bookingdata/journey", consumes = GeneralConstants.JSON_MEDIA_TYPE, produces = GeneralConstants.JSON_MEDIA_TYPE)
    ResponseEntity<ResponseTO<Void>> addBookingDataJourney(@RequestBody JourneyTO journeyTO);
}
