package stacks.challengeOne;


/**
 * Using a stack, determine whether a string is a palindrome
 *
 * Strings may contain punctuation and spaces. They should be ignored. Case should be ignored
 *
 * Examples:
 *
 * - "I did, did I" is a palindrome
 * - "Racecar" is a palindrome
 * - "Hello" is not a palindrome
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Below are strings and a true/false value if they are palindromes:");
        System.out.println("");
        System.out.println("I did, did I - " + isPalindrome("I did, did I"));
        System.out.println("Racecar - " + isPalindrome("Racecar"));
        System.out.println("Hello - " + isPalindrome("Hello"));
    }

    public static boolean isPalindrome(String string) {
        String cleanedString = string.replaceAll("[^a-zA-Z]","");
        cleanedString = cleanedString.toLowerCase();

        LinkedListStack stack = new LinkedListStack();

        String[] stringComponents = cleanedString.split("");
        for (String s : stringComponents) {
            stack.push(s);
        }

        String reversedString = "";
        while (!stack.isEmpty()) {
            String s = stack.pop();
            reversedString += s;
        }

        return cleanedString.equals(reversedString);
    }
}
