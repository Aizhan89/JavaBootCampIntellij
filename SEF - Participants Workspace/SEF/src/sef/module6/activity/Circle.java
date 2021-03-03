package  sef.module6.activity;

public class Circle extends Shape {
    private double radius;

    public Circle () {
        this.radius = 0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        double area = 3.14 * radius * radius;
        return area;
    }

    public double calculatePerimeter() {
        double perimeter = 2 * 3.14 * radius;
        return perimeter;
    }

}
