package com.sample;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class VehicleOperation {

    public static void main(String s[]){

        Logger log = Logger.getLogger(VehicleOperation.class);

        BasicConfigurator.configure();

        Vehicle veh = new Vehicle();
        veh.setVehicleType("Bus");
        veh.setCapacity(45);
        veh.setFuelType("Gasoline");

        log.info("Vehicle 1");

        log.info("Vehicle Type = "+veh.getVehicleType());
        log.info("Vehicle Fuel Type = "+veh.getFuelType());
        log.info("Vehicle Capacity = "+veh.getCapacity());

        Vehicle veh2 = new Vehicle("Car",5,"Battery");
        log.info("Vehicle 2");
        log.info("Vehicle Type = "+veh2.getVehicleType());
        log.info("Vehicle Fuel Type = "+veh2.getFuelType());
        log.info("Vehicle Capacity = "+veh2.getCapacity());

        Vehicle veh3 = new Vehicle("Hybrid");
        log.info("Vehicle 3");
        log.info("Vehicle Type = "+veh3.getVehicleType());
        log.info("Vehicle Fuel Type = "+veh3.getFuelType());
        log.info("Vehicle Capacity = "+veh3.getCapacity());


    }
}
