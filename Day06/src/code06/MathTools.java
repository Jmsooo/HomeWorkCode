package code06;

public class MathTools {

    /**
     * 求a+b
     *
     * @param a
     * @param b
     * @return
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * 求a-b
     *
     * @param a
     * @param b
     * @return
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    public int mutiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public int remainder(int a, int b) {
        return a % b;
    }

    public int max(int a, int b) {
        return a > b ? a : b;
    }

    public int min(int a, int b) {
        return a > b ? b : a;
    }

    public boolean equals(int a, int b) {
        return a == b;
    }

    public boolean isEven(int a) {
        return a % 2 == 0;
    }

    public boolean isPrimeNumber(int a) {
        if (a < 2) {
            return false;
        }
        for (int i = 0; i < a; i++) {
            if (a % i == 0) {
                if (a == i) {
                    return true;
                } else if (a != 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public int round(double d) {
        if ((d + 0.5) >= (int) (d + 1)) {
            return (int) (d + 1);
        }
        return (int) d;
    }

}
