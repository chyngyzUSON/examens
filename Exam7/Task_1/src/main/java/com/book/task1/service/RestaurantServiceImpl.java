package com.book.task1.service;

import com.book.task1.entity.Restaurant;
import com.book.task1.repository.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestaurantServiceImpl implements RestaurantService {
    @Autowired
    private RestaurantRepo restaurantRepo;

    @Override
    public Restaurant save(Restaurant restaurant) {
        return restaurantRepo.save(restaurant);
    }

    @Override
    public Restaurant findById(Long id) {
        return restaurantRepo.findById(id).orElse(null);
    }

    @Override
    public Restaurant deleteRestaurantById(Long id) {
        Restaurant restaurant = findById(id);
        if (restaurant != null){
            restaurantRepo.delete(restaurant);
            return restaurant;
        }
        return null;
    }
}
