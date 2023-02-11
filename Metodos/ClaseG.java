package EjercicioUno.Metodos;
import java.util.*;
/* Reciba como parámetro dos cadenas y las devuelva concatenadas.
 */
public class ClaseG {
    public static void concatenarCadenas(String cadena1, String cadena2, Scanner input) {
        System.out.println("Introduzca dos palabras y las concatenaré.");
        System.out.println("Introduzca la primera palabra: ");
        cadena1 = input.nextLine();
        System.out.println("Introduzca la segunda palabra: ");
        cadena2 = input.nextLine();
        
        String concatenar=cadena1+cadena2;
        System.out.println("Palabras concatenadas: " + concatenar);
    }
}

/* https://www.abrirllave.com/java/leer-una-variable-de-tipo-string-desde-el-teclado.php */