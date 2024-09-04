
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner (System.in);

        String palabraSecreta = "robot";

        int intentosMax = 3;

        int intentos = 0;

        boolean palabraResuelta = false;

        char[] letrasResueltas = new char[palabraSecreta.length()];

        for (int idx = 0; idx < letrasResueltas.length; idx++) {
            char r = letrasResueltas[idx] = '_';
            System.out.print(r);
        }
    }
}
