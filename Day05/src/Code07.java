import java.util.Arrays;

public class Code07 {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,3,2,1};
        int[] arr2 = {1,2,3,4,3,2,1};

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        System.out.println("是否一致: " + agreed(arr1,arr2));

    }

    public static boolean agreed(int[] arr1,int[] arr2){

        boolean flag = false;

        int num1 = arr1.length;
        int num2 = arr2.length;

        if (num1 == num2){
            for (int i = 0; i < num1; i++) {
                if (arr1[i]==arr2[i]){
                    flag = true;
                }else {
                    flag = false;
                    break;
                }
            }
        }else {
            return false;
        }
        return flag;
    }
}
