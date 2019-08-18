package com.book.journey.manager.adaptor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.book.journey.manager.api.BookJourneyDataController;
import com.book.journey.manager.api.BookingJourneyDataResponseTO;
import com.book.journey.manager.api.JourneyTO;
import com.book.journey.manager.api.ResponseTO;
import com.book.journey.manager.model.Journey;
import com.book.journey.manager.service.BookingJourneyDataService;

/**
 * 
 * @see <BookJourneyDataController>.
 *
 * @author karansingh
 * @version $Revision: 0.1 $
 */
@RestController
public class BookJourneyDataRestController implements BookJourneyDataController {

    /**
     * BookingJourneyDataService instance.
     */
    @Autowired
    BookingJourneyDataService bookingJourneyDataService;

    /**
     * 
     * {@inheritDoc}
     */
    @Override
    public ResponseEntity<BookingJourneyDataResponseTO> getBookingDataJourney() {
        List<Journey> journeyRecords = bookingJourneyDataService.dispalyJourneyDetails();
        BookingJourneyDataResponseTO bookingJourneyDataResponseTO = new BookingJourneyDataResponseTO();
        bookingJourneyDataResponseTO.setJourneyList(journeyRecords);
        return new ResponseEntity<>(bookingJourneyDataResponseTO, HttpStatus.OK);
    }

    /**
     * 
     * {@inheritDoc}
     */
    @Override
    public ResponseEntity<ResponseTO<Void>> addBookingDataJourney(@RequestBody JourneyTO journeyTO) {
        ResponseTO responseTO = new ResponseTO();
        HttpStatus httpStatus = HttpStatus.OK;
        try {
            bookingJourneyDataService.addJourneyDetails(journeyTO);
            responseTO.setMessage("Yay!! journey details added");
        } catch (Exception e) {
            responseTO.setMessage("Not able to add journey");
            responseTO.setData(e.getMessage());
            httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return new ResponseEntity<>(responseTO, httpStatus);
    }

}
