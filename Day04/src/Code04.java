public class Code04 {
    public static void main(String[] args) {
        String[] xz = new String[]{"水瓶", "双鱼", "白羊", "金牛", "双子", "巨蟹", "狮子", "处女", "天枰", "天蝎", "射手", "摩羯"};
        for (int i = 1; i <= 12; i++) {
            System.out.println(i + ":" + xz[i - 1]);
        }
    }
}
