package EjercicioUno;

import java.util.*;
/*import java.time.temporal.ValueRange;*/
import EjercicioUno.Metodos.*;
/* Prepara un menú que seleccione la ejecución de los diferentes ejercicios que se piden a continuación. Este menú se debe realizar con un switch.
 */
/*Crea un método para todos y cada uno de los siguientes ejercicios. El método debe incorporar el calificador de acceso “public static'' y tener un nombre adecuado a lo que se solicita. */

public class Menu {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        char opcion;


    do{ 
        System.out.println("");
        System.out.print("Arrancando el Menú en 5 segundos ");
        String puntos=".....";
        /* Bucle que simula la espera de 5 segundos mediante puntos */
        for(int i=0; i<puntos.length(); i++){
            System.out.print(puntos.charAt(i));
            Thread.sleep(1000);
        }
        System.out.println("");
        letrasMenu();
        System.out.println("------------------------------------------------------------------");
        System.out.println("A. Pedir y mostrar 5 números en un array.");
        System.out.println("B. Pedir y mostrar 5 números en orden inverso.");
        System.out.println("C. Media de positivos, media negativos y contar ceros introducidos.");
        System.out.println("D. Cuenta cáracteres de un texto.");
        System.out.println("E. Invertir un texto introducido.");
        System.out.println("F. Quitar espacios de un texto.");
        System.out.println("G. Concatenar palabras.");
        System.out.println("H. Sustituir vocales de una palabra.");
        System.out.println("I. Convertir palabra a caracteres a ASCII.");
        System.out.println("S. Salir");
        System.out.print("Seleccione una opción / S=salir: ");

        opcion = scan.next().charAt(0);
        ArrayList<Integer> lista = new ArrayList<Integer>();
            
            String cadena1="";
            String cadena2="";
            String cadena="";
            char vocal=' ';
            switch (opcion){
                case 'A':
                case 'a':
                ClaseA.mostrarNumeros(lista,scan);
                break;
                case 'B':
                case 'b':
                ClaseB.numerosOrdenInverso(lista, scan);
                break;
                case 'C':
                case 'c':
                ClaseC.mediaNumeros(lista, scan);
                break;
                case 'D':
                case 'd':
                ClaseD.cuentaCaracteres(input);
                break;
                case 'E':
                case 'e':
                ClaseE.invertirTexto(input);
                break;
                case 'F':
                case 'f':
                ClaseF.quitarEspacios(input);
                break;
                case 'G':
                case 'g':
                ClaseG.concatenarCadenas(cadena1, cadena2, input);
                break;
                case 'H':
                case 'h':
                ClaseH.sustituirVocales(cadena, vocal, input);
                break;
                case 'I':
                case 'i':
                ClaseI.caracteresASCII(cadena, scan);
                break;
                case 'S':
                case 's':
                letrasAdios();
                System.out.println("\033[1mGracias por emplear el programa.\033[0m");
                System.out.println("");
                break;
                default:
                    System.out.println("Opción inválida.");
                    break;            
            }
        
        } while (opcion != 'S' && opcion != 's');
    } 
    
    public static void letrasMenu(){
    System.out.print("\033[2J"); /* Borrado de pantalla */
    System.out.print("\033[0;0H"); /* Mueve el cursor al inicio de la pantalla */
    System.out.flush(); /* Nos aseguramos de que los cambios se reflejan en la pantalla */
    System.out.println("");
    System.out.println("\033[1;35m█▄ ▄█ ███ █  █ █ █");
    System.out.println("█ █ █ █▄  ██▄█ █ █");
    System.out.println("█   █ █▄▄ █ ██ ███\033[0m");
    }

    public static void letrasAdios(){
    System.out.println("");
    System.out.println("\033[1;32m███ ██▄ █ ███ ██");
    System.out.println("█▄█ █ █ █ █ █ █▄");
    System.out.println("█ █ ███ █ █▄█ ▄█\033[0m");
    System.out.println("");
    }
}

/*
 * He tenido problemas con el metodo Scanner, ya que en el menú se definia como next y en algunos
 * metodos externos como nextLine, y solo cogia el next, por lo que el metodo no se ejecutaba correctamente.
 * He tenido que definir un Scanner con un nombre diferente para cuando empleaba el nextLine.
 */
/* Generador letras ASCII */
/* https://www.letrabonita.net/2018/01/primera-entrada.html */
/* https://es.rakko.tools/tools/68/ */
/* ANSI CODE */
/* https://en.wikipedia.org/wiki/ANSI_escape_code */






