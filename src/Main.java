import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente(
                "Juan Pérez",
                "Calle 123",
                "C001",
                "3001234567",
                "juan@mail.com",
                LocalDate.now()
        );


        Animal perro = FactoryAnimal.crearAnimal(
                "A001",
                "Firulais",
                25.0,
                LocalDate.of(2020, 5, 10),
                Especie.PERRO,
                true,
                cliente,
                TipoAnimal.MAMIFERO
        );


        Animal loro = FactoryAnimal.crearAnimal(
                "A002",
                "Pepito",
                1.5,
                LocalDate.of(2021, 3, 15),
                Especie.LORO,
                true,
                cliente,
                TipoAnimal.AVE
        );


        Animal tortuga = FactoryAnimal.crearAnimal(
                "A003",
                "Rocky",
                5.0, LocalDate.of(2019, 8, 20),
                Especie.TORTUGA,
                false,
                cliente,
                TipoAnimal.REPTIL
        );


        System.out.println("Mamífero: " + perro.nombre + " (" + perro.especie + ")");
        System.out.println("Ave: " + loro.nombre + " (" + loro.especie + ")");
        System.out.println("Reptil: " + tortuga.nombre + " (" + tortuga.especie + ")");
    }
}