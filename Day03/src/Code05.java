import java.util.Scanner;

public class Code05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入年份:");
        int year = sc.nextInt();
        switch (year % 12) {
            case 1:
                System.out.println(year + "是鸡年");
                break;
            case 2:
                System.out.println(year + "是狗年");
                break;
            case 3:
                System.out.println(year + "是猪年");
                break;
            case 4:
                System.out.println(year + "是鼠年");
                break;
            case 6:
                System.out.println(year + "是牛年");
                break;
            case 7:
                System.out.println(year + "是虎年");
                break;
            case 8:
                System.out.println(year + "是兔年");
                break;
            case 9:
                System.out.println(year + "是龙年");
                break;
            case 10:
                System.out.println(year + "是蛇年");
                break;
            case 11:
                System.out.println(year+"是马年");
                break;
            case 0:
                System.out.println(year+"是羊年");
                break;
        }
    }
}
