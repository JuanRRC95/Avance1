/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


public class Carro extends MedioTransporte {

    public Carro(String placa, String Marca, int modelo, String nombreConductor, double cedula, double tarifaMinima,String tipo) {
        super(placa, Marca, modelo, nombreConductor, cedula, tarifaMinima,tipo);
        tipo="Carro";
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
