package org.hibernatetutorial.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Passport {

    @Column(name = "passport_id")
    private String passportId;

    @Column(name = "passport_series")
    private String passportSeries;

    @Column(name = "passport_number")
    private String passportNumber;

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        this.passportId = passportId;
    }

    public String getPassportSeries() {
        return passportSeries;
    }

    public void setPassportSeries(String passportSeries) {
        this.passportSeries = passportSeries;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }
}
