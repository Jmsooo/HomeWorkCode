package code12;

import java.util.Objects;

public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle() {
    }

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return a == triangle.a &&
                b == triangle.b &&
                c == triangle.c;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }

    public boolean IfToTriangle(int a, int b, int c) {
        return (a + b) > c && (b + c) > a && (a + c) > b;
    }

    public double getArea(int a, int b, int c) {
        double area = 0;
        if (IfToTriangle(a, b, c)) {
            double p = (a + b + c) / 2;
            double helen = p * (p - a) * (p - b) * (p - c);
            area = Math.sqrt(helen);
        }
        return area;
    }

    public double getPiremeter(int a, int b, int c) {
        return a + b + c;
    }
}
