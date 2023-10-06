public class Ejercicio2 {
    public static void main(String[] args) {
        // FIBONACCI
        int a = 0; // serie
        int b = 1;// serie

        int c = 0;// Resultado

        int nn = 17; // finalizar

        for (int i = 0; i < nn; i++) {
            c = a + b;

            a = b;
            b = c;

            System.out.println(c);
        }
    }
}
