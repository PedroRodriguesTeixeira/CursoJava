package CursoJava.estruturaRepetitiva;

import java.util.Scanner;
import java.util.Locale;

public class estruturaDoWhile {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner entrada = new Scanner(System.in);

        float fahrenheit, celsius;
        char resposta;

        System.out.println("\nPrograma de conversao de Celsius para Fahrenheit\n");
        do {
        System.out.print("Digite a temperatura em Celsius: ");
        celsius = entrada.nextFloat();

        fahrenheit = (9*celsius)/5+32;

        System.out.printf("O equivalente em Fahrenheit: %.1f", fahrenheit);
        System.out.print("\nDeseja repetir? (s/n): ");
        resposta = entrada.next().charAt(0);

        }while(resposta == 's');


        entrada.close();
    }


}
