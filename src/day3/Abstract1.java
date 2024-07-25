package day3;

abstract class Abs{
	public void method1() {
		System.out.println("Concrete Method");
	}
  abstract int method();
}

public class Abstract1 extends Abs {
	public int method() {
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Abstract1 a=new Abstract1();
		a.method1();
		System.out.println(a.method());
	}

}