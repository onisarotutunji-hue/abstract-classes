package moreofclasses;

public class WeightableProducts extends Product implements Weightable {
    public WeightableProducts(int id, String name, double product) {
        super(id, name, product);
    }

    @Override
    public void tryme() {

    }

    @Override
    public void test() {
        Weightable.super.test();
    }
}
