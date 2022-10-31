package JavaDate;

import java.util.Date;

public class AfterBefore {
    public static void main(String[] args) {
        Date before = new Date(1513124807691L);
        //Tue Dec 12 22:26:47 BRST 2017

        Date after = new Date(1713124807691L);
        //Sun Apr 14 17:00:07 BRT 2024

        boolean isAfter = after.after(before);
        System.out.println(isAfter);

        boolean isBefore = before.before(after);
        System.out.println(isBefore);
    }
}