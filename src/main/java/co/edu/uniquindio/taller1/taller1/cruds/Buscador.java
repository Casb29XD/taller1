package co.edu.uniquindio.taller1.taller1.cruds;

import co.edu.uniquindio.taller1.taller1.constructor.*;

import java.util.ArrayList;

public class Buscador {
    Crud_ProductoPerecedero crudProductoPerecederos= new Crud_ProductoPerecedero();

    public Integer buscadarJuridico(int indetificacion){
        int pos=-1;
        ArrayList<Cliente_Juridica> clienteJuridicas= Crud_clienteJuridico.leer_Cjuridica();
        for (int i=0;i<clienteJuridicas.size(); i++){
            if (indetificacion == clienteJuridicas.get(i).getIdentificacion()){
                pos=i;
                break;
            }
        }
        return pos;
    }
    public Integer buscadarClienteNormal(int indetificacion){
        int pos=-1;
        ArrayList<Cliente_Natural> clienteNaturals= Crud_clienteNormal.leerClienteNatural();
        for (int i=0;i<clienteNaturals.size(); i++){
            if (indetificacion == clienteNaturals.get(i).getIdentificacion()){
                pos=i;
                break;
            }
        }
        return pos;
    }
    public Integer buscadarCodigoProductos(int codigo){
        int pos=-1;
        ArrayList<Producto_Perecedero> productoPerecederos= crudProductoPerecederos.leer_productoPerecedero();
        ArrayList<Producto_Envasado> productoEnvasados= Crud_ProductoEnvasado.leer_productoEnvasados();
        ArrayList<Producto_Refrigerado> productoRefrigerados = Crud_ProductoRefigerado.leer_productoRefrigerados();
        int i=0;
        while(i<= mayor() && pos !=(-1)){
            if (productoPerecederos.size() > i || codigo == productoPerecederos.get(i).getCodigo()){
                pos=i;
            }
            if (productoEnvasados.size() > i || codigo == productoEnvasados.get(i).getCodigo()){
                pos=i;
            }
            if (productoRefrigerados.size() > i || codigo == productoRefrigerados.get(i).getCodigo()){
                pos=i;
            }
            i++;
        }
        return pos;
    }
    public Integer mayor(){
        int mayor=0;
        ArrayList<Producto_Perecedero> productoPerecederos= crudProductoPerecederos.leer_productoPerecedero();
        ArrayList<Producto_Envasado> productoEnvasados= Crud_ProductoEnvasado.leer_productoEnvasados();
        ArrayList<Producto_Refrigerado> productoRefrigerados = Crud_ProductoRefigerado.leer_productoRefrigerados();
        if (productoPerecederos.size() >= productoEnvasados.size() && productoPerecederos.size() >= productoRefrigerados.size()){
            mayor= productoPerecederos.size();
        }else if ( productoEnvasados.size() >= productoPerecederos.size()&& productoEnvasados.size() >= productoRefrigerados.size()){
            mayor= productoEnvasados.size();
        }else {
            mayor= productoRefrigerados.size();
        }
        return mayor;
    }

}
