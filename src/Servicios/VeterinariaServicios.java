package Servicios;

import Modelo.Entidades.Personas.Cliente;
import Modelo.Entidades.Veterinaria;

public class VeterinariaServicios {

    private static final Veterinaria veterinaria = Veterinaria.getInstance();

    public static Cliente buscarClienteId(String id) {
        for (Cliente cliente : veterinaria.getClientes()) {
            if (cliente.getId().equals(id)) {
                return cliente;
            }
        }
        return null;
    }
}