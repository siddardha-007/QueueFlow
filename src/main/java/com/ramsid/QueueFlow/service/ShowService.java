package com.ramsid.QueueFlow.service;

import com.ramsid.QueueFlow.model.Show;

import java.util.List;

public interface ShowService {
    Show createShow(Show show);

    Show getShowById(Long showId);

    List<Show> getAllShows();

    List<Show> getShowsByEventId(Long eventId);

    Show updateShow(Show show);

    void deleteShow(Long showId);
}
