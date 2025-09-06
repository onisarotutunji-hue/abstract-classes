package polymorphism;

public class Teacher extends Person{
    private String staffid;
    private String department;

    protected Teacher(String name,
                      String dateOFBirth,
                      String gender,
                      String localGovernment,
                      String state,
                      String country,
                      String staffid,
                      String department) {
        super(name, dateOFBirth, gender, localGovernment, state, country);
        this.staffid = staffid;
        this.department = department;
    }

    public String getStaffid() {
        return staffid;
    }

    public void setStaffid(String staffid) {
        this.staffid = staffid;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
