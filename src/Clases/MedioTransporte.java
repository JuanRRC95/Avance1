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
public abstract class MedioTransporte {
    
    private String placa;
    private String Marca;
    private int modelo;
    private String tipo;
    private String nombreConductor;
    private double cedula;
    private double tarifaMinima;
    
    public MedioTransporte(String placa, String Marca, int modelo, String nombreConductor, double cedula, double tarifaMinima,String tipo) {
        this.placa = placa;
        this.Marca = Marca;
        this.modelo = modelo;
        this.nombreConductor = nombreConductor;
        this.cedula = cedula;
        this.tarifaMinima = tarifaMinima;
        this.tipo=tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
