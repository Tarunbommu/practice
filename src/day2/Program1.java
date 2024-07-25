package day2;
import java.util.*; 
public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the document text:");
		String ch=sc.nextLine();
		
		System.out.println("Enter the keyword to highlight:");
		String s=sc.nextLine();
		
		if(ch.length()==0 || s.length()==0) {
			System.out.println("invalid input");
			
		}else {
			String[] a=ch.split(" ");
			String res="";
			for(int i=0; i<a.length;i++) {
				if(a[i].equalsIgnoreCase(s)) {
					a[i]=a[i].toUpperCase();
					res=res+a[i]+" ";										
				}else {
					res=res+a[i]+" ";
				}
			}
			System.out.println(res.trim());
		}

	}

}
