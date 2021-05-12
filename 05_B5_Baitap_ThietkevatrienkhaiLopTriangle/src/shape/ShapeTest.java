package shape;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("yellow",false);
        System.out.println(shape);

        shape.setFilled(true);
        System.out.println(shape);

        shape.setColor("purple");
        shape.setFilled(false);
        System.out.println(shape);
    }
}
