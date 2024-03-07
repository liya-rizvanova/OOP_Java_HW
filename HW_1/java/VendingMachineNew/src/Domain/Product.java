package Domain;

public class Product {
    private double price;
    private int place;
    private String name;
    private float weight;
    private float volume;
    private String unit;
    private int temperature;

    public Product(double price, int place, String name, float weight, String unit) {
        if (price < 0) {
            this.price = 100;
        } else {
            this.price = price;
        }
        this.place = place;
        this.name = name;
        this.weight = weight;
        this.unit = unit;
    }

    public Product(double price, int place, String name, float volume, String unit, int temperature) {
        //this(price, place, name, volume, unit, temperature);
        this.place = place;
        this.name = name;
        this.volume = volume;
        this.unit = unit;        
        this.temperature = temperature;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            this.price = 100;
        } else {
            this.price = price;
        }
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String toString() {
        return "Product{" +
                "price: " + price +
                ", place: " + place +
                ", name: '" + name + '\'' +
                ", " + weight + unit +
                '}';
    }
}