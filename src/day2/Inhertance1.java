package day2;

class Parent{
	public void methodParent() {
		System.out.println("This parent method");
	}
}

public class Inhertance1  extends Parent{
	public void methodChild() {
		System.out.println("This is a child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p=new Inhertance1();   // one class inheritance another
//		Parent p1=new Parent();
		p.methodParent();
//		p.methodChild();// child can inherit but parent cannot inherit the child
		
		

	}

}
