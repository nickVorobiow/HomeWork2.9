package com.company;

public class Driver {
    private final String fullName;
    private boolean availabilityOfLicense;
    private int experience;

    public Driver(String fullName, boolean availabilityOfLicense, int experience) {
        this.fullName = fullName;
        this.availabilityOfLicense = availabilityOfLicense;
        this.experience = experience;
    }

    public String getFullName() {
        return fullName;
    }

    public boolean isAvailabilityOfLicense() {
        return availabilityOfLicense;
    }
    public void setAvailabilityOfLicense(boolean availabilityOfLicense) {
        this.availabilityOfLicense = availabilityOfLicense;
    }

    public int getExperience() {
        return experience;
    }
    public void setExperience(byte experience) {
        this.experience = experience;
    }

    public static void startMove() {
        System.out.println("Водитель начал движение");
    }
    public static void stopMove() {
        System.out.println("Водитель остановился");
    }
    public static void refuel() {
        System.out.println("Водитель заехал на заправку");
    }
}
