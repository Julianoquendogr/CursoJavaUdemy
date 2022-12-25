import java.util.Scanner;

public class TareaCuatro {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String numMayor = "";

        System.out.println("Please type first number");
        int num1 = sc.nextInt();

        System.out.println("Please type Second number");
        int num2 = sc.nextInt();

        numMayor = num1 > num2 ? "Biggest number is: " + num1 + " and smallest number is " + num2
                               : "Biggest number is: " + num2 + " and smallest number is " + num1;
        System.out.println(numMayor);
    }
}
