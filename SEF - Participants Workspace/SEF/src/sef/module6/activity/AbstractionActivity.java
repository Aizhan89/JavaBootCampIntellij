package  sef.module6.activity;

public class AbstractionActivity {

    public static void main(String[] args) {
        Rectangle r = new Rectangle(5,6);
        r.setColor("White");

        System.out.println("---------------");
        System.out.println("Rectangle color: " + r.getColor());
        System.out.println("Rectangle area: " + r.calculateArea());
        System.out.println("Rectangle perimeter: " + r.calculatePerimeter());

        Circle c = new Circle(5);
        c.setColor("Red");

        System.out.println("---------------");
        System.out.println("Circle color: " + c.getColor());
        System.out.println("Circle area: " + c.calculateArea());
        System.out.println("Circle perimeter: " + c.calculatePerimeter());
    }
}
