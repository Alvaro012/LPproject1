import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(final String... args) {
        System.out.println("Insert the PESEL number: ");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        while (input.equals("")){
            System.out.println("PESEL number not found, please try again");
            input = in.nextLine();
        }
        PESEL pesel = new PESEL(input);
        if (pesel.peselOperation(input))
            System.out.println("PESEL number correct");
        else System.out.println("PESEL number incorrect");
    }

}
