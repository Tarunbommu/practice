package day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class StringUpperAndLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> st= new ArrayList<>();
		
		st.add("A");
		st.add("c");
		st.add("e");
		st.add("D");
		
		st.forEach((n)-> System.out.println(n));
		System.out.println("_________________________");		
		st.replaceAll(str -> str.toLowerCase());
		  for(String str :st)
	        {
	        	System.out.println(str);
	        }
		  System.out.println("_________________________");
	       st.replaceAll(str -> str.toUpperCase());
	        for(String str : st)
	        {
	        	System.out.println(str);
	        }
	        System.out.println("_________________________");
	        
//	        Collections.sort(st,(s1,s2)->s1.compareTo(s2));
	        st.sort((s1,s2)-> s1.compareTo(s2));
	        st.forEach(System.out::println);
		
	}

}
