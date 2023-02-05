package transport;

import com.company.CarDriver;

public class Car extends Transport<CarDriver> implements Participant{
    Type type = Type.valueOf("CAR");

    public Car(String brand, String model, String engineVolume, CarDriver driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMove() {System.out.println("Car starts moving...");}
    @Override
    public void stopMove() {System.out.println("Car stops moving...");}
    @Override
    public void pit_stop() {System.out.println("Машина ушла на пит-стоп");}
    @Override
    public void bestTime() {
        System.out.println("Лучшее время машины:__:__");
    }
    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость машины:___");
    }

    @Override
    public void printType() {
        if (type != null) {
            System.out.println("Тип машины:" + type.getName());
        }
        else {
            System.out.println("Данных по транспортному средству недостаточно");
        }
    }

    public Type getType() {
        return type;
    }
    public void setType(Type type) {
        this.type = type;
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

    enum BodyType {
        SEDAN("седан"),
        HATCHBACK("хэтчбэк"),
        COUPE("купэ"),
        UNIVERSAL("универсал"),
        OFFROAD("внедорожник"),
        SUV("кроссовер"),
        PICKUP("пикап"),
        VAN("фургон"),
        MINIVAN("минивэн");

        private String nameInRussian;

        BodyType(String nameInRussian) {
            this.nameInRussian = nameInRussian;
        }

        public String getNameInRussian() {
            return nameInRussian;
        }

        @Override
        public String toString() {
            return "Тип кузова: " + nameInRussian;
        }
    }
}
