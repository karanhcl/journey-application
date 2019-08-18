package com.book.journey.manager.converter;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import com.book.journey.manager.api.JourneyTO;
import com.book.journey.manager.model.Journey;

/**
 * 
 * Converter class for journey entity from
 * journey TO.
 *
 * @author karansingh
 * @version $Revision: 0.1 $
 */
@Component
public class JourneyEntityConveter {


    public Journey converter(JourneyTO journeyTO) {
        Journey journey = null;
        if (journeyTO != null) {
            journey = new Journey();
            journey.setCustomerId(journeyTO.getCustomerId());
            journey.setJourneyTime(LocalDateTime.now());
            journey.setRoute(journeyTO.getRoute());
        }
        return journey;

    }
}
