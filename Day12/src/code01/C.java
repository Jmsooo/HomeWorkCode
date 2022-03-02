package code01;

public class C extends B implements A {
    public void printX(){
        System.out.println(A.x);
    }

    public static void main(String[] args) {
        new C().printX();
    }
}
