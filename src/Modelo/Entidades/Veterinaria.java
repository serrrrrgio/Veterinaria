package Modelo.Entidades;

import Modelo.Entidades.Animales.Animal;
import Modelo.Entidades.Personas.Veterinario;

import java.util.ArrayList;
import java.util.List;

public class Veterinaria {

    private String nombre;
    private static Veterinaria instance;
    private List<Veterinario> veterinarios;
    private List<Animal> animales;

    private Veterinaria(String nombre, List<Veterinario> veterinarios, List<Animal> animales) {
        this.nombre = nombre;
        this.veterinarios = new ArrayList<>();
        this.animales = new ArrayList<>();
    }
}
