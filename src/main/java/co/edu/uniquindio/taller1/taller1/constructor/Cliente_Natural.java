package co.edu.uniquindio.taller1.taller1.constructor;

public class Cliente_Natural extends Cliente{
    String email;
    String fecha_Nacimineto;

    public Cliente_Natural(String nombre, String apellido, int identificacion, String direccion, int telefono, String tipo_Cliente, String email) {
        super(nombre, apellido, identificacion, direccion, telefono, tipo_Cliente);
        this.email = email;
        this.fecha_Nacimineto = fecha_Nacimineto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFecha_Nacimineto() {
        return fecha_Nacimineto;
    }

    public void setFecha_Nacimineto(String fecha_Nacimineto) {
        this.fecha_Nacimineto = fecha_Nacimineto;
    }
}
