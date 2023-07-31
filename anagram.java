import java.util.Arrays;
import java.util.Scanner;

/**
 * anagram
 */
public class anagram {

    public static boolean isAnagram(String str1, String str2) 
    {
    // Remove whitespace and punctuation, and convert to lowercase
    str1 = str1.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    str2 = str2.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    
    // Sort the characters in each string
    char[] arr1 = str1.toCharArray();
    char[] arr2 = str2.toCharArray();
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    
    // Compare the sorted strings
    return Arrays.equals(arr1, arr2);
}

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    while (true) {
        System.out.println("Enter two strings: str1 str2");
        String anag = sc.nextLine();
        if (anag.equals("."))
        break ;
        String [] T = anag.split(" ");
        if (T.length != 2)
            break;

        System.out.println(isAnagram(T[0], T[1]));
    }
    sc.close();
    
}
}