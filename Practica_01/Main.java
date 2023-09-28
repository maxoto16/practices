package Practica_01;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        int opcion;
        int opcion2;

            System.out.println("Menu para calcular:");
            System.out.println("1. Area triangulo.");
            System.out.println("2. Calcular Perimetro de un circulo.");
            System.out.println("3. Se debe calcular la formula general.");
            System.out.println("4. Calcular hipotenusa triangulo rectangulo.");
            System.out.println("5. CALCULADORA SIMPLE");
            System.out.println("6. EVALUAR EXPRECIONES");
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

        /*
         * CALCULADORA
         * 1.SUMA
         * 2.RESTA
         * 3.MULTIPLICACION
         * 4.DIVISION
         * 5.POTENCIA
         * 6.RAIZCUADRADA
         */

System.out.println("CALCULADORA");
System.out.println("1.SUMA");
System.out.println("2.RESTA");
System.out.println("3. MULTIPLIACION");
System.out.println("4. DIVICION");
System.out.println("5. POTENCIA.");
System.out.println("6. RAIZ DE UN NUMERO.");
System.out.print("Ingrese una opcion...");
            opcion2 = scanner.nextInt();

System.out.println("AQUI EMPIEZA LA CALCULADORA");
System.out.println("INGRESE SU PRIMER NUMERO ");
double num1 = scanner.nextDouble();
System.out.println("INGRESE SU SEGUNDO NUMERO ");
double num2 = scanner.nextDouble();


if (opcion2 == 1) {
System.out.println ("Calculadora PAPU ES :  " + (num1 + num2 ) );
    }

if (opcion2 == 2) {
System.out.println ("Calculadora PAPU ES :" + (num1 - num2 ) );
    }

if (opcion2 == 3) {
System.out.println ("Calculadora PAPU ES: " + (num1 * num2 ) );
    }

if (opcion2 == 4) {
System.out.println ("Calculadora PAPU ES :" + (num1 / num2 ) );
    }

    if (opcion2 == 5){
System.out.println ("Calculadora PAPU ES :" + (Math.pow(num1, num2)) );
    }
        if (opcion2 == 6){
System.out.println ("Calculadora PAPU ES :" + ( Math.sqrt(num1) ) );
    }

}

///////////////////////////EVALUAR EXPRECIONES/////////////////////////////////////


if (opcion == 6) {  
/*  VALIDA EL CONTENIDO RELACIONADO PARA SABER QUE ES */

    Scanner papuScanner = new Scanner(System.in);
    System.out.println("Evaluar una expresion dada");
    String exp = "";


    System.out.println("Ingrese una expresion...");
    exp = papuScanner.next();
    System.out.println("Expresion dada:" + exp);
   
    if (exp.contains("+"))
        System.out.println("Es una suma");
    if (exp.contains("-"))
        System.out.println("Es una resta");
    if (exp.contains("*"))
        System.out.println("Es una multiplicacion");
    if (exp.contains("/"))
        System.out.println("Es una division");
    if (exp.contains("^"))
        System.out.println("Es una potencia");
    
}



     }  

      }  
     