// Nombre alumno: Alex Fernandez
// Mini Ejercicios Java



/*
1. Hola Mundo:
Escribe un programa que imprima "Hola, mundo" en la consola. (DONE!)
Modifica el programa para que solicite al usuario su nombre y salude personalmente (ej. "Hola, Ana").
Expande el programa para que después de saludar, pregunte al usuario cómo está y responda a su respuesta.
Agrega una función que repita el saludo tres veces utilizando un bucle `while`.
 */

/*
public class Greeting {
    public static void Main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);  // Crear una instancia de Scanner

        System.out.print("Por favor, introduce tu nombre: ");  // Pedir al usuario su nombre
        String name = scanner.nextLine();  // Leer el nombre del usuario

        System.out.println("¡Hola, " + name + "!");  // Saludar al usuario

        scanner.close();  // Cerrar el scanner

        Scanner scanner2 = new Scanner(System.in);

        String estado = scanner2.nextLine();
    }
}
*/
import java.util.Scanner;  // Importar la clase Scanner

public class Main {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Por favor, introduce tu nombre: ");
        String UserName = scanner1.nextLine();
        System.out.println("¡Hola, " + UserName + "!");

        /*
        scanner1.close();

        String name = "mundo";
        name = "Yenot";
        System.out.println("Hola, " + name);
        */


        int i = 0;
        while (i < 3) {
            System.out.println("¡Hola, " + UserName + "!");
            i++;
        }

        System.out.println(UserName + ", el número de letras de tu nombre es de: " + UserName.length() + " letras.");

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Cuéntanos " + UserName + ", qué tal tu día? Bien, Regular o Mal?");
        String estado = scanner2.nextLine();
        if (estado.equals("Bien")) {
            System.out.println("Me alegro!");
        }   else if (estado.equals("Regular")) {
            System.out.println("Oh, bueno! Ni tan mal!");
        }   else if (estado.equals("Mal")) {
            System.out.println("Venga, ánimo!");
        }   else {
            System.out.println("No te entiendo!");
        }

        scanner1.close();
        scanner2.close();


        int time = 16;
        if (time < 10) {
            System.out.println("Buenos días.");
        }   else if (time < 18) {
            System.out.println("Buenas tardes.");
        }   else {
            System.out.println("Buenas noches.");
        }
    }
}


