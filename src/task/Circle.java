package task;

public class Circle extends Shape{
   private double radius;

    public Circle(String name, String color,double radius){
        super("", "");
        this.radius = radius;
    }

    public void printPerimeter(){
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter of a circle is: "+perimeter);

    }


}