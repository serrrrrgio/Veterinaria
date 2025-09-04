import java.time.LocalDate;


public class Ave extends Animal implements IAnimal{

    private double embergadura;
    private String tipoPico;


    public Ave(String idAnimal, String nombre, double peso, LocalDate fechaNacimiento,
               Especie especie, Boolean domestico, Cliente cliente, TipoAnimal tipoAnimal,
               double embergadura, String tipoPico) {

        super(idAnimal, nombre, peso, fechaNacimiento, especie, domestico, cliente, tipoAnimal);

        this.embergadura = embergadura;
        this.tipoPico = tipoPico;
    }


    public double getEmbergadura() {
        return embergadura;
    }

    public void setEmbergadura(double embergadura) {
        this.embergadura = embergadura;
    }

    public String getTipoPico() {
        return tipoPico;
    }

    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }
}
