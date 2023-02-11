package EjercicioUno.Metodos;
import java.util.*;
/* Reciba como parámetro una cadena y una vocal, el método sustituye todas las vocales de la cadena por la vocal que se ha pasado como parámetro (no devuelve nada).
 */
public class ClaseH {
    public static void sustituirVocales(String cadena, char vocal, Scanner input) {
        System.out.println("El siguiente programa permite sustituir las vocales de una palabra por una sola vocal.");
        System.out.println("Introduzca una palabra: ");
        cadena = input.nextLine();
        System.out.println("Introduzca una vocal: ");
        vocal = input.next().charAt(0);
        String vocales="aeiouAEIOU";
        StringBuilder sustituida = new StringBuilder(cadena.length());
        for (int i = 0; i < cadena.length(); i++) {
            char vocalActual = cadena.charAt(i);
            if (vocales.indexOf(vocalActual) != -1) {
                sustituida.append(vocal);
            } else {
                sustituida.append(vocalActual);
            }
        }
        System.out.println("Cadena '"+cadena +"' con vocales sustituidas: " + sustituida.toString());
    }
}