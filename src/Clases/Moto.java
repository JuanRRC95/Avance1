/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Juan Rodriguez
 */
public class Moto {
    
    private String placa;
    private String Marca;
    private int modelo;
    private String nombreConductor;
    private double cedula;
    private double tarifaMinima;

    public Moto(){
        
    }
    
    public Moto(String placa, String Marca, int modelo, String nombreConductor, double cedula, double tarifaMinima) {
        this.placa = placa;
        this.Marca = Marca;
        this.modelo = modelo;
        this.nombreConductor = nombreConductor;
        this.cedula = cedula;
        this.tarifaMinima = tarifaMinima;
    }

    
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    
    public String getNombreConductor() {
        return nombreConductor;
    }

    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }

    public double getCedula() {
        return cedula;
    }

    public void setCedula(double cedula) {
        this.cedula = cedula;
    }

    public double getTarifaMinima() {
        return tarifaMinima;
    }

    public void setTarifaMinima(double tarifaMinima) {
        this.tarifaMinima = tarifaMinima;
    }

    @Override
    public String toString() {
        return "Datos encontrados : \n"
                + "Nombre Conductor: " + nombreConductor + "\n"
                + "Marca :" + Marca + "\n"
                + "Modelo :" + modelo + "\n"
                + "Placa :" + placa + "\n"
                + "Tarifa :" + tarifaMinima + "\n"
                + "Cedula :" + cedula + "\n";    
    }
    
    
    
}
