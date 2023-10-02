package Practica_01;

import java.util.Scanner;

public class Practica4 extends Object {
    public Practica4(){
    }

public static void main(String[] args) {
    /*
     * si <condicion> entonces
     *   <instrucciones>
     * sino  <condicion> entonces
     *  <instrucciones>
     *  
     * if <condicion Solo arroja verdadero o falso>
     * <instrucciones> VERDADERA
     * else 
     * <instrucciones> FALSO 
     * 
     * 
     * 
     */

     /*
      * COMPARAR 3 NUMEROS DADOS POR EL USUARIO COMPARAR  CUAL ES EL MAYOR Y CUAL ES EL MENOR
      */

Scanner sc = new Scanner(System.in);
System.out.println( "ingresa tu primer numero"); int A = sc.nextInt();
System.out.println( "ingresa tu segundo numero"); int B = sc.nextInt();
System.out.println( "ingresa tu tercer numero"); int C = sc.nextInt();
// MAYOR
if (A > B && A > C) {System.out.println("EL MAYOR ES A");} 
 if (B > A && B > C) {System.out.println("EL MAYOR ES B");}
    else {System.out.println("EL MAYOR ES C");}
// MENOR
if (A < B && A < C) {System.out.println("EL MENOR ES A");}
  if (B < A && B < C) {System.out.println("EL MENOR ES B");}
    else {System.out.println("EL MENOR ES C");}
}
}
