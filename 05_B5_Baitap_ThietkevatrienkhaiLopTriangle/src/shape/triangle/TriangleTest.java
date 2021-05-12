package shape.triangle;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle();
        System.out.println(triangle1);
        System.out.println("Perimeter is: "+triangle1.getPerimeter());
        System.out.println("Area is: "+triangle1.getArea());

        triangle1 = new Triangle("red", false,3,4,5);
        System.out.println(triangle1);
        System.out.println("Perimeter is: "+triangle1.getPerimeter());
        System.out.println("Area is: "+triangle1.getArea());

        triangle1.setSide1(8);
        triangle1.setSide2(10);
        triangle1.setSide3(6);
        triangle1.setColor("ocean");
        triangle1.setFilled(true);
        System.out.println(triangle1);
        System.out.println("Perimeter is: "+triangle1.getPerimeter());
        System.out.println("Area is: "+triangle1.getArea());

    }
}
