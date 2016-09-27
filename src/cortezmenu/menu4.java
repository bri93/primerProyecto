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
public class menu4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Integer numeroSw;
        String sNumeroSw;
        
        sNumeroSw = JOptionPane.showInputDialog("MENÚ\n1)Saluda.\n0)Sale");
        numeroSw = Integer.parseInt(sNumeroSw);
        
        while (numeroSw != 0){
            if (numeroSw == 1){
                JOptionPane.showMessageDialog(null, " Buen dia");
            } else {
                JOptionPane.showMessageDialog(null, "Chau");
            } 
        }
    }
    
}
