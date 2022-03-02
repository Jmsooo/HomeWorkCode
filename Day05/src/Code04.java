public class Code04 {
    public static void main(String[] args) {
        char[] c = {'a', 'l', 'f', 'm', 'f', 'o', 'b', 'b', 's', 'n'};
        int[] nums = new int[26];

        int index;

        char chars;

        int count = 0;

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                if (c[i] == c[j]) {
                    count++;
                }
            }
            int in = (int) c[i];

            index = in - 97;
            nums[index] = count;
            count = 0;
        }

        for (int i = 0; i < nums.length; i++) {
            chars = (char) (i + 97);
            if (nums[i] == 0) {
                continue;
            }
            System.out.println(chars + "--" + nums[i]);
        }

    }
}
