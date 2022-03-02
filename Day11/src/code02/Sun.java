package code02;

public class Sun extends Start implements Universe {

    @Override
    public void shine() {
        System.out.println("Sun : 光照八分钟，到达地球");
    }

    @Override
    public void doAnything() {
        System.out.println("Sun : 太阳吸引着9大行星旋转");
    }
}
