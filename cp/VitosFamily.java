import java.util.Arrays;

public class VitosFamily {
    public static int calculateOptimalLocation(int[] familyHouses) {
        Arrays.sort(familyHouses);
        int medianIndex = familyHouses.length / 2;
        int optimalLocation = familyHouses[medianIndex];
        
        int totalDistance = 0;
        for (int house : familyHouses) {
            totalDistance += Math.abs(house - optimalLocation);
        }
        return totalDistance;
    }

    public static void main(String[] args) {
        int[] familyHouses = {2, 4, 7, 9}; 
        int optimalLocation = calculateOptimalLocation(familyHouses);
        System.out.println("Optimal Location: House " + optimalLocation);
    }
}
