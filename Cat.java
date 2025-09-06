package abs;

public class Cat extends Canivorous implements Edible{

    public Cat(String name, int age, String family) {
        super(name, age, family);
    }

    @Override
    public void printMeat() {
        System.out.println("Cat Meat!");
    }
}
