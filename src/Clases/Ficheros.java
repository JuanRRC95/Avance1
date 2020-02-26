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
    public void añadirRegistroBus(Bus bus) {
        List<Bus>lista = new ArrayList<>();
        lista=leerFicheroBuses();
        lista.add(bus);
        crearJsonBus(lista,"ficheroBuses");
    }

    public void añadirRegistroCarro(Carro carro) {

    }

    public void añadirRegistroMoto(Moto moto) {

    }

    /**
     *
     * File archivo = new File(ruta); BufferedWriter bw; if(archivo.exists()) {
     * bw = new BufferedWriter(new FileWriter(archivo)); bw.write("El fichero de
     * texto ya estaba creado."); } else { bw = new BufferedWriter(new
     * FileWriter(archivo)); bw.write("Acabo de crear el fichero de texto."); }
     * bw.close();
     */
    public void crearJsonBus(List<Bus> lista,String nombreFichero) {
        for (Object obj : lista) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String jsonEjemplo = gson.toJson(obj);
            escribirFichero(jsonEjemplo, nombreFichero);
        }
    }
    
    public void crearJsonCarro(List<Carro> lista,String nombreFichero) {
        for (Object obj : lista) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String jsonEjemplo = gson.toJson(obj);
            escribirFichero(jsonEjemplo, jsonEjemplo);
        }
    }
    
    public void crearJsonMoto(List<Moto> lista,String nombreFichero) {
        for (Object obj : lista) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String jsonEjemplo = gson.toJson(obj);
            escribirFichero(jsonEjemplo, jsonEjemplo);
        }
    }

    public List<Bus> leerFicheroBuses() {
        List<Bus> listaBuses = new ArrayList<>();
        try {
            br = new BufferedReader(new FileReader("ficheroBuses.ddr"));
            String linea = br.readLine();
            while (linea != null) {
                Gson gson = new Gson();
                Bus bus = gson.fromJson(linea, Bus.class);
                listaBuses.add(bus);
                linea = br.readLine();
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return listaBuses;
    }

    public List<Carro> leerFicheroCarros() {
        List<Carro> listaCarros = new ArrayList<>();
        try {
            br = new BufferedReader(new FileReader("ficheroCarros.ddr"));
            String linea = br.readLine();
            while (linea != null) {
                Gson gson = new Gson();
                Carro carro = gson.fromJson(linea, Carro.class);
                listaCarros.add(carro);
                linea = br.readLine();
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return listaCarros;
    }

    public List<Moto> leerFicheroMotos() {
        List<Moto> listaMotos = new ArrayList<>();
        try {
            br = new BufferedReader(new FileReader("ficheroMotos.ddr"));
            String linea = br.readLine();
            while (linea != null) {
                Gson gson = new Gson();
                Moto moto = gson.fromJson(linea, Moto.class);
                listaMotos.add(moto);
                linea = br.readLine();
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return listaMotos;
    }
    /*
     public Object retorna(String registro){
     Gson gson = new Gson();
        
        
     }
     */

    public void escribirFichero(String json,String nombreFichero) {        
        try {
            bw = new BufferedWriter(new FileWriter(nombreFichero));
            bw.write(json.replace("\n",""));
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            System.out.println("Error E/S: " + e.getMessage());
        }

    }

}
