package day2;

public class MethodOverloading {
	public int add(int a, int b) {
		return a+b;
	}
	public int add(int a, int b, int c) {
		return a+b+c;
	}
//	public double add(double a, double b) {
//		return a+b;
//	}
	
	public static void main(int e) {
		System.out.println("Over loading main function");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading m=new MethodOverloading();
		System.out.println(m.add(19,34,56));
		System.out.println(m.add(10, 20));
		MethodOverloading.main(10);
		

	}

}
