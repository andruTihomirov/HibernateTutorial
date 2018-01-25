package org.hibernatetutorial.model.inheritance.singletablestrategy;

import org.hibernatetutorial.model.manytomany.Vehicle;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "two_wheeler_vehicle") // by default TwoWheelerVehicle
public class TwoWheelerVehicle extends Vehicle {

    private String steeringHandle;

    public String getSteeringHandle() {
        return steeringHandle;
    }

    public void setSteeringHandle(String steeringHandle) {
        this.steeringHandle = steeringHandle;
    }
}
