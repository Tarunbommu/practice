package day3;

interface Inter{
	int f=20;
	void methodInter();
	
	default void methodDef() {
		System.out.println("werreter");
	}
	static void methodStatic() {
		System.out.println("wewe");
	}
}
abstract class Abs{
	public void method1() {
		System.out.println("Concrete Method");
	}
  abstract int method();
}

public class Interface1 extends Abs implements Inter {
	
	public int method() {
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

	@Override
	public void methodInter() {
		// TODO Auto-generated method stub
		
	}

}
