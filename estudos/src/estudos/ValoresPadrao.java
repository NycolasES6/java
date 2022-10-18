package estudos;

public class ValoresPadrao {
    public static void main(String[] args)throws Exception{
        final Default d = new Default();
        System.out.println(d.getI());
        System.out.print(d.isActive());
    }
}

class Default{
    int i;
    boolean active;

    public int getI(){return i;}
    public boolean isActive(){return active;}
}