/*How would you check if String is palindrome or not? aba=> true
Abbc =>false

*/


public class task9 {
    public static void main(String[] args) {
        String input = "family";
        String reverse = new StringBuilder(input).reverse().toString();
        if (input.equals(reverse)) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }

        }

        }






