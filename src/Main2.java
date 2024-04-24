// Nombre alumno: Alex Fernandez
// Mini Ejercicios Java



/*
2. Variables y Tipos de Datos:
Declara e inicializa variables de diferentes tipos (int, double, String).
Imprime estas variables.
Realiza y muestra conversiones entre tipos de datos (casting).
Escribe un programa que calcule y muestre el área de un rectángulo usando variables para los lados.
Crea un programa que convierta grados Fahrenheit a Celsius y viceversa.
 */


import java.util.Scanner;  // Importar la clase Scanner

public class Main2 {
    public static void main(String[] args) {
        // Declarar, inicializar e imprimir variables de diferentes tipos
        String myText = "Yellow!";
        int myIntNum = 99;
        float myFloatNum = 99.8f;
        double myDoubleNum = 99.99;
        char myLetter = 'W';
        boolean myBool = true;

        System.out.println(myText);
        System.out.println(myIntNum);
        System.out.println(myFloatNum);
        System.out.println(myDoubleNum);
        System.out.println(myLetter);
        System.out.println(myBool + "\n");

        // Calcular área rectángulo usando variables para los lados
        double base = 12;
        double altura = 5;
        System.out.println("El ancho y alto de mi recángulo es " + base + " y " + altura);

        double area = base * altura;
        System.out.println("El área total del rectángulo es: " + area + "\n");

        // Programa para convertir grados Fahrenheit a Celsisus (y viceversa)
        /*
        float celsius = (celsius * 1.8f) + 32;
         */


        float celsius;
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Ingresa los grados celsius: ");
        celsius = scanner3.nextFloat();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("La temperatura que has introducido equivale en Fahrenheit a: " + fahrenheit + " grados" + "\n");


        /*
        float fahrenheit1 = 10;
        float celsius1 = (fahrenheit1 - 32) * 5 / 9;

        System.out.println(fahrenheit1 + " grados equivalen a " + celsius1 + " grados celsius" + "\n");

        float celsius2 = 25;
        float fahrenheit2 = (celsius2 - 32) * 5 / 9;
         */

        /*
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Por favor, introduce tu nombre: ");
        String UserName = scanner1.nextLine();
        System.out.println("¡Hola, " + UserName + "!");
        */
    }
}