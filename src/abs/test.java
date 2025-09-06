package abs;

public class test {
    public static void main(String[] args) {
        Dog dog = new Dog("Bruno",
                2,
                "cannide");

        Cat cat = new Cat("lucy",
                2,
                "felidas");

        dog.printMeat();
        cat.printMeat();
    }
}
