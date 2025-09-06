package abs;

public abstract class Animal {

    private String name;
    private int age;
    private String family;

    public Animal(String name, int age, String family) {
        this.name = name;
        this.age = age;
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }
}
