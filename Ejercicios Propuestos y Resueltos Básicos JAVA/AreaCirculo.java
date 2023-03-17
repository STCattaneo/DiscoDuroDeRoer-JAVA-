/*Haz una aplicación que calcule el área de un círculo(pi*R2).
 El radio se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble).
  Usa la constante PI y el método pow de Math. */


/*  //vesrion Scanner
import java.util.*;
public class AreaCirculo {
    public static void main(String[] args) {

        Scanner entrada=new Scanner(System.in);

        System.out.println("Ingrese el radio del circulo");

        double radio=entrada.nextDouble();

        
        
    }
}*/

import javax.swing.*;
public class AreaCirculo{
    public static void main(String[] args) {

        Double radio=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del circulo"));

        System.out.println("El area del circulo es " + (Math.PI*Math.pow(radio, 2)));
        
    }
}