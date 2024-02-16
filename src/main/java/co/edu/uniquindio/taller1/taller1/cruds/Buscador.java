package co.edu.uniquindio.taller1.taller1.cruds;

import co.edu.uniquindio.taller1.taller1.constructor.Cliente_Juridica;
import co.edu.uniquindio.taller1.taller1.constructor.Cliente_Natural;

import java.util.ArrayList;

public class Buscador {
    Crud_clienteJuridico crudClienteJuridico= new Crud_clienteJuridico();
    Crud_clienteNormal crudClienteNormal= new Crud_clienteNormal();

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
        ArrayList<Cliente_Natural> clienteNaturals= crudClienteNormal.leerClienteNatural();
        for (int i=0;i<clienteNaturals.size(); i++){
            if (indetificacion == clienteNaturals.get(i).getIdentificacion()){
                pos=i;
                break;
            }
        }
        return pos;
    }
}
