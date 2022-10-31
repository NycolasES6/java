package Calendars;
import java.util.Calendar;

public class Agora {
    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance();

        System.out.println("Agora é " +agora.getTime());

        agora.add(Calendar.DATE,-15);
        System.out.println("15 dias atrás era " + agora.getTime());

        agora.add(Calendar.MONTH, 4);
        System.out.println("Daqui 4 mêses será " + agora.getTime());

        agora.add(Calendar.YEAR, 2);
        System.out.println("Daqui 2 anos vai ser " + agora.getTime());
    }
}
