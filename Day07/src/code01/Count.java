package code01;

public class Count {
    /**
     * 求0~n个整数的累加和，如果没有传参，就返回0
     *
     * @param nums
     * @return
     */
    public long sum(int... nums) {
        long sum = 0;
        if (nums.length == 0) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    /**
     * 求1~n个整数中的最大值
     *
     * @param a
     * @param others
     * @return
     */
    public int max(int a, int... others) {

        return 0;
    }

    /**
     * 求0~n个字符串的拼接结果
     *
     * @param strings
     * @return
     */
    public String concat(String... strings) {
        String str = "";
        for (int i = 0; i < strings.length; i++) {
            str += strings[i];
        }
        return str;
    }

    /**
     * 判断0~n个整数是否都是偶数，如果都是偶数，返回true，否则返回false
     *
     * @param nums
     * @return
     */
    public boolean isEven(int... nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                return false;
            }
        }
        return true;
    }


}
