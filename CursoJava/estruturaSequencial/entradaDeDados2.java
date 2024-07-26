package CursoJava.estruturaSequencial;
import java.util.Scanner;

public class entradaDeDados2 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int x;
        String s1, s2, s3;

        x = sc.nextInt();
        sc.nextLine(); // nextline extra para pegar a quebra de linha do x acima.
        s1 = sc.nextLine(); //ira ler ate a quebra de linha.
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();


    }

}
