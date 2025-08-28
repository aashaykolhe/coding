import java.util.Arrays;

public class GCDArray {
    public static void main(String[] args) {
        int[] array = {24, 36, 48, 60};

        int gcd = findGCD(array);
        System.out.println("GCD: " + gcd);
    }

    public static int findGCD(int[] numbers) {
        int gcd = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            gcd = findGCD(gcd, numbers[i]);
        }

        return gcd;
    }

    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGCD(b, a % b);
        }
    }
}
