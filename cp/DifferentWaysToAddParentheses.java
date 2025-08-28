import java.util.ArrayList;
import java.util.List;

public class DifferentWaysToAddParentheses {
    public static List<Integer> diffWaysToCompute(String input) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            
            if (c == '+' || c == '-' || c == '*') {
                String leftExpression = input.substring(0, i);
                String rightExpression = input.substring(i + 1);
                
                List<Integer> leftResults = diffWaysToCompute(leftExpression);
                List<Integer> rightResults = diffWaysToCompute(rightExpression);
                
                for (int left : leftResults) {
                    for (int right : rightResults) {
                        int computed = 0;
                        
                        if (c == '+') {
                            computed = left + right;
                        } else if (c == '-') {
                            computed = left - right;
                        } else if (c == '*') {
                            computed = left * right;
                        }
                        
                        result.add(computed);
                    }
                }
            }
        }
        
        if (result.isEmpty()) {
            result.add(Integer.parseInt(input));
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        String input = "2-1-1";
        List<Integer> results = diffWaysToCompute(input);
        System.out.println("Different Ways to Add Parentheses:");
        for (int result : results) {
            System.out.println(result);
        }
    }
}
