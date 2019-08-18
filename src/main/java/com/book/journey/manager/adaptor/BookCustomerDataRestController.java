package com.book.journey.manager.adaptor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.book.journey.manager.api.BookCustomerDataController;
import com.book.journey.manager.api.BookingCustomerDataResponseTO;
import com.book.journey.manager.api.CustomerTO;
import com.book.journey.manager.api.ResponseTO;
import com.book.journey.manager.model.Customer;
import com.book.journey.manager.service.BookingCustomerDataService;

/**
 * 
 * @see <BookCustomerDataController>.
 *
 * @author karansingh
 * @version $Revision: 0.1 $
 */
@RestController
public class BookCustomerDataRestController implements BookCustomerDataController {

    /**
     * BookingCustomerDataService instance.
     */
    @Autowired
    BookingCustomerDataService bookingCustomerDataService;

    /**
     * 
     * {@inheritDoc}
     */
    @Override
    public ResponseEntity<BookingCustomerDataResponseTO> getCustomerDetails() {
        List<Customer> customerRecords = bookingCustomerDataService.displayCustomerDetails();
        BookingCustomerDataResponseTO bookingCustomerDataResponseTO = new BookingCustomerDataResponseTO();
        bookingCustomerDataResponseTO.setCustomerList(customerRecords);
        return new ResponseEntity<>(bookingCustomerDataResponseTO, HttpStatus.OK);
    }

    /**
     * 
     * {@inheritDoc}
     */
    @Override
    public ResponseEntity<ResponseTO<Void>> addCustomerDetails(@RequestBody CustomerTO customerTO) {
        ResponseTO responseTO = new ResponseTO();
        HttpStatus httpStatus= HttpStatus.OK;
        try {
            bookingCustomerDataService.addCustomerDetails(customerTO);
            responseTO.setMessage("Yay!! customer details added");
        } catch (Exception e) {
            responseTO.setMessage("Not able to add customer");
            httpStatus=HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return new ResponseEntity<>(responseTO, httpStatus);

    }

}
