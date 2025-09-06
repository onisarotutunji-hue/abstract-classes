package polymorphism;

public class Student extends Person{
    private String maticnumber;
    private String course;
    private String faculty;

    protected Student(String name,
                      String dateOFBirth,
                      String gender,
                      String localGovernment,
                      String state,
                      String country,
                      String maticnumber,
                      String course,
                      String faculty) {
        super(name, dateOFBirth, gender, localGovernment, state, country);
        this.maticnumber = maticnumber;
        this.course = course;
        this.faculty = faculty;
    }

    public String getMaticnumber() {
        return maticnumber;
    }

    public void setMaticnumber(String maticnumber) {
        this.maticnumber = maticnumber;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}
