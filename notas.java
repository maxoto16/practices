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