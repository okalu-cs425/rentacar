package com.obinna.spring.jpademo.rentacar.service.impl;

import com.obinna.spring.jpademo.rentacar.model.Car;
import com.obinna.spring.jpademo.rentacar.repository.ICarRepository;
import com.obinna.spring.jpademo.rentacar.service.ICarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("carService")
public class CarService implements ICarService {

    @Autowired
    private ICarRepository carRepository;

    @Override
    public List<Car> findAll() {
        return carRepository.findAll();
    }

    @Override
    public Car findById(int carId) {
        return carRepository.findById(carId).orElse(null);
    }

    @Override
    public Car save(Car car) {
        return carRepository.save(car);
    }
}
