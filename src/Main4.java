// Nombre alumno: Alex Fernandez
// Mini Ejercicios Java



/*
4. Estructuras de Control:
Escribe un programa que use `if` para comparar dos números e imprimir cuál es mayor o si son iguales.
Implementa un bucle `for` que imprima números del 1 al 10.
Usa un bucle `while` para realizar una cuenta regresiva desde 10 hasta 1.
Desarrolla un programa que pida al usuario un número y utilice un bucle `do-while` para sumar todos los números hasta ese número.
Agrega un ejemplo que use `switch` para realizar diferentes operaciones matemáticas basadas en la entrada del usuario.
 */


import java.util.Scanner;  // Importar la clase Scanner

public class Main4 {
    public static void main(String[] args) {
        // Declarar, inicializar e imprimir variables de diferentes tipos
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        int a1 = in.nextInt();

        System.out.print("Input second number: ");
        int b1 = in.nextInt();

        if( a1 == b1) {
            System.out.println("Los números son iguales" + "\n");
        }   else if (a1 >= b1) {
            System.out.println(a1 + " es mayor que " + b1 + "\n");
        }   else if (a1 <= b1) {
            System.out.println(a1 + " es menor que " + b1 + "\n");
        }   else
            System.out.println("Los números NO son iguales" + "\n");


        // Implementa un bucle `for` que imprima números del 1 al 10.
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("Grazie! " + "\n");

        // Usa un bucle `while` para realizar una cuenta regresiva desde 10 hasta 1.
        Scanner inMessage = new Scanner(System.in);
        System.out.println( "Type in a message, and I'll display it ten times." );
        System.out.print( "Message: " + "\n");
        String message = inMessage.nextLine();

        Scanner inNumber = new Scanner(System.in);
        System.out.println( "How many times?" );
        int num1 = inNumber.nextInt();

        int n = 0;
        while ( num1 > 0 )
        {
            System.out.println( (num1) + ". " + message );
            num1--;
        }

        // Agrega un ejemplo que use `switch` para realizar diferentes operaciones matemáticas basadas en la entrada del usuario.
        Scanner inMessage2 = new Scanner(System.in);
        System.out.println( "Who would win in a fight between Captain America and Iron Man?." );
        System.out.print( "Message: " + "\n");
        String message2 = inMessage2.nextLine();

        switch (message2.toLowerCase()) {
            case "captain america":
                System.out.println("Aye, soldier!");
                break;
            case "iron man":
                System.out.println("Cap can't beat the armor!");
                break;
            default:
                System.out.println("Interesting, but not the right answer.");
        }
    }


}