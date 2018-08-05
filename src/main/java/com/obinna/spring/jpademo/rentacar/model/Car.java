package com.obinna.spring.jpademo.rentacar.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int carId;
    private String brandName;
    private String make;
    private String model;
    private int year;
    private double weeklyRentalRate;
    @ManyToOne
    @JoinColumn(name = "categoryId", nullable = false)
    @NotNull(message = "*Category is required")
    @JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class,property="@id", scope = Car.class)
    private Category category;

    public Car() {
    }

    public Car(String brandName, String make, String model, int year, double weeklyRentalRate, @NotNull(message = "*Category is required") Category category) {
        this.brandName = brandName;
        this.make = make;
        this.model = model;
        this.year = year;
        this.weeklyRentalRate = weeklyRentalRate;
        this.category = category;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getWeeklyRentalRate() {
        return weeklyRentalRate;
    }

    public void setWeeklyRentalRate(double weeklyRentalRate) {
        this.weeklyRentalRate = weeklyRentalRate;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", brandName='" + brandName + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", weeklyRentalRate=" + weeklyRentalRate +
                ", category=" + category +
                '}';
    }
}
