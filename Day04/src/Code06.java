import java.util.Scanner;

public class Code06 {
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

        if (year >= 2000) {
            for (int i = 2000; i < year; i++) {
                judgeNum = JudgeYear(i);
                for (int j = 0; j < 12; j++) {
                    nums += date[judgeNum][j];
                }
            }
        }

        int sumsYear = SumsYear(year, month, day, date);

/*        for (int i = 0; i <= month - 2; i++) {
            nums += date[judgeNum][i];
        }*/

        week = nums + sumsYear;

        int i = week % 5;

        switch (i) {
            case 1:
            case 2:
            case 3:
                System.out.println(year + "年" + month + "月" + day + "日是这一天是打鱼!");
                break;
            case 4:
            case 0:
                System.out.println(year + "年" + month + "月" + day + "日是这一天是晒网!");
        }


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

    public static int SumsYear(int year, int month, int day, int[][] date) {
        int nums = 0;
        int judgeNum = JudgeYear(year);

        for (int i = 0; i <= month - 2; i++) {
            nums += date[judgeNum][i];
        }
        nums += day;
        return nums;

    }
}
