/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Logica.Logica;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juan Rodriguez
 */
public class Ficheros {

    private String rutaBuses = "buses.drr";
    private String rutaMotos = "motos.drr";
    private String rutaCarros = "carros.drr";
    BufferedReader br;
    BufferedWriter bw;

    /**
     * public void crearFichero() { try { File archivo = new File(ruta);
     * BufferedWriter bw; if (archivo.exists()) { bw = new BufferedWriter(new
     * FileWriter(archivo)); bw.write("El fichero de texto ya estaba creado.");
     * } else { bw = new BufferedWriter(new FileWriter(archivo));
     * bw.write("Acabo de crear el fichero de texto."); } bw.close(); } catch
     * (IOException ex) {
     *
     * }
     * }
     */
    public void añadirRegistroBus() {

    }

    public void añadirRegistroCarro() {

    }

    public void añadirRegistroMoto() {

    }

    /**
     *
     * File archivo = new File(ruta); BufferedWriter bw; if(archivo.exists()) {
     * bw = new BufferedWriter(new FileWriter(archivo)); bw.write("El fichero de
     * texto ya estaba creado."); } else { bw = new BufferedWriter(new
     * FileWriter(archivo)); bw.write("Acabo de crear el fichero de texto."); }
     * bw.close();
     */

    public String crearJson(Object objeto) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonEjemplo = gson.toJson(objeto);
        return jsonEjemplo;
    }

    public void leerFicheroBuses() {
        try {
            String linea = br.readLine();
            while (linea != null) {
                Gson gson = new Gson();
                Persona ejemplo = gson.fromJson(linea, Persona.class);
                System.out.println(ejemplo.getNombre());
                linea = br.readLine();
            }
        } catch (Exception ex) {

        }
    }

    
    public void leerFicheroCarros() {
        try {
            String linea = br.readLine();
            while (linea != null) {
                Gson gson = new Gson();
                Persona ejemplo = gson.fromJson(linea, Persona.class);
                System.out.println(ejemplo.getNombre());
                linea = br.readLine();
            }
        } catch (Exception ex) {

        }
    }
    
    
    public void leerFicheroMotos() {
        try {
            String linea = br.readLine();
            while (linea != null) {
                Gson gson = new Gson();
                Persona ejemplo = gson.fromJson(linea, Persona.class);
                System.out.println(ejemplo.getNombre());
                linea = br.readLine();
            }
        } catch (Exception ex) {

        }
    }
    /*
     public Object retorna(String registro){
     Gson gson = new Gson();
        
        
     }
     */
    public void escribirFichero() {
        br = new BufferedReader(new FileReader("fichero1.ddr"));
        bw = new BufferedWriter(new FileWriter("fichero1.ddr"));
        try {
            escribeFichero(bw);
            //Guardamos los cambios del fichero
            bw.flush();
            leeFichero(br);
        } catch (IOException e) {
            System.out.println("Error E/S: " + e);
        }

    }

}
