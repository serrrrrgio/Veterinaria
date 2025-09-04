package Modelo.Entidades.Animales;


import Modelo.Interfaces.IAnimal;

public class Ave extends Animal implements IAnimal {

    private double envergadura;
    private String tipoPico;


    private Ave(Builder builder) {
        super(builder);
        this.envergadura = builder.envergadura;
        this.tipoPico = builder.tipoPico;
    }


    public static class Builder extends Animal.Builder<Builder> {
        private double envergadura;
        private String tipoPico;

        public Builder envergadura(double envergadura){
            this.envergadura = envergadura;
            return this;
        }

        public Builder tipoPico(String tipoPico){
            this.tipoPico = tipoPico;
            return this;
        }


        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public Animal build() {
            return new Ave(this);
        }

    }

    public double getEnvergadura() {
        return envergadura;
    }

    public void setEnvrgadura(double envergadura) {
        this.envergadura = envergadura;
    }

    public String getTipoPico() {
        return tipoPico;
    }

    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }
}
