package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class NameProcessor {
	
	public List<String> processName(List<String> names){
		List<String> upperCaseNames = names.stream().map(String::toUpperCase).collect(Collectors.toList());
		Set<String> uniqueNames = new HashSet<>(upperCaseNames);
		List<String> sortedUniqueNames = new ArrayList<>(uniqueNames);
        sortedUniqueNames.sort(String::compareTo);

        return sortedUniqueNames;

	}
	public String findLongestName(List<String> names) {
        String longestName = "";
        for (String name : names) {
            if (name.length() > longestName.length()) {
                longestName = name;
            }
        }
        return longestName;
    }

	public static void main(String[] args) {
		 List<String> inputNames = List.of("Rohit", "Anita", "Suresh", "Rohit", "Priya", "anita", "Kumar");
	  
	        NameCollection nameCollection = new NameCollection(inputNames);
	        List<String> names = nameCollection.getNames();

	        NameProcessor nameProcessor = new NameProcessor();
	 
	        List<String> processedNames = nameProcessor.processName(names);
	        String longestName = nameProcessor.findLongestName(processedNames);
	    
	        System.out.println("Processed Names: " + processedNames);
	        System.out.println("Longest Name: " + longestName);

		System.out.println("Adding for git demo in mewOne");
		System.out.println("Adding one more line");

	}

}
