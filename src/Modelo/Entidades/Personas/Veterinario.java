package Modelo.Entidades.Personas;

public class Veterinario extends Persona{

    private String especialidad;
    private int anosExperiencia;

    public Veterinario(String id, String nombre, String direccion,
                       String telefono, String email, String especialidad, int anosExperiencia) {
        super(id, nombre, direccion, telefono, email);
        this.especialidad = especialidad;
        this.anosExperiencia = anosExperiencia;
    }


    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int aniosExperiencia) {
        this.anosExperiencia = aniosExperiencia;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
