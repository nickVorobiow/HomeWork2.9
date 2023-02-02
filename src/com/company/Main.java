package com.company;


import transport.Bus;
import transport.Car;
import transport.Cargo;
import transport.Transport;

public class Main {

    public static void main(String[] args) {
        CarDriver driver1 = new CarDriver("driver1", true, 5);
        Car car1 = new Car("Audi", "A5", "3.0", driver1);
        Car car2 = new Car("Maseratti", "Granturismo", "4.4", driver1);
        Car car3 = new Car("Mitsubishi", "Evolution", "2.0", driver1);
        Car car4 = new Car("Nissan", "r32", "2.6", driver1);


        BusDriver driver2 = new BusDriver("driver2", true, 6);
        Bus bus1 = new Bus("Mercedes", "merin", "7.0", driver2);
        Bus bus2 = new Bus("VW", "wag", "6.0", driver2);
        Bus bus3 = new Bus("LiAZ", "2023", "8.0", driver2);
        Bus bus4 = new Bus("Great Wall", "modelX", "10.0", driver2);

        CargoDriver driver3 = new CargoDriver("driver3", true, 7);
        Cargo cargo1 = new Cargo("KamAz", "KamAZ_2023", "5.0", driver3);
        Cargo cargo2 = new Cargo("Tatra", "model_X", "3.5", driver3);
        Cargo cargo3 = new Cargo("Skoda", "Racing cargo model", "4.0", driver3);
        Cargo cargo4 = new Cargo("Mitsubishi", "L200", "3.0", driver3);

        System.out.println(car1);
        System.out.println(bus1);
        System.out.println(cargo1 + "\n");

        bus2.startMove();
        bus2.stopMove();
        System.out.println();
        printMessage(car1);
        printMessage(cargo1);
        printMessage(bus1);
    }

    private static void printMessage(Transport<?> transport) {
        System.out.println("Водитель " + transport.getDriver().getFullName() +
                " управляет автомобилем " + transport.getBrand() + " " + transport.getModel()
                + " и будет участвовать в заезде");
    }
}
