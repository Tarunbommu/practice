package day4;

import java.util.ArrayList;
import java.util.Vector;
class Emp{
	String name;
	String id;
	double sal;
	public Emp(String name, String id, double sal  ) {
		this.name=name;
		this.id=id;
		this.sal=sal;
	}
	@Override
	public String toString() {
		return name+"-"+id+"-"+sal;
	}
}

public class Program5 {
	

	public static void main(String[] args) {
		ArrayList<Emp> al=new ArrayList<Emp>();
		Vector<Emp> al1=new Vector<Emp>();
//		al.add(10);
//		al.add(12);
//		al.add(11);
//		al.add(1, 33);// Adding at specific index
		
//		int a=12;
//		Integer b=a;//(Auto boxing)
		
//		Integer c=39;
//		int e=b; //Auto unboxing
		
		
//		System.out.println(al);
//		System.out.println(al.indexOf(11));
//		System.out.println(al.contains(23));
//		System.out.println(al.contains(33));
//		al.remove(al.indexOf(33));
//		System.out.println(al);
		
//		ArrayList<Integer> al1=new ArrayList<>(al);
//		al1.addAll(al);
//		al1.set(1, 23);
		
//		System.out.println(al1);
		
		al.add(new Emp("Suresh","ID2323", 12334312));
		al.add(new Emp("Tarun","ID22322", 1233334312));
		al.add(new Emp("Loki","ID4523", 123234312));
		
		for(Emp e:al) {
			System.out.println(e);
		}
		



	}

}
