package CursoJava.estruturaCondicional;
import java.util.Scanner;

public class estruturaIfElse {

        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);
            int horas;

            System.out.print("Quantas horas?");
            horas = entrada.nextInt();

            if (horas < 12) {
                System.out.print("Bom dia!\n");
            } else if (horas >= 12 && horas < 18) {
                System.out.print("Boa tarde!\n");
            } else {
                System.out.print("Boa noite!\n");
            }

            entrada.close();
        }
}


