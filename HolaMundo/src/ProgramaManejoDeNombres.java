import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombreUno;
        String nombreDos;
        String nombreTres;

        System.out.println("Por favor ingrese el nombre 1");
        nombreUno = sc.nextLine();
        int largo1 = nombreUno.length();
        char mayusculaUno = nombreUno.charAt(1);
        mayusculaUno = Character.toUpperCase(mayusculaUno);
        nombreUno = nombreUno.substring(largo1 - 2);

        System.out.println("Por favor ingrese el nombre 2");
        nombreDos = sc.nextLine();
        int largo2 = nombreDos.length();
        char mayusculaDos = nombreDos.charAt(1);
        mayusculaDos = Character.toUpperCase(mayusculaDos);
        nombreDos = nombreDos.substring(largo2 - 2);

        System.out.println("Por favor ingrese el nombre 3");
        nombreTres = sc.nextLine();
        int largo3 = nombreTres.length();
        char mayusculaTres = nombreTres.charAt(1);
        mayusculaTres = Character.toUpperCase(mayusculaTres);
        nombreTres = nombreTres.substring(largo3 - 2);

        System.out.println(
                mayusculaUno + "." + nombreUno + "_"+
                mayusculaDos + "." + nombreDos + "_"+
                mayusculaTres + "." + nombreTres
        );
    }
}
