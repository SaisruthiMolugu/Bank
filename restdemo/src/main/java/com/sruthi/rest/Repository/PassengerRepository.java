package com.sruthi.rest.Repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sruthi.rest.entity.Passenger;
public interface PassengerRepository extends JpaRepository<Passenger,Integer>
{

	Optional<Passenger> findByPassengername(String passengername);

}
