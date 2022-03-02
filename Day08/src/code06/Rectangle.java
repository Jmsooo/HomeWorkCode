package code06;

public class Rectangle {
    private int length;
    private int width;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Rectangle() {
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public double getArea(int length, int width) {
        return length * width;
    }

    public double getPerimeter(int length, int width) {
        return 2 * length * width;
    }

    public void getInfo(int length, int width) {
        System.out.println("长: " + length);
        System.out.println("宽: " + width);
        System.out.println("面积: " + getArea(length, width));
        System.out.println("周长: " + getPerimeter(length, width));
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
