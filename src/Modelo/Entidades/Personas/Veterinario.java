package Modelo.Entidades.Personas;

public class Veterinario extends Persona{

    private String idVeterinario;
    private String especialidad;
    private int aniosExperiencia;

    public Veterinario(String idVeterinario, String nombre, String direccion,
                       String telefono, String email, String especialidad, int aniosExperiencia) {
        super(nombre, direccion, telefono, email);
        this.idVeterinario = idVeterinario;
        this.especialidad = especialidad;
        this.aniosExperiencia = aniosExperiencia;
    }


    public String getIdVeterinario() {
        return idVeterinario;
    }

    public void setIdVeterinario(String idVeterinario) {
        this.idVeterinario = idVeterinario;
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
