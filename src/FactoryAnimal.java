import java.time.LocalDate;

public class FactoryAnimal {
    public static Animal crearAnimal(String idAnimal, String nombre, double peso, LocalDate fechaNacimiento, Especie especie, Boolean domestico, Cliente cliente, TipoAnimal tipoAnimal) {
        switch (tipoAnimal){
            case MAMIFERO :
                return Mamifero.crearAnimal(idAnimal,  nombre,  peso,  fechaNacimiento,  especie,  domestico,  cliente, tipoAnimal);
            case AVE : return
                    Ave.crearAnimal(idAnimal,  nombre,  peso,  fechaNacimiento,  especie,  domestico,  cliente, tipoAnimal);
            case REPTIL :
                return Reptil.crearAnimal(idAnimal,  nombre,  peso,  fechaNacimiento,  especie,  domestico,  cliente, tipoAnimal);

            default:
                throw new IllegalArgumentException("Tipo de animal no soportado: " + tipoAnimal);
        }

    }

    /* Switch mas actual
    return switch (tipoAnimal) {
    case MAMIFERO -> Mamifero.crearAnimal(idAnimal, nombre, peso, fechaNacimiento, especie, domestico, cliente, tipoAnimal);
    case AVE -> Ave.crearAnimal(idAnimal, nombre, peso, fechaNacimiento, especie, domestico, cliente, tipoAnimal);
    case REPTIL -> Reptil.crearAnimal(idAnimal, nombre, peso, fechaNacimiento, especie, domestico, cliente, tipoAnimal);
};
     */
}


