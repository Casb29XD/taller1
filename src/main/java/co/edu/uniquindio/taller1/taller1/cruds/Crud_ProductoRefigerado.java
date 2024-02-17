package co.edu.uniquindio.taller1.taller1.cruds;

import co.edu.uniquindio.taller1.taller1.constructor.Producto_Perecedero;
import co.edu.uniquindio.taller1.taller1.constructor.Producto_Refrigerado;

import java.io.*;
import java.util.ArrayList;

public class Crud_ProductoRefigerado {
    Buscador buscador = new Buscador();
    static String archivo="CRUD_ProduRefigerado.txt";
    public static void guardar_ProductoRefigerado(Producto_Refrigerado productoRefrigerado){
        try(BufferedWriter writer= new BufferedWriter(new FileWriter(archivo,true))) {
            writer.write(productoRefrigerado.getCodigo()+";"+ productoRefrigerado.getNombre()+";"
                    +productoRefrigerado.getDescripcion()+";"+productoRefrigerado.getValorUnitario()+";"+
                    productoRefrigerado.getCantidadExistente()+";"+productoRefrigerado.getTipoProducto()+";"
                +productoRefrigerado.getCodigoAprobacion()+";"+productoRefrigerado.getTemperaturaRecomendada()+"/n");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static ArrayList<Producto_Refrigerado> leer_productoRefrigerados(){
        ArrayList<Producto_Refrigerado> productoRefrigerados= new ArrayList<>();
        try (BufferedReader reader= new BufferedReader(new FileReader(archivo))){
            String line;
            while ((line = reader.readLine())!= null){
                String[] dato=line.split(";");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return productoRefrigerados;
    }
    public void actualizar_ProducRegigerado(int codigo, Producto_Refrigerado productoRefrigerado){
        ArrayList<Producto_Refrigerado> productoRefrigerados= leer_productoRefrigerados();
        int pos= buscador.buscadarCodigoProductos(codigo);
        if (codigo == productoRefrigerados.get(pos).getCodigo()){
            productoRefrigerados.set(pos,productoRefrigerado);
            guardar_ProductosRefigerados(productoRefrigerados);
        }
    }
    public void eliminar_ProducRegigerado(int codigo){
        ArrayList<Producto_Refrigerado> productoRefrigerados= leer_productoRefrigerados();
        int pos= buscador.buscadarCodigoProductos(codigo);
        if (codigo == productoRefrigerados.get(pos).getCodigo()){
            productoRefrigerados.remove(pos);
            guardar_ProductosRefigerados(productoRefrigerados);
        }
    }
    public static void guardar_ProductosRefigerados(ArrayList<Producto_Refrigerado> productoRefrigerados){
        try(BufferedWriter writer= new BufferedWriter(new FileWriter(archivo))) {
            for (int i =0; i <productoRefrigerados.size();i++){
                writer.write(productoRefrigerados.get(i).getCodigo()+";"+ productoRefrigerados.get(i).getNombre()+";"
                        +productoRefrigerados.get(i).getDescripcion()+";"+productoRefrigerados.get(i).getValorUnitario()+";"+
                        productoRefrigerados.get(i).getCantidadExistente()+";"+productoRefrigerados.get(i).getTipoProducto()+";"
                        +productoRefrigerados.get(i).getCodigoAprobacion()+";"+productoRefrigerados.get(i).getTemperaturaRecomendada()+"/n");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
