package code03;

import code02.MyDate;

public class Test03 {
    public static void main(String[] args) {
        MyDate date = new MyDate();
        date.setYear(1996);
        date.setMonth(10);
        date.setDay(10);

        Citzen citzen = new Citzen();
        citzen.setDate(date);
        citzen.setIDCard("134561544984816");

        System.out.println("citzen = " + citzen);
    }
}
