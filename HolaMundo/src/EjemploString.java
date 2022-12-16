public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String curso2 = new String("Programación Java");
        boolean isEqual = curso == curso2;
        System.out.println("curso == curso2 :" + isEqual);
        
        isEqual = curso.equalsIgnoreCase(curso2);
        System.out.println("curso.equalsIgnoreCase(curso2) = " + isEqual);
        
        String curso3 = "Programación Java";
        isEqual = curso == curso3;
        System.out.println("curso == curso3 = " + isEqual);
    }
}
