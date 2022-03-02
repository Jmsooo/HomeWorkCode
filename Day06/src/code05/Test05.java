package code05;

public class Test05 {


    /**
     * 判断是否是一个直角三角形
     *
     * @param triangle
     * @return
     */
    public boolean isRighTriangle(Triangle triangle) {
        if (triangle.getA() == Math.hypot(triangle.getB(), triangle.getC()))
            return true;
        else if (triangle.getB() == Math.hypot(triangle.getA(), triangle.getC()))
            return true;
        else if (triangle.getC() == Math.hypot(triangle.getA(), triangle.getB()))
            return true;
        else
            return false;
    }

    /**
     * 判断是否是一个等腰三角形
     *
     * @param triangle
     * @return
     */
    public boolean isIsoscelesTriangle(Triangle triangle) {
        if (triangle.getA() == triangle.getB()) {
            return true;
        } else if (triangle.getB() == triangle.getC()) {
            return true;
        } else if (triangle.getA() == triangle.getC())
            return true;
        else
            return false;
    }

    /**
     * 判断是否是一个等边三角形
     *
     * @param triangle
     * @return
     */
    public boolean isEquilateralTriangle(Triangle triangle) {
        if (triangle.getA() == triangle.getB() && triangle.getB() == triangle.getC())
            return true;
        else
            return false;
    }

    /**
     * 用海伦公式求面积
     * 若已知三角形的三条边长分别为a、b、c,S=根号下p(p-a)(p-b)(p-c) (p为三角形周长的一半,即p=1/2（a+b+c）)
     *
     * @param triangle
     * @return
     */
    public double getArea(Triangle triangle) {
        double p = (triangle.getA() + triangle.getB() + triangle.getC()) / 2;
        double helen = p * (p - triangle.getA()) * (p - triangle.getB()) * (p - triangle.getC());
        double area = Math.sqrt(helen);
        return area;
    }

    /**
     * 求周长
     * @param triangle
     * @return
     */
    public double getLength(Triangle triangle) {
        return triangle.getA() + triangle.getB() + triangle.getC();
    }
}
