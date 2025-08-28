import java.util.Arrays;

public class Hartals {
    public static int calculateLostWorkingDays(int totalDays, int[] hartalParameters, int totalParties) {
        boolean[] workingDays = new boolean[totalDays + 1];
        Arrays.fill(workingDays, true);
        for (int i = 0; i < totalParties; i++) {
            int hartalParameter = hartalParameters[i];
            for (int j = hartalParameter; j <= totalDays; j += hartalParameter) {
                int dayOfWeek = j % 7;
                if (dayOfWeek != 6 && dayOfWeek != 0) {
                    workingDays[j] = false; 
                }
            }
        }
        
        int lostWorkingDays = 0;
        for (int i = 1; i <= totalDays; i++) {
            if (!workingDays[i]) {
                lostWorkingDays++;
            }
        }
        return lostWorkingDays;
    }
    
    public static void main(String[] args) {
        int totalDays = 14; 
        int[] hartalParameters = {3, 4}; 
        int totalParties = 2; 
        int lostWorkingDays = calculateLostWorkingDays(totalDays, hartalParameters, totalParties);
        System.out.println("Lost Working Days: " + lostWorkingDays);
    }
}
