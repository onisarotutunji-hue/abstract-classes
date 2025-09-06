package assignment;

public class WeightableProducts extends Product {
    private double weight;

    protected WeightableProducts(double price, String brand, String expiryDate, double weight) {
        super(price, brand, expiryDate);
        this.weight = weight;
    }

    public double calculateTotalPrice() {
        return getPrice() * weight;  // price per unit * weight
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
