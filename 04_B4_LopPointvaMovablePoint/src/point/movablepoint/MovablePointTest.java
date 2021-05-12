package point.movablepoint;

public class MovablePointTest {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint();
        System.out.println("Before move:");
        System.out.println(point);

        point = new MovablePoint(1.0f,2.0f);
        point.move();
        System.out.println("After move:");
        System.out.println(point);

        point.setXY(5.0f,6.0f);
        point.setSpeed(3.0f,4.0f);
        System.out.println("Before move:");
        System.out.println(point);
        point.move();
        System.out.println("After move:");
        System.out.println(point);

        point = new MovablePoint(30f,40.5f,15.4f,20.8f);
        System.out.println("Before move:");
        System.out.println(point);
        point.move();
        System.out.println("After move:");
        System.out.println(point);
    }
}
