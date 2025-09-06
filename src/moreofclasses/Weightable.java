package moreofclasses;

public interface Weightable {

    void tryme();

    default void test(){
        System.out.println("this is a default method");
    }
}
