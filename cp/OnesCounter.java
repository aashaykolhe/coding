public class OnesCounter {
    public static void main(String[] args) {
        int number = 123456789;

        int count = countOnes(number);
        System.out.println("Number of ones: " + count);
    }

    public static int countOnes(int number) {
        int count = 0;

        while (number != 0) {
            count += number & 1;
            number >>= 1;
        }

        return count;
    }
}
