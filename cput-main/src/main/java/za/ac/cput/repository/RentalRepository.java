package za.ac.cput.repository;
/*
author :Luyolo Skoma 221368272
 */
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.RentalDetail;


import java.util.List;

@Repository
public interface RentalRepository extends BaseCrudRepository<RentalDetail, Long>{
    List<RentalDetail> findByCustomerId(Long customerId);
}

