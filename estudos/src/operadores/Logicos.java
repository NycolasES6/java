package operadores;

public class Logicos {
    public static void main(String[] args) {
        final var num = 2;
        final var letra = "a";

        if (num < 5 && letra.equals("a"))
            System.out.println("AAtendeu a condião");

        if (num <5 || letra.equals("a"))
            System.out.println("Atendeu a outra condição");
    }
}
