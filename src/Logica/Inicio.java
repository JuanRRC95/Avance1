package Logica;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Inicio {

    Logica datos = new Logica();

    public Inicio() {
        cargarDatos();
        menuPrincipal();
    }

    public void cargarDatos() {
        datos.cargarDatos();
    }

    public void crearBus() {
        datos.insertarBus();
    }
    
    public void crearCarro(){
        datos.insertarCarro();
    }
    
    public void crearMoto(){
        datos.insertarMoto();
    }

    public void imprimirBus() {
        datos.imprimirBuses();
    }
    
    public void imprimirCarro() {
        datos.imprimirCarros();
    }
    
    public void imprimirMoto() {
        datos.imprimirMotos();
    }

    public void buscar() {
        String opc = JOptionPane.showInputDialog("Ingrese la cedula que desea consultar");
        double cedula = Double.parseDouble(opc);
        JOptionPane.showMessageDialog(null,datos.buscarConductor(cedula));
    }

    public void ordenarBuses() {
        datos.ordenamientoAscendenteTarifa();
        datos.imprimirBuses();
    }
    
    public void ordenarCarros(){
        datos.ordenamientoAscendenteCedula();
        datos.imprimirCarros();
    }
    
    public void ordenarMotos(){
        datos.ordenamientoDescendenteTarifa();
        datos.imprimirMotos();
        
    }

    public String impresionMenuPrincipal() {
        String opc = JOptionPane.showInputDialog("1. ingresar Vehiculo \n"
                + "2. imprimir datos \n"
                + "3. Buscar registros \n"
                + "4. Ordenar resgistros \n"
                + "0. Salir ");
        return opc;
    }

    public String impresionMenuAgregarVehiculo() {
        String opc = JOptionPane.showInputDialog("1. Crear Carro \n"
                + "2. Crear Bus \n"
                + "3. Crear Moto \n"
                + "0. Volver ");
        return opc;
    }

    public String impresionMenuDatos() {
        String opc = JOptionPane.showInputDialog("1. Imprimir Carros \n"
                + "2. Imprimir Buses \n"
                + "3. Imprimir Motos \n"
                + "0. Volver ");
        return opc;
    }
    
    public String impresionMenuOrdenamiento(){
        String opc = JOptionPane.showInputDialog("1. Ordenar Carros (Cedula) \n"
                + "2. Ordenar Buses (Tarifa) \n"
                + "3. Ordenar Motos \n"
                + "0. Volver ");
        return opc;     
    }
    
    
    public void menuPrincipal(){
        boolean bandera = true;
        while (bandera){
            try {
                int op = Integer.parseInt(impresionMenuPrincipal());
                switch (op) {
                    case 1: menuAgregarVehiculo();
                            break;
                    case 2: menuImpresionDatos();
                            break;
                    case 3: buscar();
                            break;
                    case 4: menuOrdenamiento();
                            break;
                    case 0: bandera = false;
                            break;
                    default: JOptionPane.showInputDialog("No es una opcion valida");
                }
            }catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error ingresando los datos", "Error", 0);
            }
        }
    }
    
    public void menuAgregarVehiculo(){
        boolean bandera = true;
        while (bandera){
            try {
                int op = Integer.parseInt(impresionMenuAgregarVehiculo());
                switch (op) {
                    case 1: crearCarro();
                            break;
                    case 2: crearBus();
                            break;
                    case 3: crearMoto();
                            break;
                    case 0: bandera = false;
                            break;
                    default: JOptionPane.showInputDialog("No es una opcion valida");
                }
            }catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error ingresando los datos", "Error", 0);
            }
        }
    }
    
    public void menuImpresionDatos(){
        boolean bandera = true;
        while (bandera){
            try {
                int op = Integer.parseInt(impresionMenuDatos());
                switch (op) {
                    case 1: imprimirCarro();
                            break;
                    case 2: imprimirBus();
                            break;
                    case 3: imprimirMoto();
                            break;
                    case 0: bandera = false;
                            break;
                    default: JOptionPane.showInputDialog("No es una opcion valida");
                }
            }catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error ingresando los datos", "Error", 0);
            }
        }
    }
    
    public void menuOrdenamiento(){
        boolean bandera = true;
        while (bandera){
            try {
                int op = Integer.parseInt(impresionMenuDatos());
                switch (op) {
                    case 1: ordenarCarros();
                            break;
                    case 2: ordenarBuses();
                            break;
                    case 3: ordenarMotos();
                            break;
                    case 0: bandera = false;
                            break;
                    default: JOptionPane.showInputDialog("No es una opcion valida");
                }
            }catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error ingresando los datos", "Error", 0);
            }
        }
    }
    
}
