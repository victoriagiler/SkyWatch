package com.skywatchappfinal.skywatch.services;

import com.skywatchappfinal.skywatch.repositories.FavFlightsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FavFlightsService {
    @Autowired
    FavFlightsRepository favFlightsRepository;
}
