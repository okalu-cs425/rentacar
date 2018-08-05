package com.obinna.spring.jpademo.rentacar.repository;

import com.obinna.spring.jpademo.rentacar.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("carRepository")
public interface ICarRepository extends JpaRepository<Car, Integer> {
}
