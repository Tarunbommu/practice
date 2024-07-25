package day2;
import java.util.Scanner;

public class String1 {
    @SuppressWarnings("unused")
	public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String paragraph = sc.nextLine();
        int maxRepeatingCharacters = findMaxRepeatingCharacters(paragraph);
        // Calculate top 3 elements (characters) and their counts
        char[] uniqueChars = paragraph.replaceAll("[^a-zA-Z]", "").toCharArray();
        int[] charCounts = new int[26]; // Assuming only English alphabet characters
 
        for (char ch : uniqueChars) {
            charCounts[ch - 'a']++;
        }
 
        int[] topCounts = new int[3];
        char[] topChars = new char[3];
 
        for (int i = 0; i < charCounts.length; i++) {
            if (charCounts[i] > topCounts[0]) {
                topCounts[2] = topCounts[1];
                topCounts[1] = topCounts[0];
                topCounts[0] = charCounts[i];
                topChars[2] = topChars[1];
                topChars[1] = topChars[0];
                topChars[0] = (char) ('a' + i);
            } else if (charCounts[i] > topCounts[1]) {
                topCounts[2] = topCounts[1];
                topCounts[1] = charCounts[i];
                topChars[2] = topChars[1];
                topChars[1] = (char) ('a' + i);
            } else if (charCounts[i] > topCounts[2]) {
                topCounts[2] = charCounts[i];
                topChars[2] = (char) ('a' + i);
            }
        }
 
        System.out.println("Top 3 elements and their counts:");
        for (int i = 0; i < 3; i++) {
            System.out.println(topChars[i] + ": " + topCounts[i]);
        }
    }
 
    private static int findMaxRepeatingCharacters(String paragraph) {
        int maxCount = 0;
        int currentCount = 1;
 
        for (int i = 1; i < paragraph.length(); i++) {
            if (paragraph.charAt(i) == paragraph.charAt(i - 1)) {
                currentCount++;
            } else {
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                }
                currentCount = 1;
            }
        }
 
        if (currentCount > maxCount) {
            maxCount = currentCount;
        }
        return maxCount;
    }
}

/*package day2;
 
import java.util.*;
import java.util.stream.Collectors;
 
public class String1{
 
    public static void main(String[] args) {
        String paragraph = "Paragraphs are the building blocks of papers. "
        		+ "Many students define paragraphs in terms of length: a paragraph is a group of at least"
        		+ " five sentences, a paragraph is half a page long, etc. In reality, though, the unity "
        		+ "and coherence of ideas among sentences is what constitutes a paragraph.";
 
        
        Map<Character, Integer> charCountMap = countAllOccurrences(paragraph);
 
        
        List<Map.Entry<Character, Integer>> topThree = charCountMap.entrySet()
            .stream()
            .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())) 
            .limit(3)
            .collect(Collectors.toList());
 
       
        System.out.println("Top 3 most frequent characters:");
        for (Map.Entry<Character, Integer> entry : topThree) {
            System.out.println((entry.getKey() + ": " + entry.getValue()));
        }
    }
 
   
    public static Map<Character, Integer> countAllOccurrences(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) { 
                char cLower = Character.toLowerCase(c); 
                charCountMap.put(cLower, charCountMap.getOrDefault(cLower, 0) + 1);
            }
        }
        return charCountMap;
    }
}*/
