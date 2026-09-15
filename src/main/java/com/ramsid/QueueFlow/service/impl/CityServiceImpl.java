package com.ramsid.QueueFlow.service.impl;

import com.ramsid.QueueFlow.model.City;
import com.ramsid.QueueFlow.repository.CityRepository;
import com.ramsid.QueueFlow.service.CityService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {
    private final CityRepository cityRepository;

    public CityServiceImpl(CityRepository cityRepository){
        this.cityRepository = cityRepository;
    }


    @Override
    public List<City> getAllCities() {
        return cityRepository.findAll();
    }

    @Override
    public City getCityById(Long id) {
        return cityRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("City not found"));
    }

    @Override
    public City createCity(City city) {
        return cityRepository.save(city);
    }

    @Override
    public City updateCity(Long id, City city) {
        City existingCity = getCityById(id);
        existingCity.setName(city.getName());
        existingCity.setState(city.getState());
        existingCity.setCountry(city.getCountry());

        return cityRepository.save(existingCity);
    }

    @Override
    public void deleteCity(Long id) {
        cityRepository.deleteById(id);
    }
}
