/*    */ package ch02;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class FahrenheitToCelsius {
/*    */   public static void main(String[] args) {
/*  7 */     Scanner input = new Scanner(System.in);
/*    */     
/*  9 */     System.out.print("Enter a degree in Fahrenheit: ");
/* 10 */     double fahrenheit = input.nextDouble();
/*    */ 
/*    */     
/* 13 */     double celsius = 0.5555555555555556D * (fahrenheit - 32.0D);
/* 14 */     System.out.println("Fahrenheit " + fahrenheit + " is " + celsius + " in Celsius");
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch02/FahrenheitToCelsius.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */