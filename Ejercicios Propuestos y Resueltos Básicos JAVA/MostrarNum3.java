/*
 * Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. Utiliza el bucle que desees.
 */


/*  Version FOR
public class MostrarNum3 {
    public static void main(String[] args) {

        int num=0;
        
        for(int i=0; i<100; i++){

            num++;

            if (num%2==0 || num%3==0){

                System.out.println(num);
            }
        }
    }
}*/

    //Version WHIlE

    public class MostrarNum3 {
        public static void main(String[] args) {
    
            int num=0;
            
            while(num<100){

                num++;

                if (num%2==0 || num%3==0){

                    System.out.println(num);
                }
            }
        }
    }
