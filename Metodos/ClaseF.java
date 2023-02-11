package EjercicioUno.Metodos;
import java.util.*;
/* Reciba como parámetro un texto y lo devuelva sin espacios en blanco.
 */
public class ClaseF {

    public static void quitarEspacios(Scanner input) {
        System.out.print("Introduzca un texto y lo devolveré sin espacios: ");
        String texto=input.nextLine();
        String sinEspacios = texto.replaceAll(" ", "");
        System.out.println("Texto sin espacios: " + sinEspacios);
    }
}