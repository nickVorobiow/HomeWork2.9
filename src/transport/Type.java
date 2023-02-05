package transport;

public enum Type {
    CAR("Легковой автомобиль"),
    CARGO("Грузовой автомобиль"),
    BUS("Автобус");

    private String name;

    Type(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
