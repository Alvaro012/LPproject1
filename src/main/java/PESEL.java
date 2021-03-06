import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class PESEL {


    public PESEL(String input) {
    }

    public PESEL() {

    }

    public boolean peselOperation(String input) {
        String[] splitted = Arrays.stream(input.split(""))
                .map(String::trim)
                .toArray(String[]::new);
        List<Integer> newDigits = new ArrayList<Integer>(input.length());
        newDigits.stream()
                .limit(11);
        if(input.length() < 11) {
            return false;
        }
        for(int i = 0;i<input.length();i++) {
            newDigits.add(i, Integer.parseInt(splitted[i]));
        }
        int check = (9* newDigits.get(0) + 7* newDigits.get(1) + 3* newDigits.get(2) + 1* newDigits.get(3) + 9* newDigits.get(4) + 7* newDigits.get(5) + 3* newDigits.get(6) + 1* newDigits.get(7) + 9* newDigits.get(8) + 7* newDigits.get(9));
        Stack<Integer> checkNumber = new Stack<Integer>();
        checkNumber.push(check);
        if((checkNumber.peek() % 10) != newDigits.get(10))
            return false;
        else
         return true;
    }
    public void writePesel() throws IOException {
        InputStream initialStream = new FileInputStream(new File("C:/Users/Alvaro/IdeaProjects/LPproject1/ReadFile.txt"));
        byte[] buffer = new byte[initialStream.available()];
        initialStream.read(buffer);
        File targetFile = new File("C:/Users/Alvaro/IdeaProjects/LPproject1/WriteFile.txt");
        OutputStream outStream = new FileOutputStream(targetFile);
        outStream.write(buffer);

    }
}

