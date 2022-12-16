import java.sql.SQLOutput;

public class PrimitivosFloat  {
    public static void main(String[] args) {

        float realFloat = 1.5e-2f; //1.5e4f  //1.0f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("numeroInt " + Float.BYTES);
        System.out.println("numeroBites = " + Float.SIZE);
        System.out.println("Número Minimo = " + Float.MIN_VALUE);
        System.out.println("Número Máximo = " + Float.MAX_VALUE);

        System.out.println("");

        double realDouble = 3.4028235E38;
        System.out.println("realDouble = " + realDouble);
        System.out.println("numeroDouble " + Double.BYTES);
        System.out.println("numeroDouble = " + Double.SIZE);
        System.out.println("Número Minimo = " + Double.MIN_VALUE);
        System.out.println("Número Máximo = " + Double.MAX_VALUE);

        var varFlotante = 3.1416;
        System.out.println("varFlotante = " + varFlotante);

    }
}
