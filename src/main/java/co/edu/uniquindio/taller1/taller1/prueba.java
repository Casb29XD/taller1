package co.edu.uniquindio.taller1.taller1;

import co.edu.uniquindio.taller1.taller1.cruds.Buscador;
import co.edu.uniquindio.taller1.taller1.cruds.Crud_ProductoEnvasado;
import co.edu.uniquindio.taller1.taller1.cruds.Crud_ProductoPerecedero;
import co.edu.uniquindio.taller1.taller1.cruds.Crud_ProductoRefigerado;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;

public class prueba {
    static Buscador buscador = new Buscador();
    public static void main(String[] args) {
        int codigo=0;

    }
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

}
