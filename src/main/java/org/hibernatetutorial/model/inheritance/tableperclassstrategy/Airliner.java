package org.hibernatetutorial.model.inheritance.tableperclassstrategy;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "airliners")
public class Airliner extends Plane {

    private String baggageRoom;

    public String getBaggageRoom() {
        return baggageRoom;
    }

    public void setBaggageRoom(String baggageRoom) {
        this.baggageRoom = baggageRoom;
    }
}
