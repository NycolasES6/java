package conversaoPrimitivos;

import javax.swing.JOptionPane;

public class NumeroString {
    public static void main(String[] args) {
        String res = JOptionPane.showInputDialog("qual e a nota 1 ?");

        Integer n1 = 10000;
        String s1 = n1.toString();
        System.out.println(s1.length());

        int n2 = 100;
        System.out.println(Integer.toString(n2));
    }
}
