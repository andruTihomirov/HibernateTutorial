package org.hibernatetutorial.model.inheritance.joinedstrategy;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cats")
public class Cat extends Predator {

    private String paws;

    public String getPaws() {
        return paws;
    }

    public void setPaws(String paws) {
        this.paws = paws;
    }
}
