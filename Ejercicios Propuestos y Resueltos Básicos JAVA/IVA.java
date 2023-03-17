/*Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el precio final con IVA.
 El IVA sera una constante que sera del 21%. */

/*    //version JOptionPane
import javax.swing.*;
public class IVA {
    public static void main(String[] args) {
        
        final Double IVA=1.21;

        Double precio=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto"));

        Double PrecioFinal=precio*IVA;

        System.out.printf("%1.2f",PrecioFinal);
    }
}*/

    //version Scanner
import java.util.*;
public class IVA {
    public static void main(String[] args) {
        
        final Double IVA=1.21;

        Scanner entrada=new Scanner(System.in);

        System.out.println("Ingrese el precio del producto");

        double precio=entrada.nextDouble();

        Double PrecioFinal=precio*IVA;

        System.out.printf("%1.2f",PrecioFinal);
    }
}