package code04;

public interface CompareAble {
    public default void compare(Apple[] apples) {
        int index = 0;
        for (int i = 1; i < apples.length; i++) {
            if (apples[index].getSize() < apples[i].getSize()) {
                index = i;
            }
        }

        System.out.println(apples[index].getSize() + "-" + apples[index].getColor());
    }

    public default void compare(Apple a1,Apple a2){
        System.out.println("默认挑大的: ");
        if (a1.getSize()>a2.getSize()){
            System.out.println(a1);
        }else {
            System.out.println(a2);
        }
    }
}
