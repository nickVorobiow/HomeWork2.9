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

    enum N1 {
        BOUNDS(null,3.5f);

        private Float lower_bound;
        private Float upper_bound;

        N1(Float lower_bound, Float upper_bound) {
            this.lower_bound = lower_bound;
            this.upper_bound = upper_bound;
        }

        @Override
        public String toString() {
            if (lower_bound == null) {
                return "Грузоподъемность до " +
                        upper_bound + " тонн";
            }
            else if (upper_bound == null) {
                return "Грузоподъемность от " +
                        lower_bound + " тонн";
            }
            else {
                return "Грузоподъемность от " +
                        lower_bound + " до " + upper_bound + " тонн";
            }
        }
    }

    enum N2 {
        BOUNDS(3.5f,12.0f);

        private Float lower_bound;
        private Float upper_bound;

        N2(Float lower_bound, Float upper_bound) {
            this.lower_bound = lower_bound;
            this.upper_bound = upper_bound;
        }

        @Override
        public String toString() {
            if (lower_bound == null) {
                return "Грузоподъемность до " +
                        upper_bound + " тонн";
            }
            else if (upper_bound == null) {
                return "Грузоподъемность от " +
                        lower_bound + " тонн";
            }
            else {
                return "Грузоподъемность от " +
                        lower_bound + " до " + upper_bound + " тонн";
            }
        }
    }

    enum N3 {
        BOUNDS(12.0f,null);

        private Float lower_bound;
        private Float upper_bound;

        N3(Float lower_bound, Float upper_bound) {
            this.lower_bound = lower_bound;
            this.upper_bound = upper_bound;
        }

        @Override
        public String toString() {
            if (lower_bound == null) {
                return "Грузоподъемность до " +
                        upper_bound + " тонн";
            }
            else if (upper_bound == null) {
                return "Грузоподъемность от " +
                        lower_bound + " тонн";
            }
            else {
                return "Грузоподъемность от " +
                        lower_bound + " до " + upper_bound + " тонн";
            }
        }
    }
}
