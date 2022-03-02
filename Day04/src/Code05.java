import java.util.Scanner;

public class Code05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("请输入年: ");
        int year = sc.nextInt();

        System.out.print("请输入月: ");
        int month = sc.nextInt();

        System.out.print("请输入日 :");
        int day = sc.nextInt();

        int week = 0;
        int nums = 0;
        int judgeNum;

        int[][] date = new int[][]{
                {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
                {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
        };

        judgeNum = JudgeYear(year);

        for (int i = 0; i <= month - 2; i++) {
            nums += date[judgeNum][i];
        }

        week = nums + day;

        System.out.println(year + "年" + month + "月" + day + "日是这一年的第" + week + "天");
    }

    public static int JudgeYear(int year) {
        int judgeNum;
        boolean judge = (year % 4 == 0) || (year % 400 == 0 && year % 100 != 0);
        if (judge) {
            judgeNum = 1;
        } else {
            judgeNum = 0;
        }
        return judgeNum;
    }
}
