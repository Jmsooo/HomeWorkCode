import java.util.Scanner;

public class Code04 {
    public static void main(String[] args) {
        System.out.println("请输入你的生日:");

        Scanner sc = new Scanner(System.in);

        System.out.print("请输入年份:");
        int year = sc.nextInt();

        System.out.print("月份:");
        int month = sc.nextInt();

        System.out.print("日期:");
        int day = sc.nextInt();

        boolean flag = check(year, month, day);

        if (flag == false) {
            return;
        }


        switch (month) {
            case 1:
                print(month, day);
                if (day >= 20) {
                    System.out.println("水瓶座");
                } else {
                    System.out.println("摩羯座");
                }
                break;
            case 2:
                print(month, day);
                if (day >= 19) {
                    System.out.println("双鱼座");
                } else {
                    System.out.println("水瓶座");
                }
                break;
            case 3:
                print(month, day);
                if (day >= 21) {
                    System.out.println("白羊座");
                } else {
                    System.out.println("双鱼座");
                }
                break;
            case 4:
                print(month, day);
                if (day >= 21) {
                    System.out.println("金牛座");
                } else {
                    System.out.println("白羊座");
                }
                break;
            case 5:
                print(month, day);
                if (day >= 21) {
                    System.out.println("双子座");
                } else {
                    System.out.println("金牛座");
                }
                break;
            case 6:
                print(month, day);
                if (day >= 21) {
                    System.out.println("巨蟹座");
                } else {
                    System.out.println("双子座");
                }
                break;
            case 7:
                print(month, day);
                if (day >= 21) {
                    System.out.println("狮子座");
                } else {
                    System.out.println("巨蟹座");
                }
                break;
            case 8:
                print(month, day);
                if (day >= 21) {
                    System.out.println("处女座");
                } else {
                    System.out.println("狮子座");
                }
                break;
            case 9:
                print(month, day);
                if (day >= 21) {
                    System.out.println("天枰座");
                } else {
                    System.out.println("处女座");
                }
                break;
            case 10:
                print(month, day);
                if (day >= 21) {
                    System.out.println("天蝎座");
                } else {
                    System.out.println("天枰座");
                }
                break;
            case 11:
                print(month, day);
                if (day >= 21) {
                    System.out.println("射手座");
                } else {
                    System.out.println("天蝎座");
                }
                break;
            case 12:
                print(month, day);
                if (day >= 21) {
                    System.out.println("摩羯座");
                } else {
                    System.out.println("射手座");
                }
                break;
        }
    }

    public static void print(int month, int day) {
        System.out.print("生日" + month + "月" + day + "日是");
    }

    public static boolean check(int year, int month, int day) {
        int judgeNum;
        boolean judge = (year % 4 == 0) || (year % 400 == 0 && year % 100 != 0);
        int[][] date = new int[][]{
                {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
                {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
        };

        if (judge) {
            judgeNum = 1;
        } else {
            judgeNum = 0;
        }

        if (month > 0 || month <= 12) {
            int dayOK = date[judgeNum][month - 1];
            if (day >= 0 && day <= dayOK) {
                System.out.println("输入格式正确!");
                return true;
            } else {
                System.out.println("日期格式有误!");
                return false;
            }
        } else {
            System.out.println("月份格式有误!");
            return false;
        }
    }
}
