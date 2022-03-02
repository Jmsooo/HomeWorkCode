package code04;

public class Test04 extends Father{
    private String name = "test";

    public static void main(String[] args) {
        Test04 test = new Test04();
        System.out.println(test.getName());
    }
}
class Father {
    private String name = "father";

    public String getName() {
        return name;
    }
}
