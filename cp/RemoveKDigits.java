import java.util.Stack;

public class RemoveKDigits {
    public static String removeKdigits(String num, int k) {
        int digitsToRemove = k;
        Stack<Character> stack = new Stack<>();
        
        for (char digit : num.toCharArray()) {
            while (!stack.isEmpty() && digitsToRemove > 0 && stack.peek() > digit) {
                stack.pop();
                digitsToRemove--;
            }
            
            stack.push(digit);
        }
        
        while (digitsToRemove > 0 && !stack.isEmpty()) {
            stack.pop();
            digitsToRemove--;
        }
        
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop());
        }
        
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        
        return sb.toString();
    }
    
    public static void main(String[] args) {
        String num = "1432219";
        int k = 3;
        String result = removeKdigits(num, k);
        System.out.println("Result: " + result);
    }
}
