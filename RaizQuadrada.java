import javax.swing.*;
public class RaizQuadrada{
    public static void main(String[]args){
        Double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero"));

        if (numero >=0){
            JOptionPane.showMessageDialog(null,Math.sqrt(numero));
        } else {
            JOptionPane.showMessageDialog(null,Math.pow(numero,2));
        }

    }
}
