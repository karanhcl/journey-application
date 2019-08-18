package com.book.journey.manager.api;

import java.io.Serializable;
import java.util.List;

import com.book.journey.manager.model.Journey;

/**
 * 
 * Journey data response TO.
 *
 * @author karansingh
 * @version $Revision: 0.1 $
 */
public class BookingJourneyDataResponseTO  implements Serializable {

    /**
     * Comment for <code>serialVersionUID</code>
     */
    private static final long serialVersionUID = 1L;
    
    
    /**
     * Journey data read records.
     */
    private List<Journey> journeyList;


    /**
     * 
     * Getter of {@link #journeyList}.
     * 
     * @return {@link #journeyList}
     */
    public List<Journey> getJourneyList() {
        return journeyList;
    }


    /**
     * 
     * Setter of {@link #journeyList}.
     * 
     * @param journeyList 
     *            to be set
     */
    public void setJourneyList(List<Journey> journeyList) {
        this.journeyList = journeyList;
    }

    
    
}
