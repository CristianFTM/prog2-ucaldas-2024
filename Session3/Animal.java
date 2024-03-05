import java.util.Scanner;

public class Animal {
    Scanner sc = new Scanner(System.in);

    public String name_animal = "";
    public String type_animal = "";
    public String breed_animal = "";

    public void inputDataAnimal() {
        System.out.println("Ingrese el nombre del animal");
        name_animal = sc.nextLine();

        System.out.println("Ingrese el tipo del animal ej: gato, perro... ");
        type_animal = sc.nextLine();

        System.out.println("ingresa raza del animal");
        breed_animal = sc.nextLine();

    }

}