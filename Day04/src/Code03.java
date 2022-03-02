public class Code03 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int jj = 20;
        for (int ii = 0; ii < jj; ii += 2, jj--) {
            if (ii % 3 == 0) {
                a = ii;
                System.out.println(ii + "\tHello");
            } else {
                b = ii;
                System.out.println(ii + "\t\tWold");
            }
        }
        int sum = a * b;
        System.out.println("a*b的值:" + a + "*" + b + "=" + sum);
    }
}
