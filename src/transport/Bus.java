package transport;

import com.company.BusDriver;

public class Bus extends Transport<BusDriver> implements Participant {

    public Bus(String brand, String model, String engineVolume, BusDriver driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMove() {
        System.out.println("Bus starts moving...");
    }
    @Override
    public void stopMove() {
        System.out.println("Bus stops moving...");
    }
    @Override
    public void pit_stop() {
        System.out.println("Автобус ушел на пит-стоп");
    }
    @Override
    public void bestTime() {
        System.out.println("Лучшее время автобуса:__:__");
    }
    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость автобуса:___");
    }

    @Override
    public String toString() {
        return "Bus{" +
                super.toString() +
                '}';
    }
}
