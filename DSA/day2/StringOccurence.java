package day2;

import java.util.Scanner;

public class StringOccurence {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        String paragraph = "The classical waterfall model is the basic software development life cycle model. It is very simple but idealistic. Earlier this model was very popular but nowadays it is not used. However, it is very important because all the other software development life cycle models are based on the classical waterfall model.";
        System.out.println("Enter the element:");
		String c=sc.next();
		char d = c.charAt(0);
        int maxRepeatingCharacters = findMaxRepeatingCharacters(paragraph);
        System.out.println("Maximum number of repeating characters in a substring: " + maxRepeatingCharacters);

        long countB = paragraph.chars().filter(ch -> ch == d).count();
        System.out.println("Number of occurrences of "+d+" : " + countB);
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