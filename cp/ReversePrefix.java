public class ReversePrefix {
    public static void main(String[] args) {
        String word = "abcdefg";
        int k = 3;

        String reversedPrefix = reversePrefix(word, k);
        System.out.println("Reversed Prefix: " + reversedPrefix);
    }

    public static String reversePrefix(String word, int k) {
        char[] chars = word.toCharArray();

        int start = 0;
        int end = k - 1;

        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }

        return new String(chars);
    }
}
