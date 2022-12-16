public class PrimitivosBoolean {
    public static void main(String[] args) {
        boolean dataLogico = true;
        System.out.println("dataLogico = " + dataLogico);

        double d = 98765.43e-3; //98.76543
        float f = 12345e2f; // 123.45

        dataLogico = d > f;
        System.out.println("dataLogico = " + dataLogico);
        
        boolean esIgual = (3-2 == 1);
        System.out.println("esIgual = " + esIgual);

    }
}
