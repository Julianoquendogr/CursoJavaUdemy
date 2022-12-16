public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = 'v';
        char decimal = 64;
        char simbolo = '@';
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("Es igual o no: " + (simbolo == decimal));
        System.out.println("caracterChar " + Character.BYTES);
        System.out.println("caracterChar = " + Character.SIZE);
        System.out.println("caracter Minimo = " + Character.MIN_VALUE);
        System.out.println("caracter Máximo = " + Character.MAX_VALUE);

        char espacio = ' ';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';
        System.out.println("Prueba:"+ retroceso);
        System.out.println("rueba" + tabulador + "prueba \b");
        System.out.println("Prueba" + System.lineSeparator());
    }
}
