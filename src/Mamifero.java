import java.time.LocalDate;

public class Mamifero extends Animal implements IAnimal {

    private String tipoPelaje;
    private boolean esDomestico;
    private int numeroCriasCamada;

    public Mamifero(String idAnimal, String nombre, double peso, LocalDate fechaNacimiento,
                    Especie especie, Boolean domestico, Cliente cliente, TipoAnimal tipoAnimal,
                    String tipoPelaje, boolean esDomestico, int numeroCriasCamada) {

        super(idAnimal, nombre, peso, fechaNacimiento, especie, domestico, cliente, tipoAnimal);

        this.tipoPelaje = tipoPelaje;
        this.esDomestico = esDomestico;
        this.numeroCriasCamada = numeroCriasCamada;
    }


    public String getTipoPelaje() {
        return tipoPelaje;
    }

    public void setTipoPelaje(String tipoPelaje) {
        this.tipoPelaje = tipoPelaje;
    }

    public boolean isProduceLeche() {
        return esDomestico;
    }

    public void setProduceLeche(boolean produceLeche) {
        this.esDomestico = produceLeche;
    }

    public int getNumeroCriasCamada() {
        return numeroCriasCamada;
    }

    public void setNumeroCriasCamada(int numeroCriasCamada) {
        this.numeroCriasCamada = numeroCriasCamada;
    }
}
