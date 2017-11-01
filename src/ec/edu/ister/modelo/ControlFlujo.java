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

public class ControlFlujo {
    public static void ifAnidado() {
        int a=3;
        
        if(a>3){
            JOptionPane.showMessageDialog(null, a+"Es mayor");
        }else if(a<3){
            JOptionPane.showMessageDialog(null, a+"Es menor");
        }else {
            JOptionPane.showMessageDialog(null, "Es igual");
        }
        menu();
    }

}
