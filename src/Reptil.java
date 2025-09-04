import java.time.LocalDate;

public class Reptil extends Animal {

    private boolean esVenenoso;
    private double temperaturaCorporalOptima;

    public Reptil(String idAnimal, String nombre, double peso, LocalDate fechaNacimiento,
                  Especie especie, Boolean domestico, Cliente cliente, TipoAnimal tipoAnimal,
                  boolean esVenenoso, double temperaturaCorporalOptima) {

        super(idAnimal, nombre, peso, fechaNacimiento, especie, domestico, cliente, tipoAnimal);

        this.esVenenoso = esVenenoso;
        this.temperaturaCorporalOptima = temperaturaCorporalOptima;
    }


    public boolean isEsVenenoso() {
        return esVenenoso;
    }

    public void setEsVenenoso(boolean esVenenoso) {
        this.esVenenoso = esVenenoso;
    }

    public double getTemperaturaCorporalOptima() {
        return temperaturaCorporalOptima;
    }

    public void setTemperaturaCorporalOptima(double temperaturaCorporalOptima) {
        this.temperaturaCorporalOptima = temperaturaCorporalOptima;
    }
}
