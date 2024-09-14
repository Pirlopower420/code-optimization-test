import java.util.Scanner;

public class AgeValidation {

    // Constante para el límite de edad
    private static final int LIMITE_EDAD = 18;

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese su edad
        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();

        // Validar el acceso basado en la edad ingresada
        if (edad >= LIMITE_EDAD) {
            System.out.println("Acceso concedido"); // Mensaje si la edad es mayor o igual al límite
        } else {
            System.out.println("Acceso denegado");  // Mensaje si la edad es menor al límite
        }

        // Cerrar el objeto Scanner para liberar recursos
        scanner.close();
    }
}
