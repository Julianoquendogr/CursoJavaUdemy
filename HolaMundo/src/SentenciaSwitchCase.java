import javax.swing.*;
import java.util.Scanner;

public class SentenciaSwitchCase {
    public static void main(String[] args) {

        int mes = (Integer.parseInt(JOptionPane.showInputDialog("Ingrese un mes entre 1 y 12")));
        String nomMes = "";
        char num = 'a';

        switch (mes){
            case 1:
                nomMes = "Enero";
                break;
            case 2:
                nomMes = "Febrero";
                break;
            case 3:
                nomMes = "Marzo";
                break;
            case 4:
                nomMes = "Abril";
                break;
            case 5:
                nomMes = "Mayo";
                break;
            case 6:
                nomMes = "Junio";
                break;
            case 7:
                nomMes = "Julio";
                break;
            case 8:
                nomMes = "Agosto";
                break;
            case 9:
                nomMes = "Septiembre";
                break;
            case 10:
                nomMes = "Octubre";
                break;
            case 11:
                nomMes = "Noviembre";
                break;
            case 12:
                nomMes = "Diciembre";
                break;
            default:
                nomMes = "Indefinido";
        }
        System.out.println("nomMes = " + nomMes);


        switch (num){
            case '0':
                System.out.println("El número es cero");
                break;
            case '1':
                System.out.println("El número es uno");
                break;
            case '2':
                System.out.println("El número es dos");
                break;
            case '3':
                System.out.println("El número es tres");
                break;
            case 'a':
                System.out.println("El caracter es a");
                break;
            default:
                System.out.println("Caracter desconocido");
        }

        String nombre = "Carlos";

        switch (nombre){
            case "admin":
                System.out.println("Hola admin, bienvenido");
                break;
            case "Andres":
                System.out.println("Hola Andres");
                break;
            case "pepe":
                System.out.println("Hola pepe");
                break;
            default:
                System.out.printf("Usuario desconocido");
        }
    }
}
