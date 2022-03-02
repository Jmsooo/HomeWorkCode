package code03;

public class Player {
    public static FightAble select(String string){
        if ("法力角色".equals(string)){
            return new Mage();
        }else if ("武力角色".equals(string)){
            return new Warrior();
        }
        return null;
    }
}
