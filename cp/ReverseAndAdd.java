import java.math.BigInteger;

public class ReverseAndAdd {
    public static BigInteger reverseAndAdd(BigInteger num) {
        BigInteger reverse = new BigInteger(new StringBuilder(num.toString()).reverse().toString());
        return num.add(reverse);
    }

    public static boolean isPalindrome(BigInteger num) {
        String str = num.toString();
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

    public static void main(String[] args) {
        BigInteger num = new BigInteger("195");
        int iterations = 0;

        while (!isPalindrome(num)) {
            num = reverseAndAdd(num);
            iterations++;
        }

        System.out.println("Palindrome Found: " + num);
        System.out.println("Number of Iterations: " + iterations);
    }
}
