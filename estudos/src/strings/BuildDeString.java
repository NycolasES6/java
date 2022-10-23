package strings;

public class BuildDeString {
    public static void main(String[] args){
        var nome =  "André";
        final var builder = new StringBuilder(nome);

        System.out.println(builder.append("Luis"));

        final var reverse = builder.reverse();
        System.out.println(reverse);

        final var insert = builder.reverse().insert(0, "#").insert(builder.length(), "#");
        System.out.println(insert);
    }
}
