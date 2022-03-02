import java.util.Scanner;

public class Code03 {
    public static void main(String[] args) {
        double discount = 1;
        double totalPrice;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入总价格:");
        totalPrice = sc.nextDouble();
        System.out.println("总结:" + totalPrice);
        if (totalPrice < 0) {
            System.out.println("输入错误!!!");
        } else if (totalPrice >= 0 && totalPrice < 200) {
            discount = 1;
        } else if (totalPrice >= 200 && totalPrice < 300) {
            discount = 0.8;
        } else if (totalPrice >= 300 && totalPrice < 400) {
            discount = 0.7;
        } else if (totalPrice >= 400 && totalPrice < 500) {
            discount = 0.6;
        } else if (totalPrice >= 500) {
            discount = 0.5;
        }
        totalPrice = totalPrice * discount;
        System.out.println("折扣:" + discount);
        System.out.println("折扣后总价:" + totalPrice);
    }
}
