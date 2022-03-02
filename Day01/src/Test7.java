public class Test7{
	public static void main(String[] args){
		int a = 10;
		int b = 20;
		System.out.println(a);
		System.out.println(b);
		System.out.println("---------------");
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println(a);
		System.out.println(b);
	}
}