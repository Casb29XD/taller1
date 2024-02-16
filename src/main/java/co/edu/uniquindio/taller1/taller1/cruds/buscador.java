package co.edu.uniquindio.taller1.taller1.cruds;

import co.edu.uniquindio.taller1.taller1.constructor.Cliente_Juridica;

import java.util.ArrayList;

public class buscador {
    Crud_clienteJuridico crudClienteJuridico= new Crud_clienteJuridico();

    public Integer buscadarJuridico(int indetificacion){
        int pos=-1;
        ArrayList<Cliente_Juridica> clienteJuridicas= Crud_clienteJuridico.leer_Cjuridica();
        for (int i=0;i<clienteJuridicas.size();i++){
            if (indetificacion == clienteJuridicas.get(i).getIdentificacion()){
                pos=i;
            }
        }
        return pos;
    }
}
