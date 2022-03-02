import java.util.Arrays;

public class Code08 {
    public static void main(String[] args) {
        char[] answer = {'A', 'D', 'B', 'C', 'D'};

        char[] xshang = {'D', 'C', 'B', 'A', 'D'};
        char[] xgui = {'A', 'D', 'B', 'C', 'D'};
        char[] xgu = {'A', 'D', 'B', 'C', 'A'};
        char[] xhao = {'A', 'B', 'C', 'D', 'D'};

        int count = 0;

        System.out.println("标准答案: " + Arrays.toString(answer));
        System.out.println("-----------------------");
        System.out.println("小尚: "+Arrays.toString(xshang));
        System.out.println("小硅: " + Arrays.toString(xgui));
        System.out.println("小谷: "+Arrays.toString(xgu));
        System.out.println("小好: " +Arrays.toString(xhao));
        System.out.println("-----------------------");
        System.out.println("满分10分,小尚: 得分: " + grade(answer, xshang) + "分");
        System.out.println("满分10分,小尚: 得分: " + grade(answer, xgui) + "分");
        System.out.println("满分10分,小尚: 得分: " + grade(answer, xgu) + "分");
        System.out.println("满分10分,小尚: 得分: " + grade(answer, xhao) + "分");

    }

    public static int grade(char[] answer, char[] xs) {
        int count = 0;

        for (int i = 0; i < answer.length; i++) {
            if (xs[i] == answer[i]) {
                count += 2;
            }
        }

        return count;
    }
}
