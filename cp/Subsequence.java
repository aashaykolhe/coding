public class Subsequence {
    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "ace";

        boolean isSubsequence = isSubsequence(str1, str2);
        System.out.println("Is Subsequence: " + isSubsequence);
    }

    public static boolean isSubsequence(String str1, String str2) {
        int i = 0; 
        int j = 0; 

        while (i < str1.length() && j < str2.length()) {
            if (str1.charAt(i) == str2.charAt(j)) {
                j++; 
            }
            i++; 
        }

        return j == str2.length();
    }
}
