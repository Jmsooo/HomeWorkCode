package code03;

import code02.MyDate;

public class Citzen {
    private MyDate date;
    private String IDCard;

    public MyDate getDate() {
        return date;
    }

    public void setDate(MyDate date) {
        this.date = date;
    }

    public String getIDCard() {
        return IDCard;
    }

    public void setIDCard(String IDCard) {
        this.IDCard = IDCard;
    }

    @Override
    public String toString() {
        return "Citzen{" +
                "date=" + date +
                ", IDCard='" + IDCard + '\'' +
                '}';
    }
}
