import java.time.LocalDate;

public class FactoryAnimal {
    public static Animal crearAnimal(String idAnimal,
                                     String nombre,
                                     double peso,
                                     LocalDate fechaNacimiento,
                                     Especie especie,
                                     Boolean domestico,
                                     Cliente cliente,
                                     TipoAnimal tipoAnimal,
                                     Object... params) {
        switch (tipoAnimal){
            case MAMIFERO :
                if (params[0] instanceof String && params[1] instanceof Boolean && params[2] instanceof Integer){
                    String tipoPelaje = (String)params[0];
                    boolean esDomestico = (Boolean)params[1];
                    int numeroCriasCamada = (Integer)params[2];
                    return new Mamifero (idAnimal,
                                        nombre,
                                        peso,
                                        fechaNacimiento,
                                        especie,
                                        domestico,
                                        cliente,
                                        tipoAnimal,
                                        tipoPelaje,
                                        esDomestico,
                                        numeroCriasCamada);
                }else {
                    throw new IllegalArgumentException("Parámetros inválidos para crear un Mamifero");
                }
            case AVE :
                if (params[0] instanceof Double && params[1] instanceof String) {
                    double embergadura = (double) params[0];
                    String tipoPico = (String) params[1];  // 👈 atributo exclusivo de las aves
                    return new Ave( idAnimal,
                                    nombre,
                                    peso,
                                    fechaNacimiento,
                                    especie,
                                    domestico,
                                    cliente,
                                    tipoAnimal,
                                    embergadura,
                                    tipoPico);
                } else {
                    throw new IllegalArgumentException("Parámetros inválidos para crear un Ave");
                }
            case REPTIL :
                if (params[0] instanceof Boolean && params[1] instanceof Integer) {
                    boolean esVenenoso = (Boolean)params[0];
                    int temperaturaCorporalOptima = (Integer)params[1];
                    return new Reptil ( idAnimal,
                                        nombre,
                                        peso,
                                        fechaNacimiento,
                                        especie,
                                        domestico,
                                        cliente,
                                        tipoAnimal,
                                        esVenenoso,
                                        temperaturaCorporalOptima);
                }
            default:
                throw new IllegalArgumentException("Tipo de animal no soportado: " + tipoAnimal);
        }
    }
}



    /* Switch mas actual
    return switch (tipoAnimal) {
    case MAMIFERO -> Mamifero.crearAnimal(idAnimal, nombre, peso, fechaNacimiento, especie, domestico, cliente, tipoAnimal);
    case AVE -> Ave.crearAnimal(idAnimal, nombre, peso, fechaNacimiento, especie, domestico, cliente, tipoAnimal);
    case REPTIL -> Reptil.crearAnimal(idAnimal, nombre, peso, fechaNacimiento, especie, domestico, cliente, tipoAnimal);
    };
     */


