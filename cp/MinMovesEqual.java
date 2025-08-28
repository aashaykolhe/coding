import java.util.Arrays;

public class MinMovesEqual {
    public static int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid = nums[nums.length / 2];
        int moves = 0;
        for (int num : nums) {
            moves += Math.abs(num - mid);
        }
        
        return moves;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int minMoves = minMoves2(nums);
        System.out.println("Minimum Moves: " + minMoves);
    }
}
