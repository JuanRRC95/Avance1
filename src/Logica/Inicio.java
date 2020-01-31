/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Rodriguez
 */
public class Inicio {

    Logica datos = new Logica();

    public Inicio() {
        boolean bandera = true;
        cargarDatos();
        while (bandera) {
            try{
            String opc = JOptionPane.showInputDialog("1. ingresar bus \n"
                    + "2. imprimir datos \n"
                    + "3. Buscar registros \n"
                    + "4. Ordenar por tarifa");
            int op = Integer.parseInt(opc);
            switch (op) {
                case 1: captura();
                        break;
                case 2:imprimir();
                       break;
                case 3:buscar();
                       break;
                case 4:ordenar();
                       break;
                case 0:bandera=false;
                       break;
                default:JOptionPane.showInputDialog("No es una opcion valida");
            }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Error ingresando los datos", "Error", 0);
            }
        }
    }

    public void cargarDatos(){
        datos.cargarDatos();
    }
    
    public void captura() {
        datos.insertarBus();
        //datos.cargarDatos();
    }

    public void imprimir() {
        datos.imprimir();
    }

    public void buscar() {
        String opc = JOptionPane.showInputDialog("Ingrese la cedula que desea consultar");
        double cedula = Double.parseDouble(opc);
        datos.buscarElmento(cedula);
    }

    public void ordenar() {
        //datos.ordenamientoAscendenteTarifa();
        datos.ordenamientoDescendenteTarifa();
        datos.imprimir();
    }
}
