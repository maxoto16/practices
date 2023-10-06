import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        // FACTORIAL
        System.out.println("INGRESE SU FACTORIAL");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
            System.out.println(factorial);
        }
    }
}
