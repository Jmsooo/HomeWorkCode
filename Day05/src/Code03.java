import java.util.Scanner;

public class Code03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] hua = new String[]{"黑桃", "红桃", "梅花", "方片"};
        String[] dian = new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        for (int i = 0; i < hua.length; i++) {
            Print(i, hua, dian);
            System.out.println();
        }

        System.out.println("想抽取第几张扑克: ");
        int number = scanner.nextInt();

        int a = number / 13;
        int b = number % 13;

        b -= 1;

        if (number % 13 == 0) {
            System.out.println(hua[a - 1] + "K");
        } else {
            System.out.println(hua[a] + dian[b]);
        }


    }

    public static void Print(int i, String[] hua, String[] dian) {
        for (int i1 = 0; i1 < dian.length; i1++) {
            System.out.print(hua[i] + dian[i1] + "\t");
        }
    }
}
