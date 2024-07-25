package day2;

class Father{
	public void money() {
		System.out.println("200000");
	}
}

class Mother extends Father{
	public void thrashing() {
		System.out.println("With chappal");
	}
}

public class MultiLevel extends Mother{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiLevel l=new MultiLevel();
		l.money();
		Mother m=new Mother();
		m.thrashing();
		
		Father f=new Father();
		f.money();

	}

}
