package Modelo.Entidades.Personas;

public class Veterinario extends Persona{

    private String especialidad;
    private int anosExperiencia;

    public Veterinario(Builder builder) {

        super(builder);

        this.especialidad = builder.especialidad;
        this.anosExperiencia = builder.anosExperiencia;
    }

    public static class Builder extends Persona.Builder<Builder>{

        private String especialidad;
        private int anosExperiencia;

        public Builder especialidad(String especialidad) {
            this.especialidad = especialidad;
            return this;
        }

        public Builder anosExperiencia(int anosExperiencia) {
            this.anosExperiencia = anosExperiencia;
            return this;
        }

        @Override
        protected Builder self(){
            return this;
        }

        @Override
        public Veterinario build(){
            return new Veterinario(this);
        }

    }


    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
