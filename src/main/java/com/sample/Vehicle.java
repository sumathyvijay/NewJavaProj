package com.sample;

public class Vehicle {

    public Vehicle() {

    }

    public Vehicle(String vehicleType) {
        this.vehicleType = vehicleType;

    }

    public Vehicle(String vehicleType, int capacity, String fuelType) {
        this.vehicleType = vehicleType;
        this.capacity = capacity;
        this.fuelType = fuelType;

    }


    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String vehicleType;

    public int capacity;

    public String fuelType;


}
