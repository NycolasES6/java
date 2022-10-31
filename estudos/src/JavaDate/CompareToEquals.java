package JavaDate;

import java.util.Date;

public class CompareToEquals {
    public static void main(String[] args) {
        Date before = new Date(1513124807691L);
        //Tue Dec 12 22:26:47 BRST 2017

        Date after = new Date(1713124807691L);
        Date newAfter = new Date(1713124807691L);
        //Sun Apr 14 17:00:07 BRT 2024

        System.out.println(after.compareTo(newAfter));
        System.out.println(after.compareTo(before));
        System.out.println(before.compareTo(after));
        System.out.println(after.equals(newAfter));
    }
}