public class CountGoodNumbers {
    public static long countGoodNumbers(long n) {
        long evenCount = (n + 1) / 2;
        long oddCount = n / 2;
        long mod = 1000000007; 
        long evenPower = modularExponentiation(evenCount, 5, mod);
        long oddPower = modularExponentiation(oddCount, 4, mod);
        long count = (evenPower * oddPower) % mod;
        return count;
    }
    
    public static long modularExponentiation(long base, long exponent, long mod) {
        long result = 1;
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exponent /= 2;
        }
        return result;
    }
    
    public static void main(String[] args) {
        long n = 10; 
        long goodNumbersCount = countGoodNumbers(n);
        System.out.println("Number of Good Numbers: " + goodNumbersCount);
    }
}
