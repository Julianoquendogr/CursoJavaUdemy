public class OperadoresIncrementales {
    public static void main(String[] args) {

        //Pre Incremento
        int i = 1;
        int j = ++i; // i = i + 1;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Pos incremento
        i = 2;
        System.out.println("inicial de i = " + i);
        j = i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Pre decremento
        i = 3;
        j = --i; //i=i-1 => 2
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
        //Pos decremento
        i = 4;
        j = i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        int p = 5;
        System.out.println("\n");
        System.out.println("(++p) = " + (++p)); // 6
        System.out.println("(p++) = " + (p++)); // 6
        System.out.println("p = " + p); //7


    }
}
