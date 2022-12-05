package conversaoPrimitivos;

import javax.swing.JOptionPane;

public class StringNumero {
    public static void main(String[] args) {
        String v1 = JOptionPane.showInputDialog("Digite o primeiro número ?");
        String v2 = JOptionPane.showInputDialog("Digite o segundo número ?");
        System.out.println(v1+v2);

        double d1 = Double.parseDouble(v1);
        double d2 = Double.parseDouble(v2);
        System.out.println(d1+d2);
    }
}
