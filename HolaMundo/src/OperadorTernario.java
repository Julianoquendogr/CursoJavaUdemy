import java.util.Scanner;

public class OperadorTernario {

    public static void main(String[] args) {

        double promedio = 0.0;
        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;
        String estado = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la nota de matematicas entre 1.0 y 5.0");
        matematicas = sc.nextDouble();

        System.out.println("Ingrese la nota de ciencias entre 1.0 y 5.0");
        ciencias = sc.nextDouble();

        System.out.println("Ingrese la nota de historia entre 1.0 y 5.0");
        historia = sc.nextDouble();

        promedio = (matematicas + historia + ciencias) / 3;

        estado = promedio >= 3.0 ? "Aprobado" : "Rechazado";
        System.out.println("estado = " + estado +  " :" + promedio);


        //String variable = (7==7) ? "si es verdadero" : "si es falso";
        //System.out.println("variable = " + variable);

    }
}
