import javax.swing.*;

public class OperadorAritmetico {
    public static void main(String[] args) {
        int i = 5, j = 4, suma = i + j;
        System.out.println("suma = " + suma);
        System.out.println("suma = " + (i + j));

        int resta = i -j ;
        System.out.println("i - j = " + + (i - j));
        
        int multiplicacion = i  * j;
        System.out.println("multiplicacion = " + multiplicacion);
        
        int div = i / j;
        System.out.println("div = " + div);
        
        float div2 = (float) i / j;
        System.out.println("div2 = " + div2);
        
        int resto = i % j;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        if(numero % 2 == 0){
            System.out.println("Es número par");
        }else{
            System.out.println("Es número impar");
        }
    }
}
