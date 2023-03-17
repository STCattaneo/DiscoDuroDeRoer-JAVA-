/*Lee un caracter por teclado y muestra por consola, el número al que pertenece en la tabla ASCII.
 Por ejemplo: si introduzco una a, me muestre un 97. */



    //Version JOptionPane
import javax.swing.*;
public class Ascii_2 {
    public static void main(String[] args) {
        
        char caracter=JOptionPane.showInputDialog("Ingrese un caracter de la tabla ASCII").charAt(0);

        int código=(int) caracter;

        System.out.println("El caracter ingresado corresponde al código " + código);
    }
}


/*     //version Scanner
    import java.util.*;
    public class Ascii_2 {
        public static void main(String[] args) {
            
            Scanner entrada=new Scanner(System.in);
    
            System.out.println("Ingrese un caracter de la tabla ASCII");
    
            char caracter=entrada.next().charAt(0);
    
            int código=(int) caracter;
    
            System.out.println("El caracter ingresado corresponde al código " + código);
        }
    }*/
