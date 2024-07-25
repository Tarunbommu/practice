package day1;

public class Program1 {
	
	//int c=30; //instance variable
	static int c=30; //(every time use static to create memory upto end of the class)
	
	 void sum() {
		 c++;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b=20; // local variable
		
		
		System.out.print("first object\n");
		Program1 pm = new Program1();
		pm.sum();
		
		System.out.println("Second object");
		Program1 pm1 = new Program1();
		pm1.sum();
		
		System.out.println(b);

	}

}
