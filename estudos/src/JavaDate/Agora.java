package JavaDate;
import java.util.Date;

public class Agora {
    public static void main(String[] args){
        Date agora = new Date();
        //System.out.println(agora);

        long millis = System.currentTimeMillis();
        System.out.println(millis);
        agora = new Date(millis);
        System.out.println(agora);

    }
}