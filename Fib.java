package fibonacci;

public class Fib {
	static int n1=0, n2=1, n3;
	static void fib(int count) {
		if(count>0) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			fib(count-1);
		}
	}
	public static void main(String[] args) {
		int count = 10;
		System.out.print(n1+" "+n2);
		fib(count-2);
//		System.out.println(n3);
	}

}

//public class Fib{
//	public static void main(String[] args) {
//		int n1=0, n2=1, n3;
//		int count = 10;
//		System.out.print(n1+" "+n2);
//		while(count>0) {
//			n3=n1+n2;
//			n1=n2;
//			n2=n3;
//			System.out.print(" "+n3);
//			count--;
//		}
//	}
//}