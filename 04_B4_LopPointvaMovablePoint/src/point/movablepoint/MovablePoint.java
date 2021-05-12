package point.movablepoint;

import point.Point;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;
    public MovablePoint(){
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] arrSpeed = {this.xSpeed,this.ySpeed};
        return arrSpeed;
    }

    @Override
    public String toString() {
        return super.toString()+ " move with xSpeed = " + xSpeed +
                ", ySpeed = " + ySpeed;
    }
    public void move() {
        setX(getX()+this.xSpeed);
        setY(getY()+this.ySpeed);
    }
}
