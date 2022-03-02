package code08;

public class DateCommonsTools {

    /**
     * 根据星期值，返回对应的英语单词
     *
     * @param week
     * @return
     */
    public String getWeekName(int week) {
        switch (week) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
        }
        return null;
    }

    /**
     * 根据月份值，返回对应的英语单词
     *
     * @param month
     * @return
     */
    public String getMonthName(int month) {
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February ";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "JUN";
            case 7:
                return "JUL";
            case 8:
                return "AUG";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
        }
        return null;
    }

    /**
     * 判断是否为闰年
     *
     * @param year
     * @return
     */
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

    /**
     * 返回某年某月的总天数
     *
     * @param year
     * @param month
     * @return
     */
    public int getTotalDaysOfMonth(int year, int month) {
        int[][] date = new int[][]{
                {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
                {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
        };

        int judgeNum = JudgeYear(year);
        return date[judgeNum][month - 1];
    }

    /**
     * 获取某年的总天数
     *
     * @param year
     * @return
     */
    public int getTotalDaysOfYear(int year) {
        int judgeNum = JudgeYear(year);
        if (judgeNum == 1) {
            return 366;
        } else {
            return 365;
        }
    }

    public boolean isLeapYear(int year) {
        int judgeNum = JudgeYear(year);
        if (judgeNum == 1) {
            return true;
        } else {
            return false;
        }
    }
}
