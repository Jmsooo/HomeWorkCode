import java.util.Random;

public class Code01 {
    public static void main(String[] args) {
        int[] dltNum = new int[10];
        Random random = new Random();
        int num;
        for (int i = 0; i < dltNum.length; i++) {
            num = random.nextInt(99) + 1;
            dltNum[i] = num;
        }

        System.out.println("您的大乐透号码为:");

        for (int i = 0; i < dltNum.length; i++) {
            System.out.print(dltNum[i] + "\t");
        }
    }
}
