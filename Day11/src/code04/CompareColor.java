package code04;

public class CompareColor implements CompareAble {
    @Override
    public void compare(Apple a1, Apple a2) {
        System.out.println("挑红的: ");
        if("红色".equals(a1.getColor())){
            System.out.println(a1);
        }
        if("红色".equals(a2.getColor())){
            System.out.println(a2);
        }
    }
}
