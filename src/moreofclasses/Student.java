package moreofclasses;

public class Student {
    private String name;
    private static int countNumberofStudentCreated;

    public Student(String name) {
        this.name = name;
        countNumberofStudentCreated++;
        System.out.println(countNumberofStudentCreated +" Student(s) created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
    Student student1 = new Student("john");
    Student student2 = new Student("doe");

    int number = Student.countNumberofStudentCreated;

    //Student.test();
    }

}
