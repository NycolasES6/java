package JavaDate;

import java.time.Instant;
import java.util.Date;

public class TimeInstant {
    public static void main(String[] args) {
        Date inicio = new Date(1513124807691L);
        System.out.println(inicio);

        Instant instant = inicio.toInstant();
        System.out.println(instant);
    }
}
