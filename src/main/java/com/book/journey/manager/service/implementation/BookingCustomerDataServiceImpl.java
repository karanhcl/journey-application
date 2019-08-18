package com.book.journey.manager.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.journey.manager.api.CustomerTO;
import com.book.journey.manager.converter.CustomerEntityConveter;
import com.book.journey.manager.model.Customer;
import com.book.journey.manager.repository.BookingDataCustomerRepository;
import com.book.journey.manager.service.BookingCustomerDataService;

/**
 * 
 * @see <BookingCustomerDataService>
 *
 * @author karansingh
 * @version $Revision: 0.1 $
 */
@Service
public class BookingCustomerDataServiceImpl implements BookingCustomerDataService{
    
    /**
     * CustomerEntityConveter instance.
     */
    @Autowired
    CustomerEntityConveter customerEntityConveter;
    
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
    public void addCustomerDetails(CustomerTO customerTO) {
        Customer customer =customerEntityConveter.converter(customerTO);
        bookingDataCustomerRepository.save(customer);
                
    }
    
    /**
     * 
     * {@inheritDoc}
     */
    @Override
    public List<Customer> displayCustomerDetails() {
       return bookingDataCustomerRepository.findAll();
        
    }

   
}
