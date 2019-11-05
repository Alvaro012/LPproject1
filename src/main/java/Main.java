import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(final String... args) {
        System.out.println("Insert the PESEL number: ");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        PESEL pesel = new PESEL(input);
        while (input.equals("") || !pesel.peselOperation(input) ){
            System.out.println("PESEL number incorrect");
            input = in.nextLine();
        }
        if (pesel.peselOperation(input))
            System.out.println("PESEL number correct");
    }

}
