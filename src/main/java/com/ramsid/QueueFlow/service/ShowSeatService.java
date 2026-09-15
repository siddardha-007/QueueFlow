package com.ramsid.QueueFlow.service;

import com.ramsid.QueueFlow.model.ShowSeat;

import java.util.List;

public interface ShowSeatService {
    ShowSeat createShowSeat(ShowSeat showSeat);

    ShowSeat getShowSeatById(Long showSeatId);

    List<ShowSeat> getAllShowSeats();

    List<ShowSeat> getShowSeatsByShowId(Long showId);

    List<ShowSeat> getAvailableShowSeats(Long showId);

    ShowSeat updateShowSeat(ShowSeat showSeat);

    void deleteShowSeat(Long showSeatId);


}
