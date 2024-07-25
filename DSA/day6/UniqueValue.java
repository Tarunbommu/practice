package day6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class UniqueValue {

	public static void main(String[] args) {
		
		int[] arr = {1,2,2,3,3,3,4,3,1,2,5,5,4,6,7,3,8,8,9,3,2,1};
		
//		arr.forEach((n)->System.out.println(n));		
		
//		Arrays.stream(arr).distinct().forEach(a -> System.out.print(a + " "));
		Set<Integer> uniqueValues = new HashSet<>();
		 
  
        for (int n : arr) {
            uniqueValues.add(n);
            System.out.println(n);
        }
        System.out.println("Unique values");
        
        Consumer<Integer> Value = value->System.out.println(value + " ");
        
        uniqueValues.forEach(Value);

	}

}
