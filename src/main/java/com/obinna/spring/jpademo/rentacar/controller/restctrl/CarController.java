package com.obinna.spring.jpademo.rentacar.controller.restctrl;

import com.obinna.spring.jpademo.rentacar.model.Car;
import com.obinna.spring.jpademo.rentacar.service.impl.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/rentacar/api/cars")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("")
    public List<Car> getAllCars() {
        List<Car> cars = carService.findAll();
        return cars;
    }

    @PostMapping("/add")
    public Car addCar(@Valid @RequestBody Car car) {
        return carService.save(car);
    }
}
