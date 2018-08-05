package com.obinna.spring.jpademo.rentacar.service;

import com.obinna.spring.jpademo.rentacar.model.Car;

import java.util.List;

public interface ICarService {

    List<Car> findAll();
    Car findById(int carId);
    Car save(Car car);

}
