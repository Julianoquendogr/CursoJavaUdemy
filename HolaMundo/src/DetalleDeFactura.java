import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {

        String nombreFactura="";
        String mensaje;
        double productoUno = 0;
        double productoDos = 0;
        double total;
        double costoIva;
        double totalMasIva;
        double impuestoIva = 0.19;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la factura");
        nombreFactura = sc.nextLine();

        try{
            System.out.println("Ingrese el precio del producto uno");
            productoUno = sc.nextDouble();
            System.out.println("Ingrese el precio del producto dos");
            productoDos = sc.nextDouble();
        }catch (Exception e){
            System.out.println(e);
            System.out.println("No debe ingresar letras en los precios!!!");
            main(args);
            System.exit(0);
        }

        total = productoDos + productoUno;
        costoIva = total * impuestoIva;
        totalMasIva = total + costoIva;

        mensaje = "La factura: " + nombreFactura + " tiene un total bruto de: " + total + "$\n";
        mensaje += "Con un impuesto de: " + costoIva + "$\n";
        mensaje += "Y el monto después de impuesto es de " + totalMasIva + "$";
        System.out.println(mensaje);

    }
}
