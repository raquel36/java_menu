package EjercicioUno.Metodos;
import java.util.*;
/*Leer 5 números y mostrarlos en orden inverso al introducido.
 */
public class ClaseB {
    public static void numerosOrdenInverso(ArrayList<Integer> lista, Scanner scan) {
        int numero = 0;
        System.out.println("Introduzca 5 números y los mostraré en el orden inverso.");
        while (lista.size() < 5) {
            System.out.print("numero: ");
            try {
                numero = scan.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Ha introducido una letra, introduzca solo números!");
                scan.nextLine(); // descarta la línea incorrecta
                continue;
            }
            lista.add(numero);
        }
        Collections.reverse(lista);
        System.out.print("Lista de números en orden inverso = ");
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i));
            if (i != lista.size() - 1) {
                System.out.print(", ");
            }
        }
System.out.println();
    }
}