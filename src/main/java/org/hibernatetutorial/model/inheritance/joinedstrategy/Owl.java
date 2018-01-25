package org.hibernatetutorial.model.inheritance.joinedstrategy;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "owls")
public class Owl extends Predator {

    private String wings;

    public String getWings() {
        return wings;
    }

    public void setWings(String wings) {
        this.wings = wings;
    }
}
