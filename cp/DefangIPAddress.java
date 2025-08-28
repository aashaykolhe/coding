public class DefangIPAddress {
    public static String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }

    public static void main(String[] args) {
        String ipAddress = "192.168.0.1";
        String defangedAddress = defangIPaddr(ipAddress);
        System.out.println("Defanged IP Address: " + defangedAddress);
    }
}
