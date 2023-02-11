package EjercicioUno.Metodos;

public class Limpiar {
    public static void limpiarPantalla() {
        /*secuencias ANSII */
        System.out.print("\033[2J"); /* Borrado de pantalla */
        System.out.print("\033[0;0H"); /* Mueve el cursor al inicio de la pantalla */
        System.out.flush(); /* Nos aseguramos de que los cambios se reflejan en la pantalla */
        // for (int i = 0; i < 50; i++) {
        //     System.out.println();
        // }
    } 
}
/* Las secuencias de escape ANSI son secuencias de caracteres especiales que se utilizan para controlar 
la forma en que se muestra la información en la consola. Estas secuencias son específicas del estándar 
ANSI (American National Standards Institute) y se utilizan en sistemas operativos basados en Unix y 
en consolas de Windows.

Las secuencias de escape ANSI permiten hacer cosas como mover el cursor a una posición determinada, 
cambiar el color de texto y fondo, limpiar la pantalla y mucho más.  */