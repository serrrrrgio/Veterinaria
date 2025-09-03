import java.time.LocalDate;

public class Ave extends Animal {

    private Ave(String idAnimal, String nombre, double peso, LocalDate fechaNacimiento, Especie especie, Boolean domestico, Cliente cliente, TipoAnimal tipoAnimal) {
        super(idAnimal,  nombre,  peso,  fechaNacimiento,  especie,  domestico,  cliente, tipoAnimal);
    }

    public static Animal crearAnimal(String idAnimal, String nombre, double peso, LocalDate fechaNacimiento, Especie especie, Boolean domestico, Cliente cliente, TipoAnimal tipoAnimal) {
        return new Ave(idAnimal,  nombre,  peso,  fechaNacimiento,  especie,  domestico,  cliente, tipoAnimal);
    }
}
