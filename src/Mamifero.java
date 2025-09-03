import java.time.LocalDate;

public class Mamifero extends Animal {

    private Mamifero(String idAnimal, String nombre, double peso, LocalDate fechaNacimiento, Especie especie, Boolean domestico, Cliente cliente, TipoAnimal tipoAnimal) {
        super(idAnimal,  nombre,  peso,  fechaNacimiento,  especie,  domestico,  cliente, tipoAnimal);
    }

    public static Animal crearAnimal(String idAnimal, String nombre, double peso, LocalDate fechaNacimiento, Especie especie, Boolean domestico, Cliente cliente, TipoAnimal tipoAnimal) {
        return new Mamifero(idAnimal,  nombre,  peso,  fechaNacimiento,  especie,  domestico,  cliente, tipoAnimal);
    }
}
