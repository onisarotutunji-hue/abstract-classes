package assignment;

public class Test {
    public static void main(String[] args) {

        WeightableProducts weightableProducts = new WeightableProducts(800, "Dangote", "09/05/2037", 8);

        System.out.println("Brand: " + weightableProducts.getBrand());
        System.out.println("Expiry Date: " + weightableProducts.getExpiryDate());
        System.out.println("Weight: " + weightableProducts.getWeight() + "kg");
        System.out.println("Total Price: " + weightableProducts.calculateTotalPrice());

    }
}
