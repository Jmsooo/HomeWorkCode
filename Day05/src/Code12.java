import java.util.Random;

public class Code12 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            String str = randomVerificationCode();
            System.out.println("随机验证码: " + str);
        }
    }


    public static String randomVerificationCode() {
        Random random = new Random();

        char[] verification = new char[6];

        String ver = "";


        for (int i = 0; i < verification.length; i++) {
            int num = random.nextInt(3) + 1;
            switch (num) {
                case 1:
                    verification[i] = (char) (random.nextInt(10) + 48);
                    break;
                case 2:
                    verification[i] = (char) (random.nextInt(26) + 65);
                    break;
                case 3:
                    verification[i] = (char) (random.nextInt(26) + 97);
                    break;
            }
        }

        for (int i = 0; i < verification.length; i++) {
            ver += verification[i];
        }

        return ver;
    }
}
