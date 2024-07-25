package day2;

public class Program3 {
	int x;
	int y;
	public Program3(int x, int y) {
		this.x=x;
		this.y=y;
		System.out.println(x+" "+y);
	}
	public void method() {
		System.out.println(this.x+" "+this.y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program3 pg= new Program3(10,30);
		pg.method();

	}

}
