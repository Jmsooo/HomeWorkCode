import java.util.Arrays;
import java.util.Scanner;

public class Code10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入本组学员的人数 : ");
        int num = scanner.nextInt();

        String[] names = new String[num];

        for (int i = 0; i < num; i++) {
            System.out.print("请输入第 " + (i+1) + " 个学员的学员的姓名: ");
            String name = scanner.next();
            names[i] = name;
        }

        System.out.println("Arrays.toString(names) = " + Arrays.toString(names));

        System.out.print("请输入一个学员姓名,判断是否存在: ");
        String name = scanner.next();
        int index = -1;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)){
                index = i;
            }
        }

        if (index != -1){
            System.out.println("存在该学员,数组下标为 : " + index);
        }else {
            System.out.println("不存在该学员!");
        }
    }
}
