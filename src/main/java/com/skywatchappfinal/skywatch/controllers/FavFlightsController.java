package com.skywatchappfinal.skywatch.controllers;

import com.skywatchappfinal.skywatch.services.FavFlightsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/favorites")
public class FavFlightsController {
    @Autowired
    FavFlightsService favFlightsService;
}
