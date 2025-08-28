public class EuclidAlgorithm {
    public static void main(String[] args) {
        int a = 48;
        int b = 36;

        int gcd = findGCD(a, b);
        System.out.println("GCD: " + gcd);
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
