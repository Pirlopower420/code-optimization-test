import java.util.Scanner;

public class AgeValidation {
    public static void main(String[] args) {
        // Constante para el límite de edad
        final int LIMITE_EDAD = 18;

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
    }
}
