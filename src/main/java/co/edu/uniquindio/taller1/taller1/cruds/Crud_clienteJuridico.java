package co.edu.uniquindio.taller1.taller1.cruds;

import co.edu.uniquindio.taller1.taller1.constructor.Cliente_Juridica;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Crud_clienteJuridico {
    private static final String archivo="ClientesJuridicos.txt";
    buscador buscador=new buscador();
    public static void guradar_CJuridica(Cliente_Juridica clinteJuridica){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(archivo,true))) {
            writer.write(clinteJuridica.getNombre()+";"+clinteJuridica.getApellido()+";"+
                    clinteJuridica.getIdentificacion()+";"+clinteJuridica.getDireccion()+";"+
                    clinteJuridica.getTelefono()+";"+clinteJuridica.getTipo_Cliente()+";"+
                    clinteJuridica.getNit()+"/n");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static ArrayList<Cliente_Juridica> leer_Cjuridica(){
        ArrayList<Cliente_Juridica> clienteJuridicas = new ArrayList<>();
        return clienteJuridicas;
    }
    public static void actualizar_Cjuridica(int identifiacion, Cliente_Juridica clinteJuridica){
        ArrayList<Cliente_Juridica> clientes = leer_Cjuridica();
        int pos=0;
        if (clientes.get(pos).getNit() == identifiacion){
            clientes.set(pos,clinteJuridica);
        }
        guradar_CJuridicas(clientes);
    }
    public static void eliminar_Cjuridica(int identifiacion){
        ArrayList<Cliente_Juridica> clientes = leer_Cjuridica();
        int pos=0;
        if (clientes.get(pos).getIdentificacion() == identifiacion){
            clientes.remove(pos);
        }
        guradar_CJuridicas(clientes);
    }
    public static void guradar_CJuridicas(ArrayList<Cliente_Juridica> clinteJuridica) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
            for (int i = 0; i < clinteJuridica.size(); i++) {
                writer.write(clinteJuridica.get(i).getNombre() + ";" + clinteJuridica.get(i).getApellido() + ";" +
                        clinteJuridica.get(i).getIdentificacion()+";"+clinteJuridica.get(i).getDireccion()+";"+
                        clinteJuridica.get(i).getTelefono() + ";" + clinteJuridica.get(i).getTipo_Cliente() + ";" +
                        clinteJuridica.get(i).getNit() + "/n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
