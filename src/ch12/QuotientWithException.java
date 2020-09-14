/*    */ package ch12;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class QuotientWithException {
/*    */   public static int quotient(int number1, int number2) throws ArithmeticException {
/*  7 */     if (number2 == 0) {
/*  8 */       throw new ArithmeticException("Divisor cannot be zero");
/*    */     }
/* 10 */     return number1 / number2;
/*    */   }
/*    */   
/*    */   public static void main(String[] args) {
/* 14 */     Scanner input = new Scanner(System.in);
/*    */ 
/*    */     
/* 17 */     System.out.print("Enter two integers: ");
/* 18 */     int number1 = input.nextInt();
/* 19 */     int number2 = input.nextInt();
/*    */     
/*    */     try {
/* 22 */       int result = quotient(number1, number2);
/* 23 */       System.out.println(number1 + " / " + number2 + " is " + result);
/*    */     
/*    */     }
/* 26 */     catch (ArithmeticException ex) {
/* 27 */       System.out.println("Exception: an integer cannot be divided by zero ");
/*    */     } 
/*    */ 
/*    */     
/* 31 */     System.out.println("Execution continues ...");
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch12/QuotientWithException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */