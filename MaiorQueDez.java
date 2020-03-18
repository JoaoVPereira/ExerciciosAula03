package ExerciciosAula3;

import javax.swing.*;

public class MaiorQueDez {
    public static void main (String...args){
        int numero1, numero2;
    numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 1"));
    numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 2"));
    
    if (numero1 + numero2 > 10){
        JOptionPane.showMessageDialog(null, numero1 + numero2);
    } else {
        JOptionPane.showMessageDialog(null,"Menor que dez");
    }
    }

}
