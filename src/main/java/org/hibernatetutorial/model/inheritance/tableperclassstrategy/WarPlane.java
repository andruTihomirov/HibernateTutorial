package org.hibernatetutorial.model.inheritance.tableperclassstrategy;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "warplanes")
public class WarPlane extends Plane {

    private String catapult;

    private String gun;

    public String getCatapult() {
        return catapult;
    }

    public void setCatapult(String catapult) {
        this.catapult = catapult;
    }

    public String getGun() {
        return gun;
    }

    public void setGun(String gun) {
        this.gun = gun;
    }
}
