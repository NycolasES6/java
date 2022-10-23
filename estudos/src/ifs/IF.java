package ifs;

public class IF {
    public static void main(String[] args){
        final boolean cond = false;

        if (!cond){
            System.out.println("Falso");
        }else{
            System.out.println("Verdadeiro");
        };

        if (!cond)
            System.out.println("Única linha");

        final var ternario = !cond ? "É verdadeira" : "É falsa";
        System.out.println(ternario);
    };
}
