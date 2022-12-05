package Console;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Qual seu nome : ");
        String nome = entrada.nextLine();
        System.out.print("\n"+nome);
        entrada.close();
    }
}
