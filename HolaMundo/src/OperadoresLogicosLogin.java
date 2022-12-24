import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        String u;
        String p;

        /*String[] userNames = new String[2];
        String[] passwords = new String[2];
        userNames[0] = "andres";
        passwords[0] = "12345";

        userNames[1] = "admin";
        passwords[1] = "123"; */

        String[] userNames = {"andres","admin","julian"};
        String[] passwords = {"123","1234","12345"};

        boolean isAutenticated = false;

        Scanner sc = new Scanner(System.in);

        System.out.println("Type el username: ");
        u = sc.nextLine();

        System.out.println("Type Password");
        p = sc.nextLine();

        for (int i = 0; i < userNames.length; i++) {

            //Ejemplo if con ternario

            isAutenticated = (userNames[i].equals(u) && passwords[i].equals(p)) ? true : isAutenticated;

            /*if (userNames[i].equals(u) && passwords[i].equals(p)){
                isAutenticated = true;
                break;
            }*/
        }

        if(isAutenticated){
            System.out.println("Welcome: ".concat(u).concat("!"));
        }else {
            System.out.println("Incorrect User or password");
            System.out.println("Need to make sure about your credentials !!");
        }

    }
}
