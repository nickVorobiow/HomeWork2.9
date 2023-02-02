package com.company;

public class BusDriver extends Driver{
    private final String licenceCategory = "D";

    public BusDriver(String fullName, boolean availabilityOfLicence, int experience) {
        super(fullName, availabilityOfLicence, experience);
    }
}
