package com.ramsid.QueueFlow.service.impl;

import com.ramsid.QueueFlow.model.Screen;
import com.ramsid.QueueFlow.repository.ScreenRepository;
import com.ramsid.QueueFlow.service.ScreenService;

import java.util.List;

public class ScreenServiceImpl implements ScreenService {
    private final ScreenRepository screenRepository;

    public ScreenServiceImpl(ScreenRepository screenRepository) {
        this.screenRepository = screenRepository;
    }

    @Override
    public List<Screen> getAllScreens() {
        return screenRepository.findAll();
    }

    @Override
    public Screen getScreenById(Long id) {
        return screenRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Screen not found"));
    }

    @Override
    public Screen createScreen(Screen screen) {
        return screenRepository.save(screen);
    }

    @Override
    public Screen updateScreen(Long id, Screen screen) {
        Screen existingScreen = getScreenById(id);

        existingScreen.setScreenName(screen.getScreenName());
        existingScreen.setTotalSeats(screen.getTotalSeats());
        existingScreen.setTheater(screen.getTheater());

        return screenRepository.save(existingScreen);
    }

    @Override
    public void deleteScreen(Long id) {
        screenRepository.deleteById(id);
    }
}
