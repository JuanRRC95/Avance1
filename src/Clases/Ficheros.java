/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Juan Rodriguez
 */
public class Ficheros {

    
    
    private String ruta = "archivo.txt";

    

    public void crearFichero() {
        try {
            File archivo = new File(ruta);
            BufferedWriter bw;
            if (archivo.exists()) {
                bw = new BufferedWriter(new FileWriter(archivo));
                bw.write("El fichero de texto ya estaba creado.");
            } else {
                bw = new BufferedWriter(new FileWriter(archivo));
                bw.write("Acabo de crear el fichero de texto.");
            }
            bw.close();
        } catch (IOException ex) {
            
        }
    }
    /**
     *
     * File archivo = new File(ruta); BufferedWriter bw; if(archivo.exists()) {
     * bw = new BufferedWriter(new FileWriter(archivo)); bw.write("El fichero de
     * texto ya estaba creado."); } else { bw = new BufferedWriter(new
     * FileWriter(archivo)); bw.write("Acabo de crear el fichero de texto."); }
     * bw.close();
     */
    
    public String crearJson(){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonEjemplo =""; //gson.toJson(persona);
        return jsonEjemplo;
    }
    
    
}
