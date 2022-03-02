import java.util.Arrays;

public class Code05 {
    public static void main(String[] args) {
        int[] arr = {95, 92, 75, 76, 98, 71, 80, 58, 91, 91};
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        int scoreSum = 0;

        double scoreAge;

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            scoreSum += arr[i];
        }

        scoreAge = scoreSum / arr.length;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > scoreAge) {
                count++;
            }
        }

        System.out.println("高于平均分:  " + scoreAge + "的个数有" + count + "个");
    }
}
