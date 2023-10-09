package Practica_01;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        int opcion;

            System.out.println("Menu para calcular:");
            System.out.println("1. Area triangulo.");
            System.out.println("2. Calcular Perimetro de un circulo.");
            System.out.println("3. Se debe calcular la formula general.");
            System.out.println("4. Calcular hipotenusa triangulo rectangulo.");
            System.out.println("5. SALIR");
            System.out.print("Ingrese una opcion...");
            opcion = scanner.nextInt();
 
if (opcion == 1) {
    System.out.println("Ingrese la base del triangulo: ");
    double base = scanner.nextDouble();
    System.out.println("Ingrese la altura del triangulo: ");
    double altura = scanner.nextDouble();
     System.out.println ("Calculadora PAPU" +(base * altura / 2 ) );
    }
if (opcion == 2) {
    System.out.println("Ingrese el radio del circulo: ");
    double radio = scanner.nextDouble();
    System.out.println ("RESULTADO" +(2 * Math.PI * radio) );
    }
if (opcion == 3) {
    System.out.println("Ingrese el valor de a: ");
    double a = scanner.nextDouble();
    System.out.println("Ingrese el valor de b: ");
    double b = scanner.nextDouble();
    System.out.println("Ingrese el valor de c: ");
    double c = scanner.nextDouble();
    System.out.println ("RESULTADO" +(-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a) );
    }
if (opcion == 4) {
    System.out.println("Ingrese el valor de a: ");
    double a = scanner.nextDouble();
    System.out.println("Ingrese el valor de b: ");
    double b = scanner.nextDouble();
    System.out.println ("RESULTADO" +Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)) );
    }
if (opcion == 5) {  
    System.out.println("SALIR");
    System.exit(0);
}

scanner.close();



}	    
}