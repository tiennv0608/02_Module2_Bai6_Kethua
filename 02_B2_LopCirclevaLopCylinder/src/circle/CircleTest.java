package circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        System.out.println("Area is: " + circle.getArea());
        System.out.println();
        circle = new Circle(3.8,"yellow");
        System.out.println(circle);
        System.out.println("Area is: " + circle.getArea());
    }
}
