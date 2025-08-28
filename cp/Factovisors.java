import java.util.Scanner;

public class Factovisors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();

            if (m == 0 || m == 1 || m <= n) {
                System.out.println(m + " divides " + n + "!");
            } else {
                boolean divides = isDivisible(n, m);
                if (divides) {
                    System.out.println(m + " divides " + n + "!");
                } else {
                    System.out.println(m + " does not divide " + n + "!");
                }
            }
        }

        scanner.close();
    }

    private static boolean isDivisible(int n, int m) {
        int primeFactor = 2;
        while (m > 1) {
            if (m % primeFactor == 0) {
                int count = 0;
                while (m % primeFactor == 0) {
                    m /= primeFactor;
                    count++;
                }

                if (!hasEnoughFactors(n, primeFactor, count)) {
                    return false;
                }
            }

            primeFactor++;
        }

        return true;
    }

    private static boolean hasEnoughFactors(int n, int factor, int count) {
        int temp = n;
        int factorCount = 0;

        while (temp >= factor) {
            factorCount += temp / factor;
            temp /= factor;
        }

        return factorCount >= count;
    }
}
