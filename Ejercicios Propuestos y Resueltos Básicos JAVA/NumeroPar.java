/*Lee un número por teclado e indica si es divisible entre 2 (resto = 0).
 Si no lo es, también debemos indicarlo. */


/*    //version Scanner
import java.util.Scanner;
public class NumeroPar {
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);

        System.out.println("Ingrese un número");

        int numero=entrada.nextInt();

        if((Math.floorMod(numero, 2)==0)){

            System.out.println("El número ingresado es divisible por 2");
        
        }else{
        
            System.out.println("El número ingresado es NO divisible por 2");
        
        }
    }
}*/

    //version JOptionPane
import javax.swing.*;
public class NumeroPar {
    public static void main(String[] args) {
        
        int numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));

        if((Math.floorMod(numero, 2)==0)){

            System.out.println("El número ingresado es divisible por 2");
        
        }else{
        
            System.out.println("El número ingresado es NO divisible por 2");
        
        }

    }
}
