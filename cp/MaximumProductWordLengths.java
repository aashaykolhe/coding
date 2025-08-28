public class MaximumProductWordLengths {
    public static int maxProduct(String[] words) {
        int n = words.length;
        int[] wordBits = new int[n];
        for (int i = 0; i < n; i++) {
            String word = words[i];
            for (char ch : word.toCharArray()) {
                wordBits[i] |= 1 << (ch - 'a');
            }
        }
        int maxProduct = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((wordBits[i] & wordBits[j]) == 0) {
                    int product = words[i].length() * words[j].length();
                    maxProduct = Math.max(maxProduct, product);
                }
            }
        }
        
        return maxProduct;
    }
    
    public static void main(String[] args) {
        String[] words = {"abcw", "baz", "foo", "bar", "xtfn", "abcdef"};
        int maxProduct = maxProduct(words);
        System.out.println("Maximum Product of Word Lengths: " + maxProduct);
    }
}
