import java.util.Scanner;


public class Code07 {
    public static void main(String[] args) {
        System.out.println("键盘输入任意一天,判断它星期几!");

        Scanner sc = new Scanner(System.in);

        System.out.print("请输入年份:");
        int year = sc.nextInt();

        System.out.print("月份:");
        int month = sc.nextInt();

        System.out.print("日期:");
        int day = sc.nextInt();

        int week = 2;
        int nums = 0;
        int judgeNum;

        int[][] date = new int[][]{
                {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
                {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
        };


        if (year >= 2019) {
            for (int i = 2019; i < year; i++) {
                judgeNum = JudgeYear(i);
                for (int j = 0; j < 12; j++) {
                    nums += date[judgeNum][j];
                }
            }
        }

        int sumsYear = SumsYear(year, month, day, date);


        week = week + nums + sumsYear - 1;

        switch (week % 7) {
            case 1:
                System.out.println(year + "年" + month + "月" + day + "日是星期一");
                break;
            case 2:
                System.out.println(year + "年" + month + "月" + day + "日是星期二");
                break;
            case 3:
                System.out.println(year + "年" + month + "月" + day + "日是星期三");
                break;
            case 4:
                System.out.println(year + "年" + month + "月" + day + "日是星期四");
                break;
            case 5:
                System.out.println(year + "年" + month + "月" + day + "日是星期五");
                break;
            case 6:
                System.out.println(year + "年" + month + "月" + day + "日是星期六");
                break;
            case 0:
                System.out.println(year + "年" + month + "月" + day + "日是星期日");
                break;

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
