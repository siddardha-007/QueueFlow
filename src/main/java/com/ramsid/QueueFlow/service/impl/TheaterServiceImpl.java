package com.ramsid.QueueFlow.service.impl;

import com.ramsid.QueueFlow.model.Theater;
import com.ramsid.QueueFlow.repository.TheaterRepository;
import com.ramsid.QueueFlow.service.TheaterService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TheaterServiceImpl implements TheaterService {

    private final TheaterRepository theaterRepository;

    public TheaterServiceImpl(TheaterRepository theaterRepository) {
        this.theaterRepository = theaterRepository;
    }

    @Override
    public List<Theater> getAllTheaters() {
        return theaterRepository.findAll();
    }

    @Override
    public Theater getTheaterById(Long id) {
        return theaterRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Theater not found"));
    }

    @Override
    public Theater createTheater(Theater theater) {
        return theaterRepository.save(theater);
    }

    @Override
    public Theater updateTheater(Long id, Theater theater) {
        Theater existingTheater = getTheaterById(id);

        existingTheater.setName(theater.getName());
        existingTheater.setAddress(theater.getAddress());
        existingTheater.setCity(theater.getCity());

        return theaterRepository.save(existingTheater);
    }

    @Override
    public void deleteTheater(Long id) {
        theaterRepository.deleteById(id);
    }
}
