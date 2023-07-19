package com.skywatchappfinal.skywatch.repositories;

import com.skywatchappfinal.skywatch.entities.Flight;
import org.springframework.data.repository.CrudRepository;

public interface FlightRepository extends CrudRepository<Flight, Integer> {
}
