public class CountPrefixes {
    public static int countPrefixes(String[] words, String prefix) {
        int count = 0;
        for (String word : words) {
            if (word.startsWith(prefix)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] words = {"apple", "application", "banana", "book", "cat", "car"};
        String prefix = "app";
        int prefixCount = countPrefixes(words, prefix);
        System.out.println("Number of Prefixes: " + prefixCount);
    }
}
