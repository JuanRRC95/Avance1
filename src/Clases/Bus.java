/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


public class Bus extends MedioTransporte{

    private int numeroPasajeros;
    
    public Bus(String placa, String Marca, int modelo, String nombreConductor, double cedula, double tarifaMinima,int numeroPasajeros,String tipo) {
        super(placa, Marca, modelo, nombreConductor, cedula, tarifaMinima,tipo);
        this.numeroPasajeros=numeroPasajeros;
        tipo="Bus";
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    @Override
    public String toString() {
        return super.toString()+ "Numero de Pasajeros :" + numeroPasajeros + "\n"; //To change body of generated methods, choose Tools | Templates.
    }

    
    
    

    
    
}
