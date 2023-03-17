/*Declara un String que contenga tu nombre,
 después muestra un mensaje de bienvenida por consola.
  Por ejemplo: si introduzco «Fernando», me aparezca «Bienvenido Fernando». */

/*  //(version JOptionPane)
import javax.swing.*;
public class Bienvenida {
    public static void main(String[] args) {
        
        String nombre=JOptionPane.showInputDialog("Introduce tu nombre");

        System.out.println("Bienvenido/a " + nombre + "!!");
        
    }
}
*/


//(version Scanner)

import java.util.*;
public class Bienvenida {
    public static void main(String[] args) {
     
        Scanner entrada= new Scanner(System.in);

        System.out.println("Ingresa tu nombre");

        String nombre=entrada.nextLine();

        System.out.println("Bienvenido/a " + nombre + "!!");

    }
}