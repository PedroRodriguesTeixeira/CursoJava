package CursoJava.estruturaSequencial;

public class casting {

    public static void main (String[] args){

        int a, b;
        double resultado;

        a = 5;
        b = 2;

        int c, d;
        double resultado2;

        c = 5;
        d = 2;

        resultado = a / b; //perdera informacao

       resultado2 = (double) a / b; //sem perda de informacao

        System.out.println(resultado);
        System.out.println(resultado2);

    }

}
