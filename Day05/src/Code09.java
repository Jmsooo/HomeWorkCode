import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Code09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入本组学员的人数: ");

        int num = scanner.nextInt();

        int[] scores = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("学员 " + (i + 1) + " 的成绩为 : ");
            int score = scanner.nextInt();
            scores[i] = score;
        }

        System.out.println("Arrays.toString(scores) = " + Arrays.toString(scores));

        for (int i = 0; i < scores.length - 1; i++) {
            for (int j = 0; j < scores.length - 1 - i; j++) {
                if (scores[j] > scores[j + 1]) {
                    int temp = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = temp;
                }
            }
        }

        System.out.println("排序后 : " + Arrays.toString(scores));
    }
}
