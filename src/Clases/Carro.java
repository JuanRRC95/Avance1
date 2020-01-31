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
public class Carro {
    
    private String placa;
    private String Marca;
    private String modelo;
    private String nombreConductor;
    private double cedula;
    private double tarifaMinima;

    public Carro(String placa, String Marca, String modelo, String nombreConductor, double cedula, double tarifaMinima) {
        this.placa = placa;
        this.Marca = Marca;
        this.modelo = modelo;
        this.nombreConductor = nombreConductor;
        this.cedula = cedula;
        this.tarifaMinima = tarifaMinima;
    }
    
    public Carro(){
        
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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
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
    
    
    
}
