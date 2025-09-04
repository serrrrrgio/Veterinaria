package Modelo.Entidades.Animales;

public class Reptil extends Animal {

    private boolean esVenenoso;
    private double temperaturaCorporalOptima;

    private Reptil (Builder builder) {
        super(builder);
        this.esVenenoso = builder.esVenenoso;
        this.temperaturaCorporalOptima = builder.temperaturaCorporalOptima;
    }


    public static class Builder extends Animal.Builder<Builder> {
        private boolean esVenenoso;
        private double temperaturaCorporalOptima;

        public Builder esVenenoso(boolean esVenenoso){
            this.esVenenoso = esVenenoso;
            return this;
        }

        public Builder temperaturaCorporalOptima(double temperaturaCorporalOptima){
            this.temperaturaCorporalOptima = temperaturaCorporalOptima;
            return this;
        }


        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public Animal build() {
            return new Reptil(this);
        }

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
