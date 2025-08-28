import java.util.ArrayList;
import java.util.List;

public class RestoreIPAddresses {
    public static List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        restoreIpAddressesHelper(s, 0, "", result);
        return result;
    }

    private static void restoreIpAddressesHelper(String s, int segments, String current, List<String> result) {
        if (segments == 4 && s.isEmpty()) {
            result.add(current);
            return;
        }

        for (int i = 1; i <= 3 && i <= s.length(); i++) {
            String segment = s.substring(0, i);
            if (isValidSegment(segment)) {
                String newCurrent = current + (segments == 0 ? "" : ".") + segment;
                restoreIpAddressesHelper(s.substring(i), segments + 1, newCurrent, result);
            }
        }
    }

    private static boolean isValidSegment(String segment) {
        if (segment.charAt(0) == '0' && segment.length() > 1) {
            return false;
        }
        int value = Integer.parseInt(segment);
        return value >= 0 && value <= 255;
    }

    public static void main(String[] args) {
        String s = "25525511135";
        List<String> restoredIPs = restoreIpAddresses(s);

        for (String ip : restoredIPs) {
            System.out.println(ip);
        }
    }
}