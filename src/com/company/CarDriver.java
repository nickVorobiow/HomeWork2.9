package com.company;

public class CarDriver extends Driver{
    private final String licenceCategory = "B";

    public CarDriver(String fullName, boolean availabilityOfLicence, int experience) {
        super(fullName, availabilityOfLicence, experience);
    }
}
