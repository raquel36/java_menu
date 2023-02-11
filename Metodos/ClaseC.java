package EjercicioUno.Metodos;
import java.util.*;
/* Leer 5 números por teclado y a continuación realizar la media de los números positivos, la media de los negativos y contar el número de ceros que se han introducido por teclado.
 */
public class ClaseC {
    public static void mediaNumeros(ArrayList<Integer> lista,  Scanner scan) {
        int numero = 0;
        System.out.println("Media de números.");
        System.out.println("Introduzca 5 números, algunos positivos, otros negativos y algún cero");
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
        float sumaPositivos=0;
        int contadorPositivos=0;
        float sumaNegativos=0;
        int contadorNegativos=0;
        int contadorCeros = 0;
        float mediaPositivos=0;
        float mediaNegativos=0;
        for(int num : lista){
        if (num>0){
        sumaPositivos+=num;
        contadorPositivos++;
        mediaPositivos=sumaPositivos/contadorPositivos;
        }
        else if (num<0){
        sumaNegativos+=num;
        contadorNegativos++;
        mediaNegativos=sumaNegativos/contadorNegativos;
        }
        else if (num == 0) {
        contadorCeros++;
        }
        }
        System.out.println("Media de los números positivos introducidos = " + mediaPositivos);
        System.out.println("Media de los números negativos introducidos = " + mediaNegativos);
        System.out.println("Cantidad de ceros introducidos = " + contadorCeros);
    }
}
