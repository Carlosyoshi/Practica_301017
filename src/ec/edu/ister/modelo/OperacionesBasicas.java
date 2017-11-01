/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ister.modelo;
import static ec.edu.ister.vista.Aplicacion.menu;
import javax.swing.JOptionPane;

/**
 * 
 * @author 
 * YoshiCarlos
 */

public class OperacionesBasicas {
     public static void sumaDosNumeros() {
        int a=6;
        int b=4;
        JOptionPane.showMessageDialog(null, "La suma es: "+(a+b));
        menu();
    }
    public static void sumaDosNumerosConParametros(int x, int y) {
        JOptionPane.showMessageDialog(null, "La suma es: "+(x+y));
        menu();
    }
    public static int sumaDevuelve(int x, int y) {
        JOptionPane.showMessageDialog(null, "La suma es: "+(x+y));
        menu();
        return x+y;
        
    }

}
