package moreofclasses;

public class VolumetricProduct extends Product implements Volumetric {
    public VolumetricProduct(int id, String name, double product) {
        super(id, name, product);
    }

    @Override
    public void tryme() {

    }

    @Override
    public void test() {
        Volumetric.super.test();
    }
}
