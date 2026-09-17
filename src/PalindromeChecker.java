import java.util.Scanner;

public class PalindromeChecker {
    //Main Method
    public static void main(String[] args) {
        //Declare the scanner
        Scanner input = new Scanner(System.in);

        //Welcome user and prompt for input
        System.out.println("Welcome to the Palindrome Checker");
        System.out.print("Enter a word or phrase: ");
        String originalText = input.nextLine();

        //Clean and reverse the text
        String cleanedText = cleanText(originalText);
        String reversedText = reverseText(cleanedText);


        //Check the cleaned output
        System.out.println();
        System.out.println("Original text: " + originalText);
        System.out.println("Cleaned text: " + cleanedText);
        System.out.println("Reversed text:  " + reversedText);
        System.out.println();


        //Report if it is a palindrome or not
        System.out.println("Checking to see if you entered a palindrome...");
        if(cleanedText.equals(reversedText)){
            System.out.println("You made a palindrome.");
        } else {
            System.out.println("You did not make a palindrome.");
        }


        //Close the scanner
        input.close();
    }

    //Method to clean the text
    public static String cleanText(String text) {
        String lowerText = text.toLowerCase();
        StringBuilder cleaned = new StringBuilder();

        for (int i = 0; i < lowerText.length(); i++) {
            char currentChar = lowerText.charAt(i);

            if (Character.isLetterOrDigit(currentChar)){
                cleaned.append(currentChar);
            }

        }

        return cleaned.toString();
    }

    //Method to reverse the text
    public static String reverseText(String text) {
        StringBuilder reversed = new StringBuilder(text);
        reversed.reverse();
        return reversed.toString();
    }

}
