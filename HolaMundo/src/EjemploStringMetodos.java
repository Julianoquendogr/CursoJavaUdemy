public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Julian";
        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Julian\") = " + nombre.equals("Julian"));
        System.out.println("nombre.equalsIgnoreCase(\"julian\") = " + nombre.equalsIgnoreCase("julian"));
        System.out.println("nombre.compareTo(\"Julian\") = " + nombre.compareTo("Julian"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));
        System.out.println("nombre.substring(2,4) = " + nombre.substring(2,4));
        System.out.println("nombre.substring(nombre.length()-1) = " + nombre.substring(nombre.length()-1));
        
        String trabaLengua = "trabaLenguas";
        System.out.println("trabalenguas = "+ trabaLengua.replace("a","."));
        System.out.println("trabaLengua.indexOf(\"L\") = " + trabaLengua.indexOf("a"));
        System.out.println("trabaLengua.lastIndexOf(\"a\") = " + trabaLengua.lastIndexOf("a"));
        System.out.println("trabaLengua.contains(\"t\") = " + trabaLengua.contains("t"));
        System.out.println("trabaLengua.startsWith(\"tra\") = " + trabaLengua.startsWith("tra"));
        System.out.println("trabaLengua.endsWith(\"uas\") = " + trabaLengua.endsWith("uas"));
        System.out.println(" trabalenguas ");
        System.out.println(" trabalenguas ".trim());
    }
}
