package code03;

public class Test03 {
    public static void main(String[] args) {
        Father f = new Father();
        Child c = new Child();
    }
}
class Father {
    public Father(){
        System.out.println("father create");
    }
}
class Child extends Father{
    public Child(){
        System.out.println("child create");
    }
}