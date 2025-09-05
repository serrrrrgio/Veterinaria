package Modelo.Entidades;

import Modelo.Entidades.Animales.Animal;
import Modelo.Entidades.Personas.Cliente;
import Modelo.Entidades.Personas.Veterinario;

import java.util.ArrayList;
import java.util.List;

public class Veterinaria {

    private String nombre;
    private static Veterinaria instance;
    private List<Veterinario> veterinarios;
    private List<Animal> animales;
    private List<Cliente> clientes;

    private Veterinaria(String nombre) {
        this.nombre = nombre;
        this.veterinarios = new ArrayList<>();
        this.animales = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public static Veterinaria getInstance(){
        if(instance == null){
            instance = new Veterinaria("Veterinaria Miguelito");
        }
        return instance;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Veterinario> getVeterinarios() {
        return veterinarios;
    }

    public void setVeterinarios(List<Veterinario> veterinarios) {
        this.veterinarios = veterinarios;
    }

    public List<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(List<Animal> animales) {
        this.animales = animales;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
}
