package practice;

import java.util.Scanner;


class InvalidGuessException extends Exception {
 public InvalidGuessException(String message) {
     super(message);
 }
}


public class WordMaster {
 
 
 public int AcceptGuess(String secretWord, String codedWord) throws InvalidGuessException {
     try {
         decodeCodedWord(secretWord, codedWord); 
         int magicalPoints = secretWord.length() * 10;
         System.out.printf("Hurray! You've guessed right, You are earning %d magical points!\n", magicalPoints);
         return secretWord.length();
     } catch (InvalidGuessException e) {
        
         System.out.println(e.getMessage());
         throw e; 
     }
 }

 
 private void decodeCodedWord(String secretWord, String codedWord) throws InvalidGuessException {
     if (codedWord.length() != 4) {
         throw new InvalidGuessException("Incorrect guess. Try again");
     }

     char firstChar = secretWord.charAt(0);
     char lastChar = secretWord.charAt(secretWord.length() - 1);

     int firstCharReversePos = 'z' - Character.toLowerCase(firstChar) + 1; 
     int firstCharPos = Character.toLowerCase(firstChar) - 'a' + 1; 
     int totalChars = secretWord.replaceAll(" ", "").length(); 

     if (codedWord.charAt(0) != Character.toLowerCase(firstCharReversePos + '0') ||
         !codedWord.substring(1, 3).equals(String.format("%02d", firstCharPos)) ||
         codedWord.charAt(3) != lastChar) {
         throw new InvalidGuessException("Incorrect guess. Try again");
     }
 }


 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter the secret word:");
     String secretWord = sc.nextLine();

     System.out.println("Enter the coded word for the secret word:");
     String codedWord = sc.nextLine();

     WordMaster wordMaster = new WordMaster();

     try {
         int length = wordMaster.AcceptGuess(secretWord, codedWord);
     } catch (InvalidGuessException e) {
         System.out.println(e.getMessage());
     }
 }
}
