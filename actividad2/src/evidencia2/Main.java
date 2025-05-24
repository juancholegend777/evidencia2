//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

package evidencia2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        persona[] personas = new persona[5];

        System.out.println("Captura de datos de 5 personas:");
        for (int i = 0; i < 5; i++) {
            System.out.println("\nPersona " + (i + 1));
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();

            System.out.print("Género (Masculino/Femenino): ");
            String genero = scanner.nextLine();

            System.out.print("Edad: ");
            int edad = Integer.parseInt(scanner.nextLine());

            personas[i] = new persona(nombre, apellido, genero, edad);
        }

        mostrarNombreYGenero(personas);
        mostrarPromedioEdad(personas);
        mostrarCantidadGenero(personas);
    }

    public static void mostrarNombreYGenero(persona[] personas) {
        System.out.println("\n--- Nombre y Género de las personas ---");
        for (persona p : personas) {
            System.out.println("Nombre: " + p.getNombre() + ", Género: " + p.getGenero());
        }
    }

    public static void mostrarPromedioEdad(persona[] personas) {
        int suma = 0;
        for (persona p : personas) {
            suma += p.getEdad();
        }
        double promedio = (double) suma / personas.length;
        System.out.println("\nPromedio de edades: " + promedio);
    }

    public static void mostrarCantidadGenero(persona[] personas) {
        int masculino = 0, femenino = 0;
        for (persona p : personas) {
            if (p.getGenero().equalsIgnoreCase("Masculino")) {
                masculino++;
            } else if (p.getGenero().equalsIgnoreCase("Femenino")) {
                femenino++;
            }
        }
        System.out.println("\nCantidad de personas Masculinas: " + masculino);
        System.out.println("Cantidad de personas Femeninas: " + femenino);
    }
}
