import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class KDiffPairs {
    public static int findPairs(int[] nums, int k) {
        int count = 0;
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        for (int num : frequencyMap.keySet()) {
            if (k > 0 && frequencyMap.containsKey(num + k)) {
                count++;
            } else if (k == 0 && frequencyMap.get(num) > 1) {
                count++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 4, 1, 5};
        int k = 2;
        int pairCount = findPairs(nums, k);
        System.out.println("Number of K-diff Pairs: " + pairCount);
    }
}
