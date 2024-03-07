package Domain;

public class Bottle extends Product {
    private float volume;

    public Bottle(double price, int place, String name, float volume, String unit) {
        super(price, place, name, volume, unit);
        this.volume = volume;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Bottle{" +
                "price: " + getPrice() +
                ", place: " + getPlace() +
                ", name: '" + getName() + '\'' +
                ", " + getVolume() + getUnit() +
                '}';
    }
}