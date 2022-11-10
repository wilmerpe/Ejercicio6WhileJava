import javax.swing.*;

public class Ejercicio6While {
    public static void main(String[] args) {
        int numero, suma = 0;

        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número: "));

            suma += numero;
    }while (numero != 0);
        System.out.println("La suma es: " + suma);
    }
}
