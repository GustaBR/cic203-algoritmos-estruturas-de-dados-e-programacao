public class RecursaoInversaoString {
    public static String inverter(String s) {
        if (s.length() == 1) {
            return s;
        }
        return inverter(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        var s = "Hello, World!";
        
        System.out.println(inverter(s));
    }
}