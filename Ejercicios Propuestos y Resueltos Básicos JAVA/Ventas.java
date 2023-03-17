import javax.swing.*;
public class Ventas {
    public static void main(String[] args) {
        
        int ventas=Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas ventas hiciste deseas ingresar?"));

        int monto=0;

        int MontoTotal=0;

        for (int i=1; i<=ventas; i++){

            monto=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el monto de la venta n°" + i));

            MontoTotal=MontoTotal+monto;
            
        }

        System.out.println("El monto total de las ventas es $" + MontoTotal);

    }
}
