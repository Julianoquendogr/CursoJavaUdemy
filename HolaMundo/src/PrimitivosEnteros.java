public class PrimitivosEnteros {
    public static void main(String[] args) {
        byte numeroByte = 7;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("numeroByte = " + Byte.BYTES);
        System.out.println("numeroBites = " + Byte.SIZE);
        System.out.println("Númer oMinimo = " + Byte.MIN_VALUE);
        System.out.println("Número Máximo = " + Byte.MAX_VALUE);

        System.out.println("");

        short numeroShort = 32767;
        System.out.println("numeroShort " + numeroShort);
        System.out.println("numeroByte = " + Short.BYTES);
        System.out.println("numeroBites = " + Short.SIZE);
        System.out.println("Númer oMinimo = " + Short.MIN_VALUE);
        System.out.println("Número Máximo = " + Short.MAX_VALUE);

        System.out.println("");

        int numeroInt = 2147483647;
        System.out.println("numeroInt " + numeroInt);
        System.out.println("numeroByte = " + Integer.BYTES);
        System.out.println("numeroBites = " + Integer.SIZE);
        System.out.println("Número Minimo = " + Integer.MIN_VALUE);
        System.out.println("Número Máximo = " + Integer.MAX_VALUE);

        System.out.println("");

        long numeroLong = 9223372036854775807L;
        System.out.println("numeroInt " + numeroLong);
        System.out.println("numeroByte = " + Long.BYTES);
        System.out.println("numeroBites = " + Long.SIZE);
        System.out.println("Número Minimo = " + Long.MIN_VALUE);
        System.out.println("Número Máximo = " + Long.MAX_VALUE);

        System.out.println("");

        var numeroVar = 127;
        System.out.println("numeroVar = " + numeroVar);
    }
}
