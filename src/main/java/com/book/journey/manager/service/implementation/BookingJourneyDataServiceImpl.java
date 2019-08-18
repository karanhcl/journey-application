package com.book.journey.manager.service.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.journey.manager.api.JourneyTO;
import com.book.journey.manager.common.CustomerNotFound;
import com.book.journey.manager.common.JourneyPriceCalculation;
import com.book.journey.manager.converter.JourneyEntityConveter;
import com.book.journey.manager.model.Customer;
import com.book.journey.manager.model.Journey;
import com.book.journey.manager.repository.BookingDataCustomerRepository;
import com.book.journey.manager.repository.BookingDataJourneyRepository;
import com.book.journey.manager.service.BookingJourneyDataService;

/**
 * 
 * @see <BookingJourneyDataService>.
 *
 * @author karansingh
 * @version $Revision: 0.1 $
 */
@Service
public class BookingJourneyDataServiceImpl implements BookingJourneyDataService {

    /**
     * JourneyPriceCalculation instance.
     */
    @Autowired
    JourneyPriceCalculation journeyPriceCalculation;

    /**
     * JourneyEntityConveter instance.
     */
    @Autowired
    JourneyEntityConveter journeyEntityConveter;

    /**
     * BookingDataJourneyRepository instance.
     */
    @Autowired
    BookingDataJourneyRepository bookingDataJourneyRepository;

    /**
     * BookingDataCustomerRepository instance.
     */
    @Autowired
    BookingDataCustomerRepository bookingDataCustomerRepository;

    /**
     * 
     * {@inheritDoc}
     */
    @Override
    public void addJourneyDetails(JourneyTO journeyTO) {
        Journey journey = journeyEntityConveter.converter(journeyTO);
        Optional<Customer> customerRecord = bookingDataCustomerRepository.findById(journeyTO.getCustomerId());
        // check customer is present
        if (customerRecord.isPresent()) {
            Customer customer = customerRecord.get();
            List<Journey> journeyRecords = bookingDataJourneyRepository.findJourneystatus(journey.getCustomerId());
            Double price = journeyPriceCalculation.calculateJourneyPrice(customer, journeyRecords, journey);
            journey.setJourneyPrice(price);
            bookingDataJourneyRepository.save(journey);

        } else {
            throw new CustomerNotFound("Customer not exist");
        }
    }

    /**
     * 
     * {@inheritDoc}
     */
    @Override
    public List<Journey> dispalyJourneyDetails() {
        return bookingDataJourneyRepository.findAll();
    }

}
