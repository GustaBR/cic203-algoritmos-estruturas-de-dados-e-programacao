public class RecursaoInfinita {
    public static void m() {
        System.out.println("m");
        m();
    }

    public static void main(String[] args) {
        m();
    }
}