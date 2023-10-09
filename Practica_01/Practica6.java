package Practica_01;
public class Practica6 {
    public static void main(String[] args) {
        
        //CALCULAR EL FACTORIAL DE UN NUMERO
        //MOSTRAR LA SERIE DE FIBONACCI
        //DIBUJAR EN CONSOLA UN TRIANGULO DEPENDIENDO DE UN NUMERO N



        //FACTORIAL
        int n = 5;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
            System.out.println(factorial);
        }


        //FIBONACCI
        int a = 0;
        int b = 1;
        int c = 0;
        int nn = 10;
        for (int i = 0; i < nn; i++) {
            c = a + b;
            a = b;
            b = c;

            System.out.println(c);
        }

        //TRIANGULO
        int nnn = 5;
        for (int i = 0; i < nnn; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
