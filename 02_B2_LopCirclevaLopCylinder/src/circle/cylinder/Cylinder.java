package circle.cylinder;

import circle.Circle;

public class Cylinder extends Circle {
    private double height = 2.0;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return getArea()*this.height;
    }

    @Override
    public String toString() {
        return "A cylinder with height = " + height + ", which has bottom circle is "+super.toString();
    }
}
