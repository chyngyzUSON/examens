package com.book.task1.controller;

import com.book.task1.entity.Cinema;
import com.book.task1.service.CinemaService;
import com.book.task1.service.RestaurantService;
import com.book.task1.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequestMapping("/book")
public class Controller {
    @Autowired
    private CinemaService cinemaService;
    @Autowired
    private RestaurantService restaurantService;
    @Autowired
    private TicketService ticketService;

    private static Controller instance;
    private Controller(){}



    public static Controller getInstance(){
        if (instance == null)
            instance = new Controller();

        return instance;
    }

    @PostMapping
    public Cinema save(@RequestBody Cinema cinema) {
        return cinemaService.save(cinema);
    }

    @GetMapping("/{id}")
    public Cinema findById(@PathVariable Long id){
        return cinemaService.findById(id);
    }

    @DeleteMapping("/get-name")
    public String getName(Principal principal){
        return principal.getName();
    }
}
