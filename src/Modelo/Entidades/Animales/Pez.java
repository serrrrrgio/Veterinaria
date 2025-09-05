package Modelo.Entidades.Animales;


public class Pez extends Animal{

    private String tipoAgua;
    private double tamanoMaximo;

    private Pez(Builder builder){

        super(builder);

        this.tipoAgua = builder.tipoAgua;
        this.tamanoMaximo = builder.tamanoMaximo;
    }


    public static class Builder extends Animal.Builder<Builder>{

        private String tipoAgua;
        private double tamanoMaximo;

        public Builder tipoAgua (String tipoAgua){
            this.tipoAgua = tipoAgua;
            return this;
        }

        public Builder tamanoMaximo(double tamanoMaximo){
            this.tamanoMaximo = tamanoMaximo;
            return this;
        }

        @Override
        protected Pez.Builder self() {
            return this;
        }

        @Override
        public Animal build() {
            return new Pez(this);
        }
    }


    public double getTamanoMaximo() {
        return tamanoMaximo;
    }

    public void setTamanoMaximo(double tamanoMaximo) {
        this.tamanoMaximo = tamanoMaximo;
    }

    public String getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }
}
