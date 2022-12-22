package transport;

public class Car extends Transport {

    private String gear;
    private String body;
    private String number;
    private int capacity;
    private boolean summerTyres;
    private Key key;
    private Insurance insurance;

    private static class Key {
        String key;
    }

    private static class Insurance {
        String insurance;
    }

    public Car(String brand,
               String model,
               int productionYear,
               String country,
               String color,
               int maxSpeed,
               String gear,
               String body,
               String number,
               int capacity,
               boolean summerTyres,
               Key key,
               Insurance insurance) {
        super(brand, model, productionYear, country, color, maxSpeed);
        this.gear = gear;
        this.body = body;
        this.number = number;
        this.capacity = capacity;
        this.summerTyres = summerTyres;
        this.key = key;
        this.insurance = insurance;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        this.gear = gear;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isSummerTyres() {
        return summerTyres;
    }

    public void setSummerTyres(boolean summerTyres) {
        this.summerTyres = summerTyres;
    }
}