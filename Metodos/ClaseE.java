package EjercicioUno.Metodos;
import java.util.*;
/* Reciba como parámetro un texto y devuelva el texto invertido.
 */
public class ClaseE {
    public static void invertirTexto(Scanner input) {
        System.out.print("Introduzca un texto e invertiré su orden: ");
        String texto=input.nextLine();
        StringBuilder stringBuilder = new StringBuilder(texto);
        String invertida = stringBuilder.reverse().toString();
        System.out.println(texto+ " = " + invertida);
    }
}