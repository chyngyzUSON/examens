package com.book.task1.service;

import com.book.task1.entity.Cinema;

public interface CinemaService {
    Cinema save(Cinema cinema);
    Cinema findById(Long id);
    Cinema deleteCinemaById(Long id);
}
