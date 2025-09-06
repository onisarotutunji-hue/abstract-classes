package moreofclasses;

public abstract class Product {
    private int id;
    private String name;
    private double product;

    public Product(int id, String name, double product) {
        this.id = id;
        this.name = name;
        this.product = product;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getProduct() {
        return product;
    }

    public void setProduct(double product) {
        this.product = product;
    }
}
