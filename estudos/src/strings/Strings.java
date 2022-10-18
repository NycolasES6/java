package strings;

public class Strings {
    public static void main(String[] args){
        String nome = "Andre";
        String sobreNome = "Santos";
        final String nomeCompleto = nome +" "+sobreNome;

//        System.out.println("Nome do cliente : "+ nome);
//        System.out.println("Nome completo do cliente : "+nomeCompleto);

        String string = "Minha string";
//        System.out.println(string);

        System.out.println("Char na posição :" + string.charAt(7));
        System.out.println("Quantidade :" + string.length());
        System.out.println("Sem trim :" + string);
        System.out.println("Com trim :"+ string.trim());
        System.out.println("Lower :" + string.toLowerCase());
        System.out.println("Upper :" + string.toUpperCase());
        System.out.println("Contém M :" + string.contains("M"));
        System.out.println("Contém X :" + string.contains("X"));
        System.out.println("Replace :" + string.replace("n", "#"));
        System.out.println("Equals :" + string.equals("Minha string"));
        System.out.println("Equals :" + string.equalsIgnoreCase("MInhA StrInG"));
        System.out.println("Substring(1,6) :" + string.substring(1,5));
    }
}
