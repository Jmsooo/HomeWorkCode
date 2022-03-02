package code02;

public class Circle {

    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double showArea(double r) {
        return Math.PI * r * r;
    }

    public double showPerimeter(double r) {
        return 2 * Math.PI * r;
    }
}
