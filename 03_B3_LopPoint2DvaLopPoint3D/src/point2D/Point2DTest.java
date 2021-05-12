package point2D;

public class Point2DTest {
    public static void main(String[] args) {
        Point2D obj1 = new Point2D();
        System.out.println(obj1);

        obj1 = new Point2D(10.0f, 5.0f);
        System.out.println(obj1);

        float sumXY = obj1.getX() + obj1.getY();
        System.out.println(sumXY);

        obj1.setXY(100.0f, 20.0f);
        System.out.println(obj1);

        float[] arr = obj1.getXY();
        for (float value: arr) {
            System.out.print(value+" ");
        }
        System.out.println();
    }
}
