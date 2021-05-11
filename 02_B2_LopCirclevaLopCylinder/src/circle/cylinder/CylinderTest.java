package circle.cylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        System.out.println("Volume is: "+cylinder.getVolume());
        System.out.println();

        cylinder = new Cylinder(5);
        System.out.println(cylinder);
        System.out.println("Volume is: "+cylinder.getVolume());
        System.out.println();

        cylinder = new Cylinder(3.8,"blue",10);
        System.out.println(cylinder);
        System.out.println("Volume is: "+cylinder.getVolume());

    }
}
