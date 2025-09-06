package abs;

public class Dog extends Canivorous implements Edible{
    public Dog(String name, int age, String family) {
        super(name, age, family);
    }

    @Override
    public void printMeat() {
        System.out.println("Dog Meat");
    }
}
