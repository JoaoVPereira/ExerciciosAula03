import javax.swing.*;
public class MenorOuIgual20 {
    public static void main (String[]args){
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 1"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 2"));
        
        if (numero1 + numero2<= 20){
            JOptionPane.showMessageDialog(null, numero1 + numero2 - 5);
        } else{
            JOptionPane.showMessageDialog(null,"Valor maior que 20");
        }
    }
}