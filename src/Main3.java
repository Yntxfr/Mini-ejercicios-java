// Nombre alumno: Alex Fernandez
// Mini Ejercicios Java



/*
3. Operaciones básicas:
Realiza y muestra el resultado de operaciones básicas (suma, resta, multiplicación, división).
Añade operaciones de módulo y elevación a potencia.
Crea un calculador simple que acepte entradas del usuario y realice estas operaciones.
Implementa un sistema simple para calcular el promedio de cinco números ingresados por el usuario.
 */


import java.util.Scanner;  // Importar la clase Scanner

public class Main3 {
    public static void main(String[] args) {
        // Declarar, inicializar e imprimir variables de diferentes tipos
        int numero1 = 10;
        int numero2 = 40;
        int numero3 = 20;
        int numero4 = 60;

        int resultadoSumaTotal = numero1 + numero2 + numero3 + numero4;

        System.out.println("Mis números son: " + numero1 + ", " + numero2 + ", " + numero3 + ", " + numero4);
        System.out.println("El resultado total de la suma es: " + resultadoSumaTotal);
        System.out.println("Multiplicar " + numero1 + " x " + numero2 + " x " + numero3 + " es igual a: " + numero1*numero2*numero3 + "\n");


        /*
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Ingresa tu número: ");
        */

        // Calculador simple que acepte entradas del usuario y realice estas operaciones
        Scanner scanner4 = new Scanner(System.in);
        System.out.print("Por favor, ingresa tu número: ");
        int numeroUser = scanner4.nextInt();
        System.out.println("Este es tu número: " + numeroUser + "\n");

        Scanner scanner5 = new Scanner(System.in);
        System.out.print("Por favor, selecciona uno de mis números: 10, 40, 20 o 60: ");
        String estado = scanner5.nextLine();
        if (estado.equals("10")) {
            System.out.println("Tu número dividido por " + numero1 + " es igual a: " + numeroUser / numero1 + "\n");
        }   else if (estado.equals("40")) {
            System.out.println("Tu número dividido por " + numero2 + " es igual a: " + numeroUser / numero2 + "\n");
        }   else if (estado.equals("20")) {
            System.out.println("Tu número dividido por " + numero3 + " es igual a: " + numeroUser / numero3 + "\n");
        }   else if (estado.equals("60")) {
            System.out.println("Tu número dividido por " + numero4 + " es igual a: " + numeroUser / numero4 + "\n");
        }   else {
            System.out.println("Oh no! El número que has introducido no es ninguno de la lista!" + "\n");
        }

        // Implementar un sistema para calcular el promedio de cinco números ingresados por el usuario
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        int num1 = in.nextInt();

        System.out.print("Input second number: ");
        int num2 = in.nextInt();

        System.out.print("Input third number: ");
        int num3 = in.nextInt();

        System.out.print("Input fourth number: ");
        int num4 = in.nextInt();

        System.out.print("Input fifth number: ");
        int num5 = in.nextInt();

        System.out.println("Average of five numbers is: " + (num1 + num2 + num3 + num4 + num5) / 5);
    }


}