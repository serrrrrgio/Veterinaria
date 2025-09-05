package Modelo.Entidades;

import Modelo.Entidades.Animales.Animal;
import Modelo.Entidades.Animales.FactoryAnimal;
import Modelo.Entidades.Personas.Cliente;
import Modelo.Entidades.Personas.Persona;
import Modelo.Entidades.Personas.Veterinario;
import Modelo.Enums.Especie;
import Modelo.Enums.TipoAnimal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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


        /* Se Crean y Agregan los Clientes */

        Cliente cliente1 = new Cliente.Builder()
                .id("C1")
                .nombre("Juan Pérez")
                .direccion("Calle 123")
                .telefono("3001234567")
                .email("juan@mail.com")
                .fechaRegistro(LocalDate.now())
                .nivelFidelidad(3)
                .build();

        Cliente cliente2 = new Cliente.Builder()
                .id("C2")
                .nombre("Ana Gómez")
                .direccion("Carrera 45")
                .telefono("3109876543")
                .email("ana@mail.com")
                .fechaRegistro(LocalDate.now())
                .nivelFidelidad(5)
                .build();

        Cliente cliente3 = new Cliente.Builder()
                .id("C3")
                .nombre("Luis Torres")
                .direccion("Diagonal 67")
                .telefono("3205551234")
                .email("luis@mail.com")
                .fechaRegistro(LocalDate.now())
                .nivelFidelidad(2)
                .build();

        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);

        /* Se Crean y Agregan los Veterinarios */

        Veterinario vet1 = new Veterinario.Builder()
                .id("V1")
                .nombre("Carlos Ruiz")
                .direccion("Av. Siempre Viva")
                .telefono("3151234567")
                .email("carlos@mail.com")
                .especialidad("Cirugía")
                .anosExperiencia(5)
                .build();

        Veterinario vet2 = new Veterinario.Builder()
                .id("V2")
                .nombre("María López")
                .direccion("Calle 89")
                .telefono("3119998877")
                .email("maria@mail.com")
                .especialidad("Dermatología")
                .anosExperiencia(7)
                .build();

        Veterinario vet3 = new Veterinario.Builder()
                .id("V3")
                .nombre("Andrés Méndez")
                .direccion("Carrera 101")
                .telefono("3174445566")
                .email("andres@mail.com")
                .especialidad("Medicina General")
                .anosExperiencia(3)
                .build();

        veterinarios.add(vet1);
        veterinarios.add(vet2);
        veterinarios.add(vet3);

        /* Se Crean y Agregan los Animales */

        // Animales de Cliente 1

        Animal a1 = FactoryAnimal.crearAnimal(
                "A1", "Firulais", 12.5,
                LocalDate.of(2020, 5, 10),
                Especie.PERRO, true, "C1",
                TipoAnimal.MAMIFERO,
                Map.of("tipoPelaje", "Corto", "numeroCriasCamada", 5)
        );

        Animal a2 = FactoryAnimal.crearAnimal(
                "A2", "Mishi", 4.2,
                LocalDate.of(2021, 3, 14),
                Especie.GATO, true, "C1",
                TipoAnimal.MAMIFERO,
                Map.of("tipoPelaje", "Largo", "numeroCriasCamada", 3)
        );

        Animal a3 = FactoryAnimal.crearAnimal(
                "A3", "Piolín", 0.8,
                LocalDate.of(2022, 7, 1),
                Especie.LORO, false, "C1",
                TipoAnimal.AVE,
                Map.of("tipoPico", "Corto", "envergaduraAlas", 15.0)
        );

        // Animales de Cliente 2

        Animal a4 = FactoryAnimal.crearAnimal(
                "A4", "Rex", 30.0,
                LocalDate.of(2019, 11, 20),
                Especie.PERRO, true, "C2",
                TipoAnimal.MAMIFERO,
                Map.of("tipoPelaje", "Duro", "numeroCriasCamada", 6)
        );

        Animal a5 = FactoryAnimal.crearAnimal(
                "A5", "Coco", 1.2,
                LocalDate.of(2020, 8, 5),
                Especie.GALLINA, true, "C2",
                TipoAnimal.AVE,
                Map.of("tipoPico", "Curvo", "envergaduraAlas", 22.0)
        );

        Animal a6 = FactoryAnimal.crearAnimal(
                "A6", "Nemo", 0.2,
                LocalDate.of(2021, 9, 12),
                Especie.PEZ, false, "C2",
                TipoAnimal.PEZ,
                Map.of("tipoAgua", "Dulce", "colorPrincipal", "Naranja")
        );

        // Animales de Cliente 3

        Animal a7 = FactoryAnimal.crearAnimal(
                "A7", "Max", 20.0,
                LocalDate.of(2018, 4, 2),
                Especie.PERRO, true, "C3",
                TipoAnimal.MAMIFERO,
                Map.of("tipoPelaje", "Corto", "numeroCriasCamada", 7)
        );

        Animal a8 = FactoryAnimal.crearAnimal(
                "A8", "Luna", 3.5,
                LocalDate.of(2021, 12, 25),
                Especie.GATO, true, "C3",
                TipoAnimal.MAMIFERO,
                Map.of("tipoPelaje", "Medio", "numeroCriasCamada", 4)
        );

        Animal a9 = FactoryAnimal.crearAnimal(
                "A9", "Blue", 0.5,
                LocalDate.of(2022, 6, 18),
                Especie.PEZ, false, "C3",
                TipoAnimal.PEZ,
                Map.of("tipoAgua", "Salada", "colorPrincipal", "Azul")
        );


        animales.addAll(List.of(a1, a2, a3, a4, a5, a6, a7, a8, a9));


        cliente1.getAnimales().addAll(List.of(a1, a2, a3));
        cliente2.getAnimales().addAll(List.of(a4, a5, a6));
        cliente3.getAnimales().addAll(List.of(a7, a8, a9));

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
