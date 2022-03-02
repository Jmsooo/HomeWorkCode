package code01;

public interface InterfaceA {

    public abstract void showA();

    public default void showB(){
        System.out.println("BBB");
    }

}
