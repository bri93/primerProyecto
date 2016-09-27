/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cortezmenu;

import javax.swing.JOptionPane;

/**
 *
 * @author brian
 */
public class menu3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer numeroSw;
        String sNumeroSw;
        
        
        
        do {            
            sNumeroSw = JOptionPane.showInputDialog("MENÚ\n1)Saluda.\n2)Sale");
            numeroSw = Integer.parseInt(sNumeroSw);
             switch (numeroSw) {
                case 1:
                    System.out.println("Buenas Tardes");
                    break;
                case 2: 
                    System.out.println("Adios");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion Incorrecta");   
             } 
        } while (numeroSw == 1);
    }
    
}
