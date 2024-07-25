package day2;

public class Program2 {
		int x;
		int y;
	
	public int methodInt() {
		int a=10;
		int b=20;
		return a+b;
	}
	public int methodInt(int a, int b) {
		this.x=10;
		this.y=29;
		return a-b;
	}
	public Program2(){
		this(19,30); //constructor
	}
	public Program2(int a, int b) {
		this.x=a;
		this.y=b;
		System.out.println(x+" "+y);
	}
	public void method2() {
		System.out.println(this.methodInt(20,45));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program2 o=new Program2();
		System.out.println(o.methodInt(20,30));
		o.method2();

	}

}
