/*Declara 2 variables numéricas (con el valor que desees),
 he indica cual es mayor de los dos. Si son iguales indicarlo también.
  Ve cambiando los valores para comprobar que funciona. */

public class Variables_Numericas2 {
    public static void main(String[] args) {

        int num1=5;

        int num2=5;

        if(num1>num2){
            System.out.println("El primer número es mayor que el segundo");
        }
        else if(num1<num2){
            System.out.println("El segundo número es mayor que el primero");
        }
        else{
            System.out.println("Ambos numeros son iguales");
        }
        
    }
}
