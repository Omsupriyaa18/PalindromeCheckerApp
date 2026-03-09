public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "madam";
        String reversed = "";

        // Reverse the string using loop
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Display original and reversed strings
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);

        // Check palindrome
        if (input.equals(reversed)) {
            System.out.println("The given string is a palindrome.");
        } else {
            System.out.println("The given string is not a palindrome.");
        }
    }
}