package inheritance;

public class Account {
    private String name;
    private String number;
    private String pin;
    private double interest;

    public Account(String name, String number, String pin, double interest) {
        this.name = name;
        this.number = number;
        this.pin = pin;
        this.interest = interest;
    }


    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getPin() {
        return pin;
    }

    public double getInterest() {
        return interest;
    }

}
