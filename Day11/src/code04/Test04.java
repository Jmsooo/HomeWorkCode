package code04;

public class Test04 {
    public static void main(String[] args) {
        Worker worker = new Worker();

        Apple a1 = new Apple(5, "青色");
        Apple a2 = new Apple(3, "红色");

        worker.pickApple(new CompareBig(),a1,a2);
        worker.pickApple(new CompareColor(),a1,a2);
    }
}
