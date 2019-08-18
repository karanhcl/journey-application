package com.book.journey.manager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.book.journey.manager.model.Journey;

/**
 * 
 * Repository interface to handle Journey
 * entity data.
 *
 * @author karansingh
 * @version $Revision: 0.1 $
 */
@Repository
public interface BookingDataJourneyRepository extends JpaRepository<Journey, Long> {

    /**
     * 
     * Method to fetch all bad data records on basis of status successful.
     * 
     * @param externalEventId
     * @return List<BadDataEntity> List<BadDataEntity>.
     */
    @Query("SELECT j FROM Journey j where j.customerId=:customerId ")
    List<Journey> findJourneystatus(@Param("customerId") Long customerId);
}
 