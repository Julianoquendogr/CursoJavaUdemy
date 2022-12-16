public class EjemploStringExtencionArchivo {
    public static void main(String[] args) {
        String archivo = "Imagen.pdf";
        int indexOf = archivo.indexOf(".");
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring((indexOf+1)) = " + archivo.substring((indexOf+1)));
        
    }
}
