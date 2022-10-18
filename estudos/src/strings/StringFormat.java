package strings;

public class StringFormat {
    public static void main(String[] args){
        var nome = "André";
        var sobrenome = "Gomes";
        final var nomeCompleto = nome+" "+sobrenome;

        System.out.println(nome);
        System.out.println("Nome do cliente : " + nome);
        System.out.println("Nome completo do cliente : " +sobrenome);

        final var mensagem = String.format("o cliente %s possui o sobre nome %s", nome, sobrenome);
        System.out.println(mensagem);

        System.out.printf("Numero %.2f ", 1.2375d);

    }
}