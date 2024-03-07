package Domain;

public class HotDrinks extends Product {
    private float volume;
    private int temperature;

    public HotDrinks(double price, int place, String name, float volume, String unit, int temperature) {
        super(price, place, name, volume, unit);
        this.volume = volume;
        this.temperature = temperature;
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

    @Override
    public String toString() {
        return "HotDrinks{" +
                "price: " + getPrice() +
                ", place: " + getPlace() +
                ", name: '" + getName() + '\'' +
                ", " + getVolume() + getUnit() +
                ", t°=" + temperature + "°C" +
                '}';
    }
}