/**
 * Ejercicio 1
 * Escribe una programa que muestre tu nombre por pantalla.
 *
 * Ejercicio 2
 * Modifica el programa anterior para que además se muestre tu dirección y
 * tu número de teléfono. Asegúrate de que los datos se muestran en líneas
 * separadas
 */

public class Main{
    public static void main(String[], arg){
        System.out.printf("%-5s World!\n", "Hello");
        System.out.printf("%-4s %4s I have %d years ols\n", "I Am", "Tian", 15);
        System.out.printf("My phone number: %d \\u{1F618}\n",);
        System.out.printf("\\u{1F377} My adress %4s number %d", "tree \\u{1F377}", 4);
    }
}