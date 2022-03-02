package code03;

public class Test {
    public static void main(String[] args) {
        System.out.println(getOut());
    }

    {
        System.out.println("a");
    }
    static{
        System.out.println("b");
    }
    Test(){
        System.out.println("c");
    }
    public static String getOut(){
        try{
            return "1";
        }catch(Exception e){
            return "2";
        }finally{
            return "3";
        }
    }
}
