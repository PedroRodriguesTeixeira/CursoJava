package CursoJava.estruturaSequencial;
import java.util.Locale;

public class saidaDeDadosExercicio {

    public static void main(String[] args){


        String produto1 = "Computador";
        String produto2 = "Mesa de escritorio";

        int idade = 30;
        int code = 5290;
        char sexo = 'F';

        double preco1 = 2100.0;
        double preco2 = 650.50;
        double tamanho = 53.234567;

        System.out.println("Produtos:");
        System.out.printf("%s, na qual o preco e' R$ %.2f\n", produto1, preco1);
        System.out.printf("%s, na qual o preco e' R$ %.2f\n", produto2, preco2);

        System.out.print("\n");
        System.out.printf("Registro: %d anos, codigo %d e sexo: %s\n", idade, code, sexo);
        System.out.print("\n");

        System.out.printf("Tamanho com oito casas decimais: %.8f%n", tamanho);
        System.out.printf("Tamanho com 3 casas decimais: %.3f%n", tamanho);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point %.3f", tamanho);




    }


}


