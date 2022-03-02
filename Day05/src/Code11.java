import java.util.Scanner;

public class Code11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个单词: ");
        String words = scanner.next();
        char[] arr = words.toCharArray();

        //System.out.println("arr.length = " + arr.length);

        System.out.print("判断单词中是否存在字母'a' : ");

        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a'){
                flag =true;
                break;
            }
        }

        if (flag){
            System.out.println("存在!");
        }else {
            System.out.println("不存在!");
        }


    }
}
