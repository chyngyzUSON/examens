package com.book.task1.service;

import com.book.task1.entity.Cinema;
import com.book.task1.repository.CinemaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CinemaServiceImpl implements CinemaService {
    @Autowired
    private CinemaRepo cinemaRepo;

    @Override
    public Cinema save(Cinema cinema) {
        return cinemaRepo.save(cinema);
    }

    @Override
    public Cinema findById(Long id) {
        return cinemaRepo.findById(id).orElse(null);
    }

    @Override
    public Cinema deleteCinemaById(Long id) {
        Cinema cinema = findById(id);
        if (cinema != null){
            cinemaRepo.delete(cinema);
            return cinema;
        }
        return null;
    }
}
