public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {
        
        String trabaLengua = "trabaLenguas";
        System.out.println("trabaLengua.toCharArray() = " + trabaLengua.toCharArray());

        char[] arreglo = trabaLengua.toCharArray();
        int largo = arreglo.length;

        for (int i = 0; i < largo; i++) {
            System.out.println("arreglo[i] = " + i + ": " + arreglo[i]);
        }

        System.out.println("trabaLengua = " + trabaLengua.split("a"));

        String[] arreglo2 = trabaLengua.split("a");
        int l = arreglo2.length;
        for (int i = 0; i < l ; i++) {
            System.out.println(arreglo2[i]);
        }

        String archivo = "Alguna.Imagen.pdf";
        String[] archivoArr = archivo.split("[.]"); //  "\\."
        int largo2 = archivoArr.length;
        for (int i = 0; i <  largo2; i++) {
            System.out.println("archivoArr[i] = " + archivoArr[i]);
        }
        System.out.println("largo3 = " + largo2);
        System.out.println("Extención = " + archivoArr[largo2 - 1]);
    }
}
