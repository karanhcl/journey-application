package com.book.journey.manager.common;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Component;

import com.book.journey.manager.model.Customer;
import com.book.journey.manager.model.Journey;
import com.book.journey.manager.model.Routing;

/**
 * 
 *  Class is responsible to get calculation
 *  for journey prices .
 *
 * @author karansingh
 * @version $Revision: 0.1 $
 */
@Component
public class JourneyPriceCalculation {

    private double defaultPrice = 2.0;
    
    /**
     * 
     * Method use to calculate journey price
     * for customer's journey.
     * 
     * @param customer
     * @param journeyRecords
     * @param journey
     * @return price
     */
    public Double calculateJourneyPrice(Customer customer, List<Journey> journeyRecords, Journey journey) {
        Double price = defaultPrice;
        price = checkCustomerType(customer);
        boolean favouriteRouteFind = false;
        for (Routing routing : customer.getFavouriteRoute().getRouting()) {
            if (routing.equals(journey.getRoute())) {
                favouriteRouteFind = true;
                break;
            }
        }

        if (favouriteRouteFind) {
            price = recalculatePrice(price);

        }
        if (customer.getCustomerType() != CustomerTypeEnum.PERSONA_NON_GRATA) {
            price=checkForAdditionalDisCount(price, journeyRecords, journey);
        }

        return price;
    }
    
    /**
     * 
     * Check for additional discount.
     * 
     * @param price
     * @param journeyRecords
     * @param journey
     * @return price
     */
    private Double checkForAdditionalDisCount(Double price, List<Journey> journeyRecords, Journey journey) {
        List<Journey> journeyMatchRecords = new ArrayList<>();
        for (Journey journeyDetail : journeyRecords) {
            if(journeyDetail.getRoute().equals(journey.getRoute())){
            journeyMatchRecords.add(journeyDetail);
            }
        }
        journeyMatchRecords.sort(Comparator.comparing(Journey::getJourneyTime).reversed());
        long hours = ChronoUnit.HOURS.between( journeyMatchRecords.get(0).getJourneyTime(),LocalDateTime.now());
        if (hours < 48) {
            price = (price - price * 10 / 100);
        }
        return price;
    }
    
    /**
     * 
     * Recalculate price.
     * 
     * @param price
     * @return price
     */
    private Double recalculatePrice(Double price) {
        return (price -price * 30 / 100);
    }
    
   /**
    * 
    * Check customer type.
    * 
    * @param customer
    * @return price
    */
    private Double checkCustomerType(Customer customer) {
        Double price = 1.0;

        if (customer.getCustomerType() == CustomerTypeEnum.VIP) {
            return price;
        }
        return defaultPrice;
    }
}
