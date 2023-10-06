import java.util.Scanner;
public class Practica5 {
    //estructura de seleccion multiple
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        char opc2;
        //  MENU DE OPCIONES MATEMATICAS CALUCULADORA
        System.out.println("MENU DE OPCIONES MATEMATICAS");
        System.out.println("A. AREA DE UN TRIANGULO");
        System.out.println("B.PERIMETRO DE UN CIRCULO");
        System.out.println("C. FORMULA GENERAL");
        System.out.println("D. CALCULAR HIPOTENUSA");
        System.out.println("E. CALCULADORA ");
        System.out.println("F. EVALUAR");
        System.out.println("INGERSA UNA OPCION:........");
        opc2 = sc.next().toLowerCase().charAt(0);    
        switch (opc) {
            case 'a':
                System.out.println("x es igual a 1");
                break;
            case 'b':
                System.out.println("x es igual a 2");
                break;
            case 'c':
                System.out.println("x es igual a 3");
                break;
            case 'd':
                System.out.println("x es igual a 4");
                break;
            case 'e':
                System.out.println("x es igual a 5");
                break;
            case 'f':
                System.out.println("x es igual a 6");
                break;
            case 'g': 
                System.out.println("x es igual a 7");
                break;


            default:
                System.out.println("x no es igual a 1, 2, 3, 4 o 5");
        }
    }
}
