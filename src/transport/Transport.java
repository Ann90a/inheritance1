package transport;

public abstract class Transport {

    private final String brand;
    private final String model;
    private final int productionYear;
    private final String country;
    private String color;
    private int maxSpeed;

    public Transport(String brand,
                     String model,
                     int productionYear,
                     String country,
                     String color,
                     int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.country = country;
        setColor(color);
        setMaxSpeed(maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            color = "белый";
        }
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0) {
            maxSpeed = 120;
        }
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return  ", поезд " + brand +
                ", модель " + model +
                ", год выпуска " + productionYear +
                ", страна производитель " + country +
                ", цвет " + color +
                ", максимальная скорость " + maxSpeed +
                " км в час.";
    }

}