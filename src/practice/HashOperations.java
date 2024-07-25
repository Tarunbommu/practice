package practice;

import java.util.HashSet;
import java.util.Set;

class HashOperations {
	  
    public Set<Integer> subtract(Set<Integer> a, Set<Integer> b) {
        Set<Integer> result = new HashSet<>(a); 
        result.removeAll(b); 
        return result;
    }
 
    
    public Set<Integer> union(Set<Integer> a, Set<Integer> b) {
        Set<Integer> result = new HashSet<>(a);
        result.addAll(b); 
        return result;
    }
 
   
    public Set<Integer> intersect(Set<Integer> a, Set<Integer> b) {
        Set<Integer> result = new HashSet<>(a); 
        result.retainAll(b); 
        return result;
    }
 
    public static void main(String[] args) {
        HashOperations source = new HashOperations();
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();
 
        
        setA.add(1);
        setA.add(2);
        setA.add(3);
 
        
        setB.add(3);
        setB.add(4);
        setB.add(5);
 
        
        Set<Integer> subtractResult = source.subtract(setA, setB);
        System.out.println("Subtract: " + subtractResult); 
 
        
        Set<Integer> unionResult = source.union(setA, setB);
        System.out.println("Union: " + unionResult); 
 
        
        Set<Integer> intersectResult = source.intersect(setA, setB);
        System.out.println("Intersect: " + intersectResult); 
    }
}