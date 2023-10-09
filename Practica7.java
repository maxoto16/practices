import java.util.Scanner;

public class Practica7 {
    public static void main(String[] args) {
        //estrucutra while Calcular factorial













//#############################################################################################

Scanner sc = new Scanner(System.in);
String continuar = "si";
while (continuar.toLowerCase().equals("si"))
{
        System.out.println("Factorial  ");
        System.out.println("Ingrese un numero...........  ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int factorial = 1;
if (num < 0){}  
else
{
        while (num >= 1) {
            factorial *= num;
            num--;
        }
        System.out.println("FACTORIAL"+ factorial);
        System.out.println("El factorial del numero ingresado es: " + factorial);
        if (!continuar.equals("si")){
System.out.println("BYE ");
        }
        else {
                   while (num >= 1) {
            factorial *= num;
            num--; 
        }
}
    }
    }}}

