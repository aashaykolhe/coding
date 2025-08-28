import java.util.*;

public class LightMoreLight {
    public static boolean isLightOn(int n) {
        int factors = getFactorsCount(n);
        return factors % 2 != 0;
    }

    private static int getFactorsCount(int n) {
        int count = 0;
        int sqrt = (int) Math.sqrt(n);
        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) {
                count += 2;
                if (i * i == n) {
                    count--;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 16; 
        boolean isOn = isLightOn(n);
        if (isOn) {
            System.out.println("The last light bulb is ON");
        } else {
            System.out.println("The last light bulb is OFF");
        }
    }
}
