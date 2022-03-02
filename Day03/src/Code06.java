import java.util.Scanner;

public class Code06 {
    public static void main(String[] args) {
        double x1, x2;
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入a的值:");
        double a = sc.nextDouble();
        System.out.print("请输入b的值:");
        double b = sc.nextDouble();
        System.out.print("请输入c的值:");
        double c = sc.nextDouble();
        if (a != 0) {
            double sum = b * b - 4 * a * c;
            double dart = Math.sqrt(sum);
            if (sum > 0) {
                System.out.println("方程有两个解:");
                x1 = (-b + dart) / (2 * a);
                x2 = (-b - dart) / (2 * a);
                System.out.println("x1=" + x1 + ",x2=" + x2);
            } else if (sum == 0) {
                System.out.println("方程有一个解:");
                x1 = -b / (2 * a);
                System.out.println("x=" + x1);
            } else if (sum < 0) {
                System.out.println("方程无解!");
            }
        } else if (a == 0 && b != 0) {
            System.out.println("方程有一个解:");
            x1 = -c / b;
            System.out.println("x=" + x1);
        }
    }
}
