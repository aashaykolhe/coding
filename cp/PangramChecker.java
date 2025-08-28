import java.util.HashSet;

public class PangramChecker {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";

        boolean isPangram = checkIfPangram(sentence);
        System.out.println("Is Pangram: " + isPangram);
    }

    public static boolean checkIfPangram(String sentence) {
        HashSet<Character> charSet = new HashSet<>();

        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                charSet.add(Character.toLowerCase(c));
            }
        }

        return charSet.size() == 26;
    }
}
