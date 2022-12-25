import java.util.Scanner;

public class EjercicioEstanque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double capacity = 0.0;

        System.out.println("Please type current tank capacity : ");
        capacity = sc.nextDouble();

        if (capacity >= 1 && capacity < 20){
            System.out.println("Insuficiente");
        }else if (capacity >= 20 && capacity < 35){
            System.out.println("Suficiente");
        }else if (capacity >= 35 && capacity < 40){
            System.out.println("Medio Tanque");
        }else if (capacity >= 40 && capacity < 60){
            System.out.println("Estanque 3/4");
        }else if (capacity >= 60 && capacity < 70){
            System.out.println("Casi lleno");
        }else if (capacity > 70){
            System.out.println("Tanquie lleno");
        }

    }
}
