package code02;

public class Test02 {
    public static void main(String[] args) {
        Start start = new Start();
        start.shine();

        Universe universe = new Sun();
        universe.doAnything();

        Sun sun = (Sun)universe;
        sun.shine();
    }
}
