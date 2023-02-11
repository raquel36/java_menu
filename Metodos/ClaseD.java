package EjercicioUno.Metodos;
import java.util.*;
/*Reciba como parámetro un texto y devuelva la cantidad de caracteres que incorpora el texto.
 */
public class ClaseD {
    public static void cuentaCaracteres(Scanner input) {
        System.out.print("Introduzca un texto y contaré sus caracteres: ");
        String texto=input.nextLine();
        int letras = texto.length();
        System.out.println(texto+ " tiene = " + letras + " caracteres.");
    }
}

/* https://www.delftstack.com/es/howto/java/count-characters-in-a-string-java/ */