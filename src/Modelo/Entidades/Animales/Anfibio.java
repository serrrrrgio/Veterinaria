package Modelo.Entidades.Animales;

public class Anfibio extends Animal  {

    private boolean esVenenoso;
    private String habitat;

    private Anfibio (Builder builder){

        super(builder);

        this.esVenenoso = builder.esVenenoso;
        this.habitat = builder.habitat;
    }

    public static class Builder extends Animal.Builder<Builder>{

        private boolean esVenenoso;
        private String habitat;

        public Builder esVenenoso(boolean esVenenoso){
            this.esVenenoso = esVenenoso;
            return this;
        }

        public Builder habitat(String habitat){
            this.habitat = habitat;
            return this;
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public Animal build(){
            return new Anfibio(this);
        }
    }


    public boolean isEsVenenoso() {
        return esVenenoso;
    }

    public void setEsVenenoso(boolean esVenenoso) {
        this.esVenenoso = esVenenoso;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}
