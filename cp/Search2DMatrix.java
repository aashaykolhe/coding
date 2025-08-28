public class Search2DMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length;
        int columns = matrix[0].length;

        int low = 0;
        int high = rows * columns - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int midElement = matrix[mid / columns][mid % columns];

            if (midElement == target) {
                return true;
            } else if (midElement < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 50}
        };
        int target = 3;

        boolean found = searchMatrix(matrix, target);
        System.out.println("Target found: " + found);
    }
}
