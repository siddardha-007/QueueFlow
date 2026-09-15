package com.ramsid.QueueFlow.service;

import com.ramsid.QueueFlow.model.Theater;

import java.util.List;

public interface TheaterService {
    List<Theater> getAllTheaters();

    Theater getTheaterById(Long id);

    Theater createTheater(Theater theater);

    Theater updateTheater(Long id, Theater theater);

    void deleteTheater(Long id);
}
