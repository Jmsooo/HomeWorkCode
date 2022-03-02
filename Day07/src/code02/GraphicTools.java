package code02;

public class GraphicTools {

    /**
     * 打印5行5列*矩形
     */
    public void printRectangle() {
        String[][] str = new String[5][5];
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     * 打印line行colomn列由sign组成的矩形
     *
     * @param line
     * @param column
     * @param sign
     */
    public void printRectangle(int line, int column, String sign) {
        sign = "";
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < line; j++) {
                sign += "* ";
            }
            sign += "\r\n";
        }
    }

    /**
     * 根据底边和底边对应的高求三角形面积
     *
     * @param base
     * @param height
     * @return
     */
    public double getTriangleArea(double base, double height) {
        return (base * height) / 2;
    }

    /**
     * 根据三角形的三条边求三角形面积，如果a,b,c不能组成三角形，打印不能组成三角形，并返回0.0
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public double getTriangleArea(double a, double b, double c) {
        if (a > 0 && b > 0 && c > 0) {
            if ((a + b) > 0 && (b + c) > 0 && (a + c) > 0) {
                double p = (a + b + c) / 2;
                double helen = p * (p - a) * (p - b) * (p - c);
                double area = Math.sqrt(helen);
                return area;
            }
        }
        return 0.0;
    }
}
