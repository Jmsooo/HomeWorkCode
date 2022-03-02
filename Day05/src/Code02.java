public class Code02 {
    public static void main(String[] args) {
        String[] hua = new String[]{"黑桃", "红桃", "梅花", "方片"};
        String[] dian = new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "10", "J", "Q", "K"};

        for (int i = 0; i < hua.length; i++) {
            Print(i, hua, dian);
            System.out.println();
        }


    }

    public static void Print(int i, String[] hua, String[] dian) {
        for (int i1 = 0; i1 < dian.length; i1++) {
            System.out.print(hua[i] + dian[i1] + "\t");
        }
    }
}
