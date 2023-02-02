package transport;

import com.company.CargoDriver;

public class Cargo extends Transport<CargoDriver> implements Participant {

    public Cargo(String brand, String model, String engineVolume, CargoDriver driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMove() {
        System.out.println("Cargo car starts moving...");
    }
    @Override
    public void stopMove() {
        System.out.println("Cargo car stops moving...");
    }
    @Override
    public void pit_stop() {
        System.out.println("Грузовая машина ушла на пит-стоп");
    }
    @Override
    public void bestTime() {
        System.out.println("Лучшее время грузовой машины:__:__");
    }
    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость грузовой машины:___");
    }

    @Override
    public String toString() {
        return "Cargo{" +
                super.toString() +
                '}';
    }
}
