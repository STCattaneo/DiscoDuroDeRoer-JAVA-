/*Lee un número por teclado y muestra por consola, el carácter al que pertenece en la tabla ASCII.
 Por ejemplo: si introduzco un 97, me muestre una a. */



 /*    //Version JOptionPane
import javax.swing.*;
public class Ascii {
    public static void main(String[] args) {
         int código=Integer.parseInt(JOptionPane.showInputDialog("Introduce un Código de la tabla ASCII"));

         char caracter=(char) código;

         System.out.println("El código ingresado corresponde al caracter " + caracter);
    }
}*/


    //version Scanner
import java.util.*;
public class Ascii {
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);

        System.out.println("Ingrese un Código dela tabla ASCII");

        int código=entrada.nextInt();

        char caracter=(char) código;

        System.out.println("El código ingresado corresponde al caracter " + caracter);
    }
}
