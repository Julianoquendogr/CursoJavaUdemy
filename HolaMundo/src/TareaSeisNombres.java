import javax.swing.*;

public class TareaSeisNombres {
    public static void main(String[] args) {

        String nom1;
        String nom2;
        String nom3;

        nom1 = JOptionPane.showInputDialog("Type first name");
        nom2 = JOptionPane.showInputDialog("Type second name");
        nom3 = JOptionPane.showInputDialog("Type third name");

        String[] charNom1 = nom1.split(" ");
        int largo1 = charNom1[0].length();

        String[] charNom2 = nom2.split(" ");
        int largo2 = charNom2[0].length();

        String[] charNom3 = nom3.split(" ");
        int largo3 = charNom3[0].length();

        int nombreLargoEs = (largo1 > largo2) ? largo1 : largo2;
        nombreLargoEs = (nombreLargoEs > largo3) ? nombreLargoEs : largo3;

        if(nombreLargoEs == charNom1[0].length()){
            System.out.println(nom1 + " Tiene el nombre más largo");
        }else if (nombreLargoEs == charNom2[0].length()){
            System.out.println(nom2 + " Tiene el nombre más largo");
        }else if (nombreLargoEs == charNom3[0].length()){
            System.out.println(nom3 + " Tiene el nombre más largo");
        }
    }
}
