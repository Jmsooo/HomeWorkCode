package code04;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public boolean isLeapYear(code02.MyDate date){
        int year = date.getYear();
        boolean judge = (year % 4 == 0) || (year % 400 == 0 && year % 100 != 0);
        return judge;
    }

    public void set(int y,int m,int d){
        this.year = y;
        this.month = m;
        this.day = d;
    }

    //public void puls(   )

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
