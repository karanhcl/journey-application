package com.book.journey.manager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.book.journey.manager.model.Customer;

/**
 * 
 * Repository interface to handle customer
 * entity data.
 *
 * @author karansingh
 * @version $Revision: 0.1 $
 */
@Repository
public interface BookingDataCustomerRepository extends JpaRepository<Customer, Long>{

    
    /**
     * 
     * Method to fetch all bad data records on basis of status
     * successful.
     * 
     * @param externalEventId
     * @return  List<BadDataEntity>
     *                    List<BadDataEntity>.
     */
    @Query("SELECT c FROM Customer c")
    List<Customer> findCustomerstatus();
}
