package Shapes;

public class Main {
    public static void main(String[] args) {
        Shapes rectangle = new Rectangle(3.0,5.0);
        Shapes circle = new Circle(4.0);

        System.out.println(rectangle.getArea() + "%" + rectangle.getPerimeter());
        System.out.println(circle.getArea() + "%" + circle.getPerimeter());
    }
}
