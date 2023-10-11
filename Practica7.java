import java.util.Scanner;

public class Practica7 {
    public static void main(String[] args) {
        //estrucutra while Calcular factorial



//factorial
int factorial = 1; 
String continuar ="";
//Fibonaci
int a =0, b = 1, i = 1;
//dibujar
int lines = 0;
//globals
String opc = "", end= "";
Scanner sc =new Scanner(System.in);

while (!end.toLowerCase().equals("no")){
        System.out.print("CALCULTOR V2.O");
        System.out.println("1. FACTORIAL");
        System.out.println("2. FIBONACCI");
        System.out.print("3. TRIANGULO");
        System.out.println("DIJITE UNA OPCION DEL MENU........");

        switch (opc){
                case "1":

                while (continuar.toLowerCase().equals("si"))
                {
                        System.out.println("Factorial  ");
                        System.out.println("Ingrese un numero...........  ");
                        Scanner scanner = new Scanner(System.in);
                        int num = scanner.nextInt();
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
                break;
                        }
                        else {
                                   while (num >= 1) {
                            factorial *= num;
                            num--; 
                        }
                }
                    }
                    }

        break;
                case "2":
                while (continuar.toLowerCase().equals("si")){
                        System.out.println("Cuantos terminos mostrara ....");                 
                        while ( i < sc.nextInt()){

                                System.out.println(a + "");  
                                int terminote = a + b;
                                a =b ;
                                b = terminote;
                                i++;
                        }
                        System.out.println("DECEA CONTINUAR CALCULANDO LA SERIE DE FIBONACCI");
                        continuar = sc.next().toLowerCase();
                }
                
        break;
                case "3":
                /*      Dibujar triangulo con ciclo while  */
                





        break;
                default:
        }

}

}}

