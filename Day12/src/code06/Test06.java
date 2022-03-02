package code06;

public class Test06 {
    public static void main(String[] args) {
        Worker worker = new Worker();

        Apple a1 = new Apple(5,"青色");
        Apple a2 = new Apple(3,"红色");

        worker.pickApple(new CompareAble(){},a1,a2);
        worker.pickApple(new CompareAble() {
            @Override
            public void compare(Apple a1, Apple a2) {
                System.out.println("挑红的: ");
                if ("红色".equals(a1.getColor())){
                    System.out.println(a1);
                }
                if ("红色".equals(a2.getColor())){
                    System.out.println(a2);
                }
            }
        },a1,a2);
    }
}
