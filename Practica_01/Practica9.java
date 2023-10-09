package Practica_01;
public class Practica9 {
    public static void main(String[] args) {
        //sucecion de fibonacci
        int a = 0;
        int b = 1;
        int c = 0;
        int n = 10;
        System.out.println("0");
        System.out.println("1");
        for (int i = 0; i < n; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}
