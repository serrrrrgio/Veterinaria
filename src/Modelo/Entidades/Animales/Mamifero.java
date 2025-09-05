package Modelo.Entidades.Animales;


public class Mamifero extends Animal{

    private String tipoPelaje;
    private int numeroCriasCamada;

    private Mamifero(Builder builder) {

        super(builder);

        this.tipoPelaje = builder.tipoPelaje;
        this.numeroCriasCamada = builder.numeroCriasCamada;
    }


    public static class Builder extends Animal.Builder<Builder> {

        private String tipoPelaje;
        private int numeroCriasCamada;

        public Builder tipoPelaje(String tipoPelaje){
            this.tipoPelaje = tipoPelaje;
            return this;
        }

        public Builder numeroCriasCamada(int numeroCriasCamada){
            this.numeroCriasCamada = numeroCriasCamada;
            return this;
        }


        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public Animal build() {
            return new Mamifero(this);
        }

    }

    public String getTipoPelaje() {
        return tipoPelaje;
    }

    public void setTipoPelaje(String tipoPelaje) {
        this.tipoPelaje = tipoPelaje;
    }

    public int getNumeroCriasCamada() {
        return numeroCriasCamada;
    }

    public void setNumeroCriasCamada(int numeroCriasCamada) {
        this.numeroCriasCamada = numeroCriasCamada;
    }
}
