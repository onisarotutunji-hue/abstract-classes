package polymorphism;

public class test {
    public static void main(String[] args) {
        Student student = new Student(
                "Student Student",
                "12/03/2007",
                "Male",
                "Ikeja",
                "Lagos",
                "Nigeria",
                "EES/2333/23334",
                "Law",
                "Law"
        );
        Teacher teacher = new Teacher(
                "Teacher teacher",
                "12/03/1986",
                "Male",
                "Ikeja",
                "Lagos",
                "Nigeria",
                "Law/23334",
                "Law"
        );
       displayPersonNameAndAge(teacher);
       displayPersonNameAndAge(student);
    }
//    public static void  displayUserNameAndAge(Student student){
//        System.out.println("Your name is "+student.getName());
//        System.out.println("Your date of birth is "+ student.getDateOFBirth());
//    }
//    public static void  displayUserNameAndAge(Teacher teacher){
//        System.out.println("Your name is "+teacher.getName());
//        System.out.println("Your date of birth is "+ teacher.getDateOFBirth());
//    }

    public static void  displayPersonNameAndAge(Person person){
        System.out.println("Your name is "+person.getName());
        System.out.println("Your date of birth is "+ person.getDateOFBirth());
    }
}
