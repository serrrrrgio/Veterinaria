public enum Especie {
    PERRO(TipoAnimal.MAMIFERO),
    GATO(TipoAnimal.MAMIFERO),
    CABALLO(TipoAnimal.MAMIFERO),
    ELEFANTE(TipoAnimal.MAMIFERO),
    MURCIELAGO(TipoAnimal.MAMIFERO),

    TORTUGA(TipoAnimal.REPTIL),
    IGUANA(TipoAnimal.REPTIL),
    COCODRILO(TipoAnimal.REPTIL),
    SERPIENTE(TipoAnimal.REPTIL),

    LORO(TipoAnimal.AVE),
    AGUILA(TipoAnimal.AVE),
    PINGÜINO(TipoAnimal.AVE),
    BUHO(TipoAnimal.AVE);

    private final TipoAnimal tipo;

    Especie(TipoAnimal tipo) {
        this.tipo = tipo;
    }
}
