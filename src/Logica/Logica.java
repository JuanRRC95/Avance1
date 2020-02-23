package Logica;

import Clases.Bus;
import Clases.Carro;
import Clases.MedioTransporte;
import Clases.Moto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Logica {

    private List<Object> lista = new ArrayList<>();
    private Bus listaBus[] = new Bus[100];
    private Carro listaCarro[] = new Carro[100];
    private Moto listaMoto[] = new Moto[100];
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
        Bus vehiculo1 = new Bus("abc-123", "Mazd", 2005, "Jose Cuervo", 1074188, 5000, 20);
        Bus vehiculo2 = new Bus("qwe-346", "Susu", 2004, "Juan Rodrig", 1005888, 4500, 15);
        Bus vehiculo3 = new Bus("fre-668", "Chre", 2002, "Pedro Perez", 4445556, 2500, 10);
        Bus vehiculo4 = new Bus("iju-623", "Ford", 2005, "Pablo Ramoz", 6668889, 5200, 20);
        Carro vehiculo5 = new Carro("gfd-578", "Audi", 2012, "Mario Pelae", 7779998, 3250);
        Carro vehiculo6 = new Carro("bgv-865", "Onda", 2013, "Angie Forer", 1234567, 4700);
        Carro vehiculo7 = new Carro("kuj-342", "Dars", 2012, "Sandra Cort", 8527419, 10800);
        Carro vehiculo8 = new Carro("pol-456", "Perl", 2009, "Jimena sanc", 9517538, 6500);
        Moto vehiculo9 = new Moto("zxc-458", "Perl", 2006, "Juliana Flor", 9546212, 89500);
        Moto vehiculo10 = new Moto("iju-888", "Audi", 2005, "Armando Vanega", 6325148, 4600);
        Moto vehiculo11 = new Moto("tfg-898", "Mazda", 2010, "Michael Cardenas", 9546874, 7625);
        Moto vehiculo12 = new Moto("bgv-653", "Suki", 2007, "Julian Vallejo", 6597458, 3200);
        lista.add(vehiculo1);
        lista.add(vehiculo2);
        lista.add(vehiculo3);
        lista.add(vehiculo4);
        lista.add(vehiculo5);
        lista.add(vehiculo6);
        lista.add(vehiculo7);
        lista.add(vehiculo8);
        lista.add(vehiculo9);
        lista.add(vehiculo10);
        lista.add(vehiculo11);
        lista.add(vehiculo12);
    }

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
            agregarBus(bus);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error ingresando los datos", "Error", 0);
        }
    }

    public void insertarCarro() {
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
            Carro carro = new Carro(placa, marca, modelo, nombre, cedula, tarifa);
            agregarCarro(carro);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error ingresando los datos", "Error", 0);
        }
    }

    public void insertarMoto() {
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
            Moto moto = new Moto(placa, marca, modelo, nombre, cedula, tarifa);
            agregarMoto(moto);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error ingresando los datos", "Error", 0);
        }
    }

    public void agregarBus(Bus bus) {
        lista.add(bus);
    }

    public void agregarCarro(Carro carro) {
        lista.add(carro);
    }

    public void agregarMoto(Moto moto) {
        lista.add(moto);
    }

    public void imprimirBuses() {
        Bus bus;
        limpiarConsola();
        System.out.println(" PLACA | MARCA | MODELO | TARIFA | NOMBRE CONDUCTOR |       CEDULA       |      Numero de Pasajero ");
        for (Object vehiculo : lista) {
            if(vehiculo instanceof Bus){
                bus=((Bus)vehiculo);
                System.out.println(bus.getPlaca() + "   " + bus.getMarca() + "   " + bus.getModelo() + "   " + String.valueOf(bus.getTarifaMinima()) + "      "
                + bus.getNombreConductor() + "       " + bus.getCedula() + "         " + bus.getNumeroPasajeros());        
            }
        }
    }

    public void imprimirCarros() {
        Carro carro;
        limpiarConsola();
        System.out.println(" PLACA | MARCA | MODELO | TARIFA | NOMBRE CONDUCTOR |       CEDULA       |");
        for (Object vehiculo : lista) {
            if(vehiculo instanceof Carro){
                carro=((Carro)vehiculo);
                System.out.println(carro.getPlaca() + "   " + carro.getMarca() + "   " + carro.getModelo() + "   " + String.valueOf(carro.getTarifaMinima()) + "      "
                + carro.getNombreConductor() + "       " + carro.getCedula() + "         ");        
            }
        }
    }

    public void imprimirMotos() {
        Moto moto;
        limpiarConsola();
        System.out.println(" PLACA | MARCA | MODELO | TARIFA | NOMBRE CONDUCTOR |     CEDULA      |");
        for (Object vehiculo : lista) {
            if (vehiculo instanceof Moto) {
                moto=((Moto)vehiculo);
                System.out.println(moto.getPlaca() + "   " + moto.getMarca() + "   " + moto.getModelo() + "   " + String.valueOf(moto.getTarifaMinima()) + "      "
                        + moto.getNombreConductor() + "       " + moto.getCedula() + "");
            }
        }
    }

    public String buscarConductor(double cedula) {
        for (Object vehiculo : lista) {
            if (vehiculo instanceof Bus) {
                if (cedula == ((Bus) vehiculo).getCedula()) {
                    return vehiculo.toString();
                }
            } else {
                if (vehiculo instanceof Carro) {
                    if (cedula == ((Carro) vehiculo).getCedula()) {
                        return vehiculo.toString();
                    }
                } else {
                    if (vehiculo instanceof Moto) {
                        if (cedula == ((Moto) vehiculo).getCedula()) {
                            return vehiculo.toString();
                        }
                    }
                }
            }
        }
        return "El registro no existe";
    }

    public void eliminarRegistro(double cedula){        
        for (Object vehiculo : lista) {
            if(vehiculo instanceof Bus){
                if(cedula == ((Bus)vehiculo).getCedula()){
                    lista.remove(vehiculo);
                }
            }else{
                if(vehiculo instanceof Carro){
                    if(cedula==((Carro)vehiculo).getCedula()){
                        lista.remove(vehiculo);
                    }
                }else{
                    if(vehiculo instanceof Moto){
                        if(cedula == ((Moto)vehiculo).getCedula()){
                            lista.remove(vehiculo);
                        }
                    }
                }
            }
        }       
    }
    
    

    public void limpiarConsola() {
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }

}
