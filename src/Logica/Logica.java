/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Clases.Bus;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Rodriguez
 */
public class Logica {

    private Object array[] = new Object[100];
    private String[] marcas = {
        "Mazda",
        "Dars",
        "Ford",
        "Onda",
        "Suki",
        "Audi",
        "Perl"
    };

    public void cargarDatos() {
        Bus bus1 = new Bus("abc-123", "Mazd", 2005, "Jose Cuervo", 1074188, 5000, 20);
        Bus bus2 = new Bus("qwe-346", "Susu", 2004, "Juan Rodrig", 1005888, 4500, 15);
        Bus bus3 = new Bus("fre-668", "Chre", 2002, "Pedro Perez", 4445556, 2500, 10);
        Bus bus4 = new Bus("iju-623", "Ford", 2005, "Pablo Ramoz", 6668889, 5200, 20);
        Bus bus5 = new Bus("gfd-578", "Audi", 2012, "Mario Pelae", 7779998, 3250, 10);
        Bus bus6 = new Bus("bgv-865", "Onda", 2013, "Angie Forer", 1234567, 4700, 20);
        Bus bus7 = new Bus("kuj-342", "Dars", 2012, "Sandra Cort", 8527419, 10800, 30);
        Bus bus8 = new Bus("pol-456", "Pele", 2009, "Jimena sanc", 9517538, 6500, 30);
        array[0] = bus1;
        array[1] = bus2;
        array[2] = bus3;
        array[3] = bus4;
        array[4] = bus5;
        array[5] = bus6;
        array[6] = bus1;
        array[7] = bus2;

    }

    //String placa, String Marca, String modelo, String nombreConductor, double cedula, double tarifa, int numeroPasajeros
    public void insertarBus() {
        try {
            String placa = JOptionPane.showInputDialog("Digite la placa del vehiculo");
            String marca = (String) JOptionPane.showInputDialog(null, "Seleccione una marca", "Marcas", JOptionPane.DEFAULT_OPTION, null, marcas, marcas[0]);
            String model = JOptionPane.showInputDialog("Digite el modelo del vehiculo");
            int modelo = Integer.parseInt(model);
            String nombre = JOptionPane.showInputDialog("Digite el nombre del conductor");
            String ced = JOptionPane.showInputDialog("Digite la cedula del conductor");
            double cedula = Double.parseDouble(ced);
            String tari = JOptionPane.showInputDialog("Digite la tarifa del vehiculo");
            double tarifa = Double.parseDouble(tari);
            String pasa = JOptionPane.showInputDialog("Digite el numero de pasajeros");
            int pasajeros = Integer.parseInt(pasa);
            Bus bus = new Bus(placa, marca, modelo, nombre, cedula, tarifa, pasajeros);
            agregarElemento(bus);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error ingresando los datos", "Error", 0);
        }

    }

    public void agregarElemento(Bus bus) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = bus;
                break;
            }
        }
    }

    public void imprimir() {
        Bus b;
        String resultado = "";
        limpiar();
        System.out.println(" PLACA | MARCA | MODELO | TARIFA | NOMBRE CONDUCTOR |     CEDULA      | NUMERO PASAJEROS");
        for (Object elemento : array) {
            if (elemento != null) {
                b = ((Bus) elemento);
                System.out.println(b.getPlaca() + "   " + b.getMarca() + "   " + b.getModelo() + "   " + String.valueOf(b.getTarifa()) + "      "
                        + b.getNombreConductor() + "       " + b.getCedula() + "         " + b.getNumeroPasajeros());
            }
        }
    }

    public void buscarElmento(double cedula) {
        Bus b = null;
        for (Object elemento : array) {
            if (elemento != null) {
                b = ((Bus) elemento);
                if (b.getCedula() == cedula) {
                    JOptionPane.showMessageDialog(null, "Datos encontrados : \n"
                            + "Nombre Conductor: " + b.getNombreConductor() + "\n"
                            + "Marca :" + b.getMarca() + "\n"
                            + "Modelo :" + b.getModelo() + "\n"
                            + "Placa :" + b.getPlaca() + "\n"
                            + "Tarifa :" + b.getTarifa() + "\n"
                            + "Numero de Asientos :" + b.getNumeroPasajeros() + "\n"
                            + "Cedula :" + b.getCedula() + "\n");
                }
            }
        }
    }

    public void ordenamientoAscendenteTarifa() {
        int i, j;
        Bus b1, b2;
        Object aux;
        for (i = 0; i < array.length - 1; i++) {
            for (j = 0; j < array.length - i - 1; j++) {
                b1 = ((Bus) array[j]);
                b2 = ((Bus) array[j + 1]);
                if (b1 != null && b2 != null) {
                    if (b2.getTarifa() < b1.getTarifa()) {
                        aux = array[j + 1];
                        array[j + 1] = array[j];
                        array[j] = aux;
                    }
                }
            }
        }
    }

    public void ordenamientoDescendenteTarifa() {
        int i, j;
        Bus b1, b2;
        Object aux;
        for (i = 0; i < array.length - 1; i++) {
            for (j = 0; j < array.length - i - 1; j++) {
                if ((array[i] != null) && (array[j] != null)) {
                    b1 = ((Bus) array[j]);
                    b2 = ((Bus) array[j + 1]);
                    if (b1 != null && b2 != null) {
                        if (b2.getTarifa() > b1.getTarifa()) {
                            aux = array[j + 1];
                            array[j + 1] = array[j];
                            array[j] = aux;
                        }
                    }
                }
            }
        }
    }

    public void limpiar() {
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }

}
