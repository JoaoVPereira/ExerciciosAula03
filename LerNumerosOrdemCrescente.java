import javax.swing.*;
public class LerNumerosOrdemCrescente {
    public static void main (String[] args){
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
        int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro numero"));

        if (numero1 > numero2 && numero1 > numero3){
            if (numero2 < numero3){
                JOptionPane.showMessageDialog(null,numero2 +" "+ numero3 +" "+ numero1);
                System.out.println(numero2 +" "+ numero3 +" "+ numero1);
            }else {
                JOptionPane.showMessageDialog(null,numero3 +" "+ numero2 +" "+ numero1);
                System.out.println(numero3 +" "+ numero2 +" "+ numero1);
            }  
        }
            


        if (numero2 > numero1 && numero2 > numero3){
            if (numero1 < numero3){
                JOptionPane.showMessageDialog(null,numero1 +" "+ numero3 +" "+ numero2);
                System.out.println(numero1 +" "+ numero3 +" "+ numero2);
        }else {
                JOptionPane.showMessageDialog(null,numero3 +" "+ numero1 +" "+ numero2);
                System.out.println(numero3 +" "+ numero1 +" "+ numero2);
        }
        }
        
        


         if (numero3 > numero1 && numero3 > numero2){
                if (numero1 < numero2){
                     JOptionPane.showMessageDialog(null,numero1 +" "+ numero2 +" "+ numero3);
                     System.out.println(numero1 +" "+ numero2 +" "+ numero2);
                 }else {
                     JOptionPane.showMessageDialog(null,numero2 +" "+ numero1 +" "+ numero3);
                    System.out.println(numero2 +" "+ numero1 +" "+ numero3);    
                }       
            }
            
        
    }
}  
        
            
            
    
