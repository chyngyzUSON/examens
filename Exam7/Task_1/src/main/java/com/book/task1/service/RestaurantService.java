package com.book.task1.service;

import com.book.task1.entity.Restaurant;

public interface RestaurantService {
    Restaurant save(Restaurant restaurant);
    Restaurant findById(Long id);
    Restaurant deleteRestaurantById(Long id);
}
