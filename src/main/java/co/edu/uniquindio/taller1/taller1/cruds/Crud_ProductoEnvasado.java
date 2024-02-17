package co.edu.uniquindio.taller1.taller1.cruds;

import co.edu.uniquindio.taller1.taller1.constructor.Producto_Envasado;
import co.edu.uniquindio.taller1.taller1.constructor.Producto_Perecedero;
import co.edu.uniquindio.taller1.taller1.constructor.Producto_Refrigerado;

import java.io.*;
import java.util.ArrayList;

public class Crud_ProductoEnvasado {

    Buscador buscador = new Buscador();
    static String archivo="CRUD_ProduEnvasados.txt";
    public static void guardar_ProductoRefigerado(Producto_Envasado productoEnvasado){
        try(BufferedWriter writer= new BufferedWriter(new FileWriter(archivo,true))) {
            writer.write(productoEnvasado.getCodigo()+";"+ productoEnvasado.getNombre()+";"
            +productoEnvasado.getDescripcion()+";"+productoEnvasado.getValorUnitario()+";"+
                    productoEnvasado.getCantidadExistente()+";"+productoEnvasado.getTipoProducto()+";"
            +productoEnvasado.getFechaEnvasado()+";"+productoEnvasado.getPesoEnvase()+";"+
                    productoEnvasado.getPaisOrigen()+"/n");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static ArrayList<Producto_Envasado> leer_productoEnvasados(){
        ArrayList<Producto_Envasado> productoEnvasados= new ArrayList<>();
        try (BufferedReader reader= new BufferedReader(new FileReader(archivo))){
            String line;
            while ((line = reader.readLine())!= null){
                String[] dato=line.split(";");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return productoEnvasados;
    }
    public void actualizar_ProducEnvasado(int codigo, Producto_Envasado productoEnvasado){
        ArrayList<Producto_Envasado> productoEnvasados= leer_productoEnvasados();
        int pos= buscador.buscadarCodigoProductos(codigo);
        if (codigo == productoEnvasados.get(pos).getCodigo()){
            productoEnvasados.set(pos,productoEnvasado);
            guardar_ProductosEnvasados(productoEnvasados);
        }
    }
    public void eliminar_ProducEnvasado(int codigo){
        ArrayList<Producto_Envasado> productoEnvasados= leer_productoEnvasados();
        int pos= buscador.buscadarCodigoProductos(codigo);
        if (codigo == productoEnvasados.get(pos).getCodigo()){
            productoEnvasados.remove(pos);
            guardar_ProductosEnvasados(productoEnvasados);
        }
    }
    public static void guardar_ProductosEnvasados(ArrayList<Producto_Envasado> productoEnvasados){
        try(BufferedWriter writer= new BufferedWriter(new FileWriter(archivo))) {
            for (int i =0; i <productoEnvasados.size();i++){
                writer.write(productoEnvasados.get(i).getCodigo()+";"+ productoEnvasados.get(i).getNombre()+";"
                        +productoEnvasados.get(i).getDescripcion()+";"+productoEnvasados.get(i).getValorUnitario()+";"+
                        productoEnvasados.get(i).getCantidadExistente()+";"+productoEnvasados.get(i).getTipoProducto()+";"
                        +productoEnvasados.get(i).getFechaEnvasado()+";"+productoEnvasados.get(i).getPesoEnvase()+";"+
                        productoEnvasados.get(i).getPaisOrigen()+"/n");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
