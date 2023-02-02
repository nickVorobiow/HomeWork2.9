package transport;
import com.company.Driver;

public abstract class Transport<T extends Driver> {
    private final String brand;
    private final String model;
    private String engineVolume;
    private T driver;

    public Transport(String brand, String model, String engineVolume, T driver) {
        if(brand == null) {this.brand = "set brand";}
        else {this.brand = brand;}
        if(model == null) {this.model = "set model";}
        else {this.model = model;}
        if (Double.parseDouble(engineVolume) <= 0) {this.engineVolume = "default";}
        else {this.engineVolume = engineVolume;}
        this.driver = driver;
    }

    public T getDriver() {
        return driver;
    }
    public void setDriver(T driver) {
        this.driver = driver;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getEngineVolume() {
        return engineVolume;
    }
    public void setEngineVolume(String engineVolume) {
        if (Double.parseDouble(engineVolume) <= 0) {this.engineVolume = "default";}
        else {this.engineVolume = engineVolume;}
    }

    public abstract void startMove();
    public abstract void stopMove();

    @Override
    public String toString() {
        return
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume='" + engineVolume + '\'';
    }
}

