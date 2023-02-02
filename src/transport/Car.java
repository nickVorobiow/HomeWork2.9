package transport;

import com.company.CarDriver;

public class Car extends Transport<CarDriver> implements Participant{
    public Car(String brand, String model, String engineVolume, CarDriver driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMove() {
        System.out.println("Car starts moving...");
    }
    @Override
    public void stopMove() {
        System.out.println("Car stops moving...");
    }
    @Override
    public void pit_stop() {
        System.out.println("Машина ушла на пит-стоп");
    }
    @Override
    public void bestTime() {
        System.out.println("Лучшее время машины:__:__");
    }
    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость машины:___");
    }

    @Override
    public String toString() {
        return "Car{" +
                super.toString() +
                '}';
    }

    public class Key {
        private final boolean distantEnginePower;
        private final boolean withoutKeyAccess;

        public Key(boolean distantEnginePower, boolean withoutKeyAccess) {
            if (new Boolean(distantEnginePower) ==  null) {this.distantEnginePower = false;}
            else {this.distantEnginePower = distantEnginePower;}

            if (new Boolean(withoutKeyAccess) == null) {this.withoutKeyAccess = false;}
            else {this.withoutKeyAccess = withoutKeyAccess;}
        }

        @Override
        public String toString() {
            return "distantEnginePower=" + distantEnginePower +
                    ", withoutKeyAccess=" + withoutKeyAccess;
        }
    }
}
