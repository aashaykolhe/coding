import java.util.*;

public class KthDistinctString {
    public static void main(String[] args) {
        String[] array = {"apple", "banana", "orange", "apple", "kiwi", "orange"};
        int k = 2;

        String kthDistinct = findKthDistinct(array, k);
        System.out.println("Kth distinct string: " + kthDistinct);
    }

    public static String findKthDistinct(String[] strings, int k) {
        HashSet<String> distinctSet = new HashSet<>();
        ArrayList<String> distinctList = new ArrayList<>();

        for (String str : strings) {
            if (!distinctSet.contains(str)) {
                distinctSet.add(str);
                distinctList.add(str);
            }
        }

        if (k <= distinctList.size()) {
            return distinctList.get(k - 1);
        } else {
            return "Kth distinct string not found";
        }
    }
}
