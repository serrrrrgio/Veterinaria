import java.time.LocalDate;

public abstract class Animal {
    protected String idAnimal;
    protected String nombre;
    protected double peso;
    protected LocalDate fechaNacimiento;
    protected Especie especie;
    protected Boolean domestico;
    protected Cliente cliente;
    protected TipoAnimal tipoAnimal;

    public Animal(String idAnimal, String nombre, double peso, LocalDate fechaNacimiento, Especie especie, Boolean domestico, Cliente cliente, TipoAnimal tipoAnimal) {
        this.idAnimal = idAnimal;
        this.nombre = nombre;
        this.peso = peso;
        this.fechaNacimiento = fechaNacimiento;
        this.especie = especie;
        this.domestico = domestico;
        this.cliente = cliente;
        this.tipoAnimal = tipoAnimal;
    }

    public String getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(String idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public Boolean getDomestico() {
        return domestico;
    }

    public void setDomestico(Boolean domestico) {
        this.domestico = domestico;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public TipoAnimal getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(TipoAnimal tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }
}
