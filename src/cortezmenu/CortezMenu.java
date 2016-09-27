 
package cortezmenu;

import javax.swing.JOptionPane;

 
/**
 *
 * @author brian
 */
public class CortezMenu {

    /**
     * 1 cargar vector A y mostrar por consola
     * 2 cargar vector B y mostrar por consola
     * 3sumar vectores a y b y colocar resultdo en C
     * 4cargar matriz cuadrada de 4*4
     * 5sumar elementos de la diagonal ppal en vector D
     * 6aplicar burbuja vector D
     * 7realizar busqueda binaria de elemento 40
     * 8 salir
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer numeroSW;
        String sNumeroSW = null;
        
        sNumeroSW = JOptionPane.showInputDialog("1)\n2)\n3)\n4)\n5)\n6)\n7)\n8)");
        numeroSW = Integer.parseInt(sNumeroSW);
        
        switch (numeroSW) {
            case 1:
                JOptionPane.showInputDialog("");
                Double l1;
                Double l2;
                Double l3;
                Double perimetro;
                
                String sL1;
                String sL2;
                String sL3;
                
                sL1 = JOptionPane.showInputDialog("Ingrese el lado 1");
                l1 = Double.parseDouble(sL1);
                sL2 = JOptionPane.showInputDialog("Ingrese el lado 2");
                l2 = Double.parseDouble(sL2);
                sL3 = JOptionPane.showInputDialog("Ingrese el lado 3");
                l3 = Double.parseDouble(sL3);
                
                perimetro = l1 + l2 +l3;
                
                JOptionPane.showMessageDialog(null, "El perimetro es: "+perimetro);
                break;
            case 2:
                System.out.println("Entraste a cargar vector B");
                break;
            case 3:
                System.out.println("Entraste a sumar vectores a y b");
                break;
            case 4:
                System.out.println("Entraste a cargar matriz cuadrada de 4*4");
                break;
            case 5:
                System.out.println("Entraste a sumar elementos de la diagonal principal en vector D");
                break;
            case 6:
                System.out.println("Entraste al metodo burbuja del vector D");
                break;
            case 7:
                System.out.println("Entraste a realizar la busqueda binaria del elemento 40");
                break;
            case 8:
                System.out.println("Salir");
                break;    
            default:
                throw new AssertionError();
        }
    }
    
}
/*

        switch (num) {
            case 1: System.out.println("Ingrese vector A");
            break;
            case 2: System.out.println("Ingrese vector B");
            break;
            case 3: System.out.println("Ingrese vector A");
            break;
            case 4: System.out.println("Ingrese vector A");
            break;
            case 5: System.out.println("Ingrese vector A");
            break;
        }
*/