/*Declara dos variables numéricas (con el valor que desees),
 muestra por consola la suma, resta, multiplicación, división y módulo (resto de la división).*/

import java.util.Scanner;
public class Variables_Numericas{
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner (System.in);

        int numero1=0;

        int numero2=0;

        System.out.println("Ingrese el primer número");

        numero1=entrada.nextInt();

        System.out.println("Ingrese el segundo numero");

        numero2=entrada.nextInt();

        System.out.println("La suma de ambos números resulta en " +  (numero1 + numero2));

        System.out.println("La multiplicación de ambos números resulta en " +  (numero1 * numero2));

        System.out.println("La resta de ambos números resulta en " +  (numero1 - numero2));

        System.out.println("La división de ambos números resulta en " +  (numero1 / numero2));

        System.out.println("El modulo de la división de ambos números resulta en " +  Math.floorMod(numero1, numero2));

    
        
    }
}