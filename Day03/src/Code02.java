import java.util.Scanner;

public class Code02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符:");
        String next = sc.next();
        char c = next.charAt(0);
        if (c >= 48 && c <= 57) {
            System.out.println(c + "是数字");
        } else if (c >= 65 && c <= 90) {
            System.out.println(c + "是大写字母");
        } else if (c >= 97 && c <= 122) {
            System.out.println(c + "是小写字母");
        } else {
            System.out.println(c + "非数字非字母的其他字符.");
        }

    }
}
