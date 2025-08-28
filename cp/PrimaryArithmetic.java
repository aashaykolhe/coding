public class PrimaryArithmetic {
    public static int calculateCarryOperations(int num1, int num2) {
        int carry = 0; 
        int carryOperations = 0; 
        while (num1 > 0 || num2 > 0) {
            int digit1 = num1 % 10;
            int digit2 = num2 % 10;
            int sum = digit1 + digit2 + carry;
            
            if (sum >= 10) {
                carry = 1; 
                carryOperations++; 
            } else {
                carry = 0; 
            }
            
            num1 /= 10;
            num2 /= 10;
        }
        return carryOperations;
    }
    
    public static void main(String[] args) {
        int num1 = 456; 
        int num2 = 128; 
        int carryOperations = calculateCarryOperations(num1, num2);
        System.out.println("Number of Carry Operations: " + carryOperations);
    }
}
