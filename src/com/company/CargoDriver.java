package com.company;

public class CargoDriver extends Driver {
    private final String licenceCategory = "C";

    public CargoDriver(String fullName, boolean availabilityOfLicence, int experience) {
        super(fullName, availabilityOfLicence, experience);
    }
}
