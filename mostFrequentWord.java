import java.util.Arrays;

public class mostFrequentWord {

    public static void main(String[] args) {
        String paragraph = "The aa AA quick brown AA fox aa jumps over the AA  lazyaa  dog. The quick aa brown fox aa AAjumps over the lazy dog. The quick brown fox jumps over the lazy dog.";
        paragraph = paragraph.toLowerCase();

        System.out.println("brutForcemethod ");
        brutForcemethod(paragraph);
        System.out.println();
        System.out.println("sortMethod ");
        sortMethod(paragraph);
        
    }

    private static void brutForcemethod(String paragraph)
    {
        String[] words = paragraph.split(" ");
        String mostFrequent = "";
        int maxCount = 0;

        for (String word : words) {
            word = word.toLowerCase();
        }

        for (int i = 0; i < words.length; i++) {
            int count = 0;
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                }
            }
            if (count > maxCount) {
                mostFrequent = words[i];
                maxCount = count;
            }
        }

        System.out.println("Most frequent word: " + mostFrequent);
        System.out.println("Number of occurrences: " + maxCount);
    }

    private static void sortMethod(String paragraph) {
        String[] words = paragraph.split("\\W+");
        Arrays.sort(words, String.CASE_INSENSITIVE_ORDER);

        String mostFrequent = "";
        int maxCount = 0;
        int count = 1;

        for (int i = 1; i < words.length; i++) {
            if (words[i].equalsIgnoreCase(words[i - 1])) {
                count++;
            } else {
                if (count > maxCount) {
                    mostFrequent = words[i - 1];
                    maxCount = count;
                }
                count = 1;
            }
        }

        if (count > maxCount) {
            mostFrequent = words[words.length - 1];
            maxCount = count;
        }

        System.out.println("Most frequent word: " + mostFrequent);
        System.out.println("Number of occurrences: " + maxCount);
    }
}