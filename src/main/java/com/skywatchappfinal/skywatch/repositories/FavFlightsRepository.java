package com.skywatchappfinal.skywatch.repositories;

import com.skywatchappfinal.skywatch.entities.FavFlights;
import org.springframework.data.repository.CrudRepository;

public interface FavFlightsRepository extends CrudRepository<FavFlights, Integer> {
}
