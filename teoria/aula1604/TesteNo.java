public class TesteNo {
    public static void main(String args[]) {
        Pessoa p1 = new Pessoa("Ana", 2001);
        No<Pessoa> no1 = new No<>(p1);
        No<String> no2 = new No<>("Minha string");

        System.out.println(no1);
        System.out.println(no2);
    }
}