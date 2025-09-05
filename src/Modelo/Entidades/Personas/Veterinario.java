package Modelo.Entidades.Personas;

public class Veterinario extends Persona{

    private String especialidad;
    private int aniosExperiencia;

    public Veterinario(String id, String nombre, String direccion,
                       String telefono, String email, String especialidad, int aniosExperiencia) {
        super(id, nombre, direccion, telefono, email);
        this.especialidad = especialidad;
        this.aniosExperiencia = aniosExperiencia;
    }


    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
