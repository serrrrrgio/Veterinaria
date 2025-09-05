package Modelo.Entidades.Personas;

import java.time.LocalDate;

public class Cliente extends Persona {

    private LocalDate fechaRegistro;
    private int nivelFidelidad;

    public Cliente(Builder builder) {

        super(builder);

        this.fechaRegistro = builder.fechaRegistro;
        this.nivelFidelidad = builder.nivelFidelidad;
    }

    public static class Builder extends Persona.Builder<Builder>{

        private LocalDate fechaRegistro;
        private int nivelFidelidad;

        public Builder fechaRegistro(LocalDate fechaRegistro) {
            this.fechaRegistro = fechaRegistro;
            return this;
        }

        public Builder nivelFidelidad(int nivelFidelidad) {
            this.nivelFidelidad = nivelFidelidad;
            return this;
        }

        @Override
        protected Builder self(){
            return this;
        }

        @Override
        public Persona build(){
            return new Cliente(this);
        }

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
