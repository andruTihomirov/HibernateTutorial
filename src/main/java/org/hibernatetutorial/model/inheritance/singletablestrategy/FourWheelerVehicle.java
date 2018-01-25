package org.hibernatetutorial.model.inheritance.singletablestrategy;

import org.hibernatetutorial.model.manytomany.Vehicle;

import javax.persistence.Entity;

@Entity
public class FourWheelerVehicle extends Vehicle {

    private String steeringWheel;

    public String getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(String steeringWheel) {
        this.steeringWheel = steeringWheel;
    }
}
