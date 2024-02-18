package co.edu.uniquindio.taller1.taller1;

import co.edu.uniquindio.taller1.taller1.cruds.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;

public class prueba {
    static Buscador buscador = new Buscador();
    public static void main(String[] args) {
        int codigo=0;

    }
    // productos
    public static void guardarproductos(){
        int codigo=0;
        String tipoProducto="";
        if(buscador.buscadarCodigoProductos(codigo) == -1){
            if (tipoProducto.equals("regiferado")){
               // Crud_ProductoRefigerado.guardar_ProductoRefigerado();
            } else if (tipoProducto.equals("envasado")) {
                //Crud_ProductoEnvasado.guardar_ProductosEnvasados();
            }else if (tipoProducto.equals("perecedero")){
                //Crud_ProductoPerecedero.guardar_ProductoPerecedero();
            }else {
                System.out.println("NO se encotro la opcion");
            }
        }else {
            System.out.println("producto ya registrado");
        }
    }
    public static void Actualizarproductos(){
        int codigo=0;
        String tipoProducto="";
        if(buscador.buscadarCodigoProductos(codigo) != -1){
            if (tipoProducto.equals("regiferado")){
                //Crud_ProductoRefigerado.actualizar_ProducRegigerado(codigo,);
            } else if (tipoProducto.equals("envasado")) {
                //Crud_ProductoEnvasado.actualizar_ProducEnvasado(codigo,);
            }else if (tipoProducto.equals("perecedero")){
                //Crud_ProductoPerecedero.guardar_ProductoPerecedero();
            }else {
                System.out.println("NO se encotro la opcion");
            }
        }else {
            System.out.println("producto no registrado");
        }
    }
    public static void  eliminarProducto(){
        int codigo=0;
        if(buscador.buscadarCodigoProductos(codigo) != -1) {
            Crud_ProductoEnvasado.eliminar_ProducEnvasado(codigo);
            Crud_ProductoRefigerado.eliminar_ProducRegigerado(codigo);
            Crud_ProductoPerecedero.eliminar_ProducRegigerado(codigo);
        }
    }

    //clientes
    public static void guardarclientes(){
        int codigo=0;
        String tipoCliente="";
        if(buscador.buscadarJuridico(codigo) == -1 && tipoCliente.equals("juridico")){
            //Crud_clienteJuridico.guardar_ClienJuridica();
        } else if (buscador.buscadarClienteNormal(codigo) == -1 && tipoCliente.equals("natural")){
            //Crud_clienteJuridico.guardar_ClienJuridica();
        }else {
            System.out.println("cliente ya registrado");
        }
    }
    public static void  eliminarClientes(){
        int codigo=0;
        if(buscador.buscadarJuridico(codigo) != -1) {
            Crud_clienteJuridico.eliminar_Cjuridica(codigo);
        }if (buscador.buscadarClienteNormal(codigo) != -1){
            Crud_clienteNormal.eliminarClienteNatu(codigo);
        }
    }
    public static void  ActualizarClientes(){
        int codigo=0;
        if(buscador.buscadarJuridico(codigo) != -1) {
            //Crud_clienteJuridico.actualizar_Cjuridica(codigo,);
        }if (buscador.buscadarClienteNormal(codigo) >= -1){
            //Crud_clienteNormal.actualizarClienteNatural(codigo,);
        }
    }
}
