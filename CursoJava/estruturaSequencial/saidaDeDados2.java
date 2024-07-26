package CursoJava.estruturaSequencial;
import java.util.Locale;

public class saidaDeDados2 {

    public static void main (String[] args){


        Locale.setDefault(Locale.US);

        double x = 10.35786;

        System.out.println(x);

        System.out.printf("%.2f%n", x); //o printf significa a impressão formatada
        System.out.printf("%.4f\n", x); // É possível utilizar tanto \n quanto %n
        System.out.println("RESULTADO = " + x + " METROS"); //Concatenação
        System.out.printf("RESULTADO = %.2f metros%n", x); //Concatenação no mesmo comando de escrita

    }
}
