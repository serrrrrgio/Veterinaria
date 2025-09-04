import Modelo.Entidades.Animales.*;
import Modelo.Entidades.Personas.Cliente;
import Modelo.Enums.Especie;
import Modelo.Enums.TipoAnimal;

import java.time.LocalDate;
import java.util.Map;

public class FactoryAnimal {

    public static Animal crearAnimal(String idAnimal,
                                     String nombre,
                                     double peso,
                                     LocalDate fechaNacimiento,
                                     Especie especie,
                                     boolean domestico,
                                     Cliente cliente,
                                     TipoAnimal tipoAnimal,
                                     Map<String, Object> atributosClase) {

        switch (tipoAnimal){
            case MAMIFERO :
                return new Mamifero.Builder().idAnimal(idAnimal)
                        .nombre(nombre)
                        .peso(peso)
                        .fechaNacimiento(fechaNacimiento)
                        .especie(especie)
                        .domestico(domestico)
                        .cliente(cliente)
                        .tipoAnimal(tipoAnimal)
                        .tipoPelaje((String) atributosClase.get("tipoPelaje"))
                        .numeroCriasCamada((int) atributosClase.get("numeroCriasCamada"))
                        .build();

            case AVE :
                return new Ave.Builder().
                        idAnimal(idAnimal)
                        .nombre(nombre)
                        .peso(peso)
                        .fechaNacimiento(fechaNacimiento)
                        .especie(especie)
                        .domestico(domestico)
                        .cliente(cliente)
                        .tipoAnimal(tipoAnimal)
                        .envergadura((double) atributosClase.get("envergadura"))
                        .tipoPico((String) atributosClase.get("tipoPico"))
                        .build();

            case REPTIL :
                return new Reptil.Builder().
                        idAnimal(idAnimal)
                        .nombre(nombre)
                        .peso(peso)
                        .fechaNacimiento(fechaNacimiento)
                        .especie(especie)
                        .domestico(domestico)
                        .cliente(cliente)
                        .tipoAnimal(tipoAnimal)
                        .esVenenoso((boolean) atributosClase.get("esVenenoso"))
                        .temperaturaCorporalOptima((double) atributosClase.get("temperaturaCorporalOptima"))
                        .build();

            default:
                throw new IllegalArgumentException("Tipo de animal no soportado: " + tipoAnimal);
        }
    }
}



    /* Switch mas actual
    return switch (tipoAnimal) {
    case MAMIFERO -> Modelo.Entidades.Animales.Mamifero.crearAnimal();
    case AVE -> Modelo.Entidades.Animales.Ave.crearAnimal();
    case REPTIL -> Modelo.Entidades.Animales.Reptil.crearAnimal();
    };
     */


