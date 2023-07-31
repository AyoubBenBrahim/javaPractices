import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * palindroms
 */
public class palindroms {

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // public static void findAllPalindromes(String str) {
    // List<String> palindromes = new ArrayList<>();
    // for (int i = 0; i < str.length(); i++) {
    // // Case 1: Center is a single character
    // expandPalindrome(str, i, i, palindromes);

    // // Case 2: Center is the space between two characters
    // if (i < str.length() - 1) {
    // expandPalindrome(str, i, i + 1, palindromes);
    // }
    // }

    // System.out.println("print all palindroms: ");
    // for (String pal : palindromes)
    // System.out.println(pal);
    // }

    public static void findAllPalindromes(String str) {
        Set<String> palindromes = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            // Case 1: Center is a single character
            expandPalindrome(str, i, i, palindromes);

            // Case 2: Center is the space between two characters
            if (i < str.length() - 1) {
                expandPalindrome(str, i, i + 1, palindromes);
            }
        }

        System.out.println("print all palindroms: ");
        for (String pal : palindromes)
            System.out.println(pal);
    }

    private static void expandPalindrome(String str, int left, int right, Set<String> palindromes) {
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            palindromes.add(str.substring(left, right + 1));
            left--;
            right++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String str = sc.nextLine();
            if (str.equals("."))
                break;
            System.out.println("str = " + str);
            System.out.println(isPalindrome(str));

            findAllPalindromes(str);
            System.out.println();

        }
        sc.close();

    }

}