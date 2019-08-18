package com.book.journey.manager.converter;

import org.springframework.stereotype.Component;

import com.book.journey.manager.api.CustomerTO;
import com.book.journey.manager.common.CustomerTypeEnum;
import com.book.journey.manager.model.Customer;
import com.book.journey.manager.model.CustomerRoutingHolder;

/**
 * 
 * Converter class for customer entity from
 *  customer TO.
 *
 * @author karansingh
 * @version $Revision: 0.1 $
 */
@Component
public class CustomerEntityConveter {

    public Customer converter(CustomerTO customerTO) {
        Customer customer = null;
        if (customerTO != null) {
            customer = new Customer();
            customer.setCustomerId(customerTO.getCustomerId());
            customer.setCustomerName(customerTO.getCustomerName());
            customer.setCustomerType(CustomerTypeEnum.valueOf(customerTO.getCustomerType()));
            CustomerRoutingHolder customerRoutingHolder= new CustomerRoutingHolder(customerTO.getFavouriteRoute());
            customer.setFavouriteRoute(customerRoutingHolder);
        }
        return customer;

    }
}
