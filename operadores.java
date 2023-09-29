import java.util.Scanner;

public class operadores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("####################################################################################################################");
        System.out.println("MENU DE OPERACIONES ARITMETICAS Y LOGICAS.      DE ANGEL GILBERTO AVILA LOPEZ 1B DSM UTEZ MEX");
        System.out.println("1. 4 + 2 * 5");
        System.out.println("2. 23 * 2 / 5");
        System.out.println("3. 5*2+3^2/2+4");
        System.out.println("4. 8/2+5^2-3*1+8/2-3");
        System.out.println("5. 3 + 5 * (10 - (2 + 4))");
        System.out.println("6. 3.5 + 5.09 - 14.0 / 40");
        System.out.println("7. 2.1 * (1.5 + 3.0 * 4.1)");
        System.out.println("8. 15/2*(7+(68-15*33+(45^2/16)/3)/15)+19");
        System.out.println("9. 7 * 5^3 / 4 / 3");
        System.out.println("10. 7*8*(160 % Math.pow(3, 3))/5*13-28");
        System.out.println("11. (3 >= 3 || 5 != 5) && !(15.0 / 5 + 2 != 5)");
        System.out.println("12. (3 >= 4 && 5 < 3) || !(4 <= 4 || 5 > 4 || 6 >= 7)");
        System.out.println("13. !(8 >= 4 && 5 < 3) && !(4 <= 4 || 5 > 4 || 6 >= 7)");
        System.out.println("####################################################################################################################");
        System.out.println("Seleccione una operación o expresión lógica...");
        int opcion = scanner.nextInt();
        double resultado = 0;
        boolean resultadoLogico = false;
double num1 =0;
double num2 =0;

if (opcion <= 10){
        
            if (opcion == 1) {resultado = num1 + num2;} 
            if (opcion == 2) {resultado = num1 * num2 / 5;} 
            if (opcion == 3) {resultado = 5 * 2 + Math.pow(3, 2) / 2 + 4;} 
            if (opcion == 4) {resultado = 8 / 2 + Math.pow(5, 2) - 3 * 1 + 8 / 2 - 3;}  
            if (opcion == 5) {resultado = 3 + 5 * (10 - (2 + 4));} 
            if (opcion == 6) {resultado = 3.5 + 5.09 - 14.0 / 40;} 
            if (opcion == 7) {resultado = 2.1 * (1.5 + 3.0 * 4.1);} 
            if (opcion == 8) {resultado = 15.0 / 2 * (7 + (68 - 15 * 33 + (Math.pow(45, 2) / 16) / 3) / 15) + 19;} 
            if (opcion == 9) {resultado = 7 * Math.pow(num1, 3) / 4 / 3;} 
            if (opcion == 10) {resultado = 7 * 8 * (160 % Math.pow(3, 3)) / 5 * 13 - 28;}

            System.out.println("Resultado de la operación: " + resultado);

} 

            
if (opcion >10 ) {
    boolean condicion1, condicion2;

            if (opcion == 11) {
                condicion1 = 3 >= 3 || 5 != 5;
                condicion2 = 15.0 / 5 + 2 != 5;
                resultadoLogico = condicion1 && !condicion2;} 
            if (opcion == 12) {
                condicion1 = 3 >= 4 && 5 < 3;
                condicion2 = 4 <= 4 || 5 > 4 || 6 >= 7;
                resultadoLogico = condicion1 || !condicion2;} 

            if (opcion == 13) {
                condicion1 = !(8 >= 4 && 5 < 3);
                condicion2 = 4 <= 4 || 5 > 4 || 6 >= 7;
                resultadoLogico = condicion1 && !condicion2;}

            System.out.println("Resultado LOGICO PARA LOS PAPUS:" + resultadoLogico);
        }
    }

 }