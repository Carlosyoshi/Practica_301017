/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ister.vista;

import static ec.edu.ister.modelo.ControlFlujo.ifAnidado;
import ec.edu.ister.modelo.OperacionesBasicas;
import static ec.edu.ister.modelo.OperacionesBasicas.sumaDosNumeros;
import javax.swing.JOptionPane;

/**
 * 
 * @author 
 * YoshiCarlos
 */

public class Aplicacion {
     static int n=0;
    static int m=0;
    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
        int op=Integer.parseInt(JOptionPane.showInputDialog(null, "ProgramacionVisual II\n"+
                "Elija una opcion:\n"+
                "1) Suma de dos numeros\n"+
                "2) Suma con return\n"+
                "3) Suma de dos numeros con parametros\n"+
                "4) IfAnidado\n"+
                "5) Salir."));
        do{
           switch(op){
               case 1:
                   sumaDosNumeros();
                   break;
               case 2:
                   cargarNumeros();
                   OperacionesBasicas.sumaDevuelve(n, m);
                   break;
               case 3:
                   cargarNumeros();
                   OperacionesBasicas.sumaDosNumerosConParametros(n, m);
                   break;
               case 4:
                   ifAnidado();
                   break;
               case 5:
                   System.exit(5);
                   break;
                   
               default: JOptionPane.showMessageDialog(null, "No existe");
                   menu();
                   break;
           } 
        }while(op!=5);
    }
    public static void cargarNumeros() {
        n=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese valor"));
        m=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese valor"));
    }

}
