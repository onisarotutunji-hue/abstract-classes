package assignment;

public class VolumetricProducts extends Product{
    private double volume;
    protected VolumetricProducts(double price, String brand, String expiryDate, double volume) {
        super(price, brand, expiryDate);
        this.volume = volume;

    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
