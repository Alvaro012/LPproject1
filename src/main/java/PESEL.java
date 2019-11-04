import java.util.Arrays;

public class PESEL {
    public PESEL(String input) {
        peselOperation(input);
    }

    //AQUI VAN LAS OPERACIONES DE PESEL
    public boolean peselOperation(String input) {
        String[] splited = input.split("");
        int[] newDigits = new int[input.length()];
        for(int i = 0;i<input.length();i++){
            newDigits[i] = Integer.parseInt(splited[i]);
        }
        
        return true;
    }
}
