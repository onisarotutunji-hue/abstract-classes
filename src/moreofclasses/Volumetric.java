package moreofclasses;

public interface Volumetric {

    void tryme();

    default void test(){
        System.out.println("this is a default method");
    }
}
