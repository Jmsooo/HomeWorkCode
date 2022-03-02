package code02;

public class Test02 {
    public static void main(String[] args) {
        MyDate date = new MyDate();
        date.setYear(1999);
        date.setMonth(10);
        date.setDay(10);

        System.out.println(date);

        System.out.println(date.toString());


    }
}
