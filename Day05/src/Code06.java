import java.util.Arrays;

public class Code06 {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 3, 2, 1};
        int[] arr2 = {1, 2, 3, 4, 5, 2, 1};

        System.out.println(Arrays.toString(arr1) + " 是否是对称:" + sym(arr1));
        System.out.println(Arrays.toString(arr2) + " 是否是对称:" + sym(arr2));

    }

    public static boolean sym(int[] arr) {
        boolean flag = false;
        loop:
        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
            if (arr[i] == arr[j]) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
