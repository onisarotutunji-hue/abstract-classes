package polymorphism;

public class Person {

    private String name;
    private String dateOFBirth;
    private String gender;
    private String localGovernment;
    private String state;
    private String country;

    protected Person(String name, String dateOFBirth, String gender, String localGovernment, String state, String country) {
        this.name = name;
        this.dateOFBirth = dateOFBirth;
        this.gender = gender;
        this.localGovernment = localGovernment;
        this.state = state;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOFBirth() {
        return dateOFBirth;
    }

    public void setDateOFBirth(String dateOFBirth) {
        this.dateOFBirth = dateOFBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLocalGovernment() {
        return localGovernment;
    }

    public void setLocalGovernment(String localGovernment) {
        this.localGovernment = localGovernment;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
