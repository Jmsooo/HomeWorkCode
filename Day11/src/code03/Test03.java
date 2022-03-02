package code03;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("选择: ");
        String role1 = input.next();

        FightAble fightAble1 = Player.select(role1);
        fightAble1.specialFight();
        fightAble1.commonFight();

        System.out.println("==========");

        System.out.println("选择: ");
        String role2 = input.next();

        FightAble fightAble2 = Player.select(role2);
        fightAble2.specialFight();
        fightAble2.commonFight();


    }
}
