package Modelo.Entidades.Personas;

import java.time.LocalDate;

public class Cliente extends Persona {

    private LocalDate fechaRegistro;
    private int nivelFidelidad;

    public Cliente(String id, String nombre, String direccion, String telefono,
                   String email, LocalDate fechaRegistro, int nivelFidelidad) {

        super(id, nombre, direccion, telefono, email);

        this.fechaRegistro = fechaRegistro;
        this.nivelFidelidad = nivelFidelidad;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public int getNivelFidelidad() {
        return nivelFidelidad;
    }

    public void setNivelFidelidad(int nivelFidelidad) {
        this.nivelFidelidad = nivelFidelidad;
    }
}
