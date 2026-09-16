package com.ramsid.QueueFlow.service.impl;

import com.ramsid.QueueFlow.model.Show;

import com.ramsid.QueueFlow.repository.ShowRepository;

import com.ramsid.QueueFlow.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ShowServiceImpl implements ShowService {
    @Autowired
    private ShowRepository showRepository;


    @Override
    public Show createShow(Show show) {
        return showRepository.save(show);

    }

    @Override
    public Show getShowById(Long showId) {
        return showRepository.findById(showId)
                .orElseThrow(()->new RuntimeException("Show not found with id :" + showId));
    }

    @Override
    public List<Show> getAllShows() {
        return showRepository.findAll();
    }

    @Override
    public List<Show> getShowsByEventId(Long eventId) {
        return showRepository.findByEventEventId(eventId);
    }

    @Override
    public Show updateShow(Show show) {
        return showRepository.save(show);

    }

    @Override
    public void deleteShow(Long showId) {
        Show existingShow = showRepository.findById(showId)
                .orElseThrow(() ->
                        new RuntimeException("Show not found with id: " + showId));

        showRepository.delete(existingShow);
    }

}
