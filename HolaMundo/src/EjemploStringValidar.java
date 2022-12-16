import java.security.spec.RSAOtherPrimeInfo;

public class EjemploStringValidar {
    public static void main(String[] args) {
        String curso = null;
        boolean isNull = curso == null;
        System.out.println("isNull = " + isNull);

        if(isNull){
            curso = "Programación Java";
        }
        boolean esVacio = curso.length() == 0;
        System.out.println("esVacio = " + esVacio);

        boolean esVacio2 = curso.isEmpty();
        System.out.println("esVacio2 = " + esVacio2);

        boolean isBlaco = curso.isBlank();
        System.out.println("isBlaco = " + isBlaco);

        if(isBlaco){
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso : ".concat(curso));
        }


    }
}
