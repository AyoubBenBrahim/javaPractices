import java.util.Scanner;

/**
 * string_compression
 */
public class string_compression {

    public static String compressString(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        StringBuilder compressed = new StringBuilder();
        char currentChar = str.charAt(0);
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == currentChar)
                count++;
            else {
                compressed.append(currentChar).append(count);
                currentChar = str.charAt(i);
                count = 1;
            }
        }
        compressed.append(currentChar).append(count);
        return compressed.length() < str.length() ? compressed.toString() : str;
    }

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String str = sc.nextLine();
            if (str.equals("."))
                break;
            System.out.println("str = " + str);
            

            System.out.println(compressString(str));
            System.out.println();

        }
        sc.close();

    }
}