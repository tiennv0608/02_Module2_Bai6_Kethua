package point2D.point3D;

import point2D.Point2D;

public class Point3DTest {
    public static void main(String[] args) {
        Point3D point1 = new Point3D();
        System.out.println(point1);

        point1 = new Point3D(10.0f,5.0f,2.0f);
        System.out.println(point1);

        point1.setXYZ(100.0f,20.0f,30.0f);
        System.out.println(point1);

        Point2D point2 = new Point3D(10.5f,5.5f,7.0f);
        System.out.println(point2);

        Point3D point3 = (Point3D) point2;
        point3.setZ(9.5f);
        System.out.println(point2);
    }
}
