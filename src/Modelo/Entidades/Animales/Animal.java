package Modelo.Entidades.Animales;

import Modelo.Entidades.Personas.Cliente;
import Modelo.Enums.Especie;
import Modelo.Enums.TipoAnimal;

import java.time.LocalDate;

public abstract class Animal {

    protected String idAnimal;
    protected String nombre;
    protected double peso;
    protected LocalDate fechaNacimiento;
    protected Especie especie;
    protected boolean domestico;
    protected Cliente cliente;
    protected TipoAnimal tipoAnimal;

    public Animal(Builder<?> builder) {

        this.idAnimal = builder.idAnimal;
        this.nombre = builder.nombre;
        this.peso = builder.peso;
        this.fechaNacimiento = builder.fechaNacimiento;
        this.especie = builder.especie;
        this.domestico = builder.domestico;
        this.cliente = builder.cliente;
        this.tipoAnimal = builder.tipoAnimal;
    }


    protected static abstract class Builder<T extends Builder<T>>{
        protected  String idAnimal;
        protected  String nombre;
        protected  double peso;
        protected  LocalDate fechaNacimiento;
        protected  Especie especie;
        protected  boolean domestico;
        protected  Cliente cliente;
        protected  TipoAnimal tipoAnimal;

        public T idAnimal (String idAnimal) {
            this.idAnimal = idAnimal;
            return self();
        }

        public T nombre (String nombre) {
            this.nombre = nombre;
            return self();
        }

        public T peso (double peso) {
            this.peso = peso;
            return self();
        }

        public T fechaNacimiento (LocalDate fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
            return self();
        }

        public T especie (Especie especie) {
            this.especie = especie;
            return self();
        }

        public T domestico (boolean domestico) {
            this.domestico = domestico;
            return self();
        }

        public T cliente (Cliente cliente) {
            this.cliente = cliente;
            return self();
        }

        public T tipoAnimal (TipoAnimal tipoAnimal) {
            this.tipoAnimal = tipoAnimal;
            return self();
        }

        protected abstract T self();

        public abstract Animal build();
    }


    public String getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(String idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public boolean getDomestico() {
        return domestico;
    }

    public void setDomestico(boolean domestico) {
        this.domestico = domestico;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public TipoAnimal getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(TipoAnimal tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }
}
