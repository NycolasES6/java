package Whiles;

public class While {
    public static void main(String[] args) {
        var x = 0;

        while (x <= 2) {
            System.out.println(x);
            x++;
        }

        var y = 1;
        do{
            System.out.println(y);
            y++;
        }while(y < 1);
    }

}
