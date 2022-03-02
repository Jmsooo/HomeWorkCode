package code03;

public interface FightAble {

    public abstract void specialFight();

    public default void commonFight(){
        System.out.println("普通攻击");
    }

}
