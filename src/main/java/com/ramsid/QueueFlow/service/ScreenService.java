package com.ramsid.QueueFlow.service;

import com.ramsid.QueueFlow.model.Screen;

import java.util.List;

public interface ScreenService {
    List<Screen> getAllScreens();

    Screen getScreenById(Long id);

    Screen createScreen(Screen screen);

    Screen updateScreen(Long id, Screen screen);

    void deleteScreen(Long id);
}
