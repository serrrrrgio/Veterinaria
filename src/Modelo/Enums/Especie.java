package Modelo.Enums;

public enum Especie {

    // Mamíferos

    PERRO(TipoAnimal.MAMIFERO),
    GATO(TipoAnimal.MAMIFERO),
    CABALLO(TipoAnimal.MAMIFERO),
    VACA(TipoAnimal.MAMIFERO),
    CERDO(TipoAnimal.MAMIFERO),
    OVEJA(TipoAnimal.MAMIFERO),
    CABRA(TipoAnimal.MAMIFERO),
    CONEJO(TipoAnimal.MAMIFERO),
    HURON(TipoAnimal.MAMIFERO),
    COBAYA(TipoAnimal.MAMIFERO),
    RATON(TipoAnimal.MAMIFERO),
    CHINCHILLA(TipoAnimal.MAMIFERO),

    // Aves

    CANARIO(TipoAnimal.AVE),
    PERIQUITO(TipoAnimal.AVE),
    LORO(TipoAnimal.AVE),
    GALLINA(TipoAnimal.AVE),
    PATO(TipoAnimal.AVE),
    GANSO(TipoAnimal.AVE),
    PAVO(TipoAnimal.AVE),

    // Peces

    PEZ(TipoAnimal.PEZ),
    GOLDEN_FISH(TipoAnimal.PEZ),
    NEON(TipoAnimal.PEZ),
    BETTA(TipoAnimal.PEZ),
    GUPPY(TipoAnimal.PEZ),
    CAMARON(TipoAnimal.PEZ),

    // Reptiles

    TORTUGA(TipoAnimal.REPTIL),
    IGUANA(TipoAnimal.REPTIL),
    SERPIENTE_NO_PELIGROSA(TipoAnimal.REPTIL),

    // Anfibios

    RANA(TipoAnimal.ANFIBIO),
    SAPO(TipoAnimal.ANFIBIO),
    SALAMANDRA(TipoAnimal.ANFIBIO);


    private final TipoAnimal tipo;

    Especie(TipoAnimal tipo) {
        this.tipo = tipo;
    }

    public TipoAnimal getTipo() {
        return tipo;
    }
}
