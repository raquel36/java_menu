package EjercicioUno.Metodos;
import java.util.*;
/* Reciba como parámetro una cadena, y muestre el código ASCII de cada uno de los caracteres de la cadena (no devuelve nada el método).
 */
public class ClaseI {

    public static void caracteresASCII(String cadena, Scanner scan) {
        System.out.print("Introduzca una palabra y sacaré su correspondencia en ASCII: ");
        cadena = scan.next();
        char[] transformada = new char[cadena.length()];
        for (int i = 0; i < cadena.length(); i++) {
            transformada[i] = cadena.charAt(i);
            System.out.println("El carácter '" + transformada[i] + "' en ASCII es " + (int)transformada[i]);
        }
    }
}

/* https://parzibyte.me/blog/2020/08/18/java-obtener-valor-ascii-char/#:~:text=Para%20hacer%20esto%2C%20simplemente%20%E2%80%9Ccasteamos,a%20otro%2C%20manteniendo%20el%20valor.&text=En%20este%20caso%20la%20salida%20ser%C3%A1%20El%20valor%20ASCII%20es%3A%2064. */
/* https://www.techiedelight.com/es/convert-string-char-java/ */