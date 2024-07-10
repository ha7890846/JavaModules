abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }
    public abstract double calculateArea();

    public void displayInfo() {
        System.out.println("Shape: " + name);
        System.out.println("Area: " + calculateArea());
    }
    public static void main (String[] args) {
        Shape circle = new Circle("Circle", 5.0); // Here, "Circle" is the name and 5.0 is the radius
        Shape rectangle = new Rectangle("Rectangle", 4.0, 6.0);
        circle.displayInfo();
        rectangle.displayInfo();
    }
}
class Circle extends Shape{
    private double radius;
    public Circle(String name, double radius){
        super(name);
        this.radius = radius;
    }
    @Override
    public double calculateArea(){
        return 3.14*radius*radius;
    }
}
class Rectangle extends Shape{
    private double length;
    private double width;
    
    public Rectangle(String name,double length,double width){
        super(name);
        this.length = length;
        this.width = width;
    }
    @Override
    public double calculateArea(){
        return length*width;
    }
}
// TODO: Create a Circle class that extends Shape
// The Circle class should have a private double radius attribute and a constructor to initialize it
// It should also implement the calculateArea() method 

// TODO: Create a Rectangle class that extends Shape
// The Rectangle class should have private double attributes for length and width, and a constructor to initialize them
// It should also implement the calculateArea() method 
