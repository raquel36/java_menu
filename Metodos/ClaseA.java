package EjercicioUno.Metodos;
import java.util.*;
/* Leer 5 números (con bucle por favor, no pongáis 5 scanner consecutivos) y mostrarlos en el mismo orden introducido. Los 5 números se deben almacenar en un array.
 */
public class ClaseA {public static void mostrarNumeros(ArrayList<Integer> lista, Scanner scan) {
    Limpiar.limpiarPantalla();
        int contador=1;
        int numero=0;
        System.out.println("Introduzca los números según el orden que quiere que aparezcan, el número indicado será su orden.");
        while (lista.size() < 5) {
            System.out.print("número " + contador+ ": ");
            try {
                numero = scan.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Ha introducido una letra, introduzca solo números!");
                scan.nextLine(); // descarta la línea incorrecta
                continue;
            }
            
            lista.add(numero);
            contador++;
        }
        System.out.print("lista de números = ");
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i));
            if (i != lista.size() - 1) {
                System.out.print(", ");
            }
        }
System.out.println();
    }
    
}