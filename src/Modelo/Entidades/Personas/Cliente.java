package Modelo.Entidades.Personas;

import java.time.LocalDate;

public class Cliente extends Persona {

    private String idCliente;
    private LocalDate fechaRegistro;

    public Cliente(String idCliente, String nombre, String direccion, String telefono,
                   String email, LocalDate fechaRegistro) {

        super(nombre, direccion, telefono, email);

        this.idCliente = idCliente;
        this.fechaRegistro = fechaRegistro;
    }


    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
