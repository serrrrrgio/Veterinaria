package Modelo.Entidades.Personas;

public abstract class Persona {

    protected String id;
    protected String nombre;
    protected String direccion;
    protected String telefono;
    protected String email;

    public Persona(Builder<?> builder) {

        this.id = builder.id;
        this.nombre = builder.nombre;
        this.direccion = builder.direccion;
        this.telefono = builder.telefono;
        this.email = builder.email;
    }

    public static abstract class Builder<T extends Builder<T>>{

        protected String id;
        protected String nombre;
        protected String direccion;
        protected String telefono;
        protected String email;

        public T id(String id) {
            this.id = id;
            return self();
        }

        public T nombre(String nombre) {
            this.nombre = nombre;
            return self();
        }

        public T direccion(String direccion) {
            this.direccion = direccion;
            return self();
        }

        public T telefono(String telefono) {
            this.telefono = telefono;
            return self();
        }

        public T email(String email) {
            this.email = email;
            return self();
        }

        protected abstract T self();

        public abstract Persona build();

    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
