/*    */ package ch12;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class QuotientWithMethod {
/*    */   public static int quotient(int number1, int number2) {
/*  7 */     if (number2 == 0) {
/*  8 */       System.out.println("Divisor cannot be zero");
/*  9 */       System.exit(1);
/*    */     } 
/*    */     
/* 12 */     return number1 / number2;
/*    */   }
/*    */   
/*    */   public static void main(String[] args) {
/* 16 */     Scanner input = new Scanner(System.in);
/*    */ 
/*    */     
/* 19 */     System.out.print("Enter two integers: ");
/* 20 */     int number1 = input.nextInt();
/* 21 */     int number2 = input.nextInt();
/*    */     
/* 23 */     int result = quotient(number1, number2);
/* 24 */     System.out.println(number1 + " / " + number2 + " is " + result);
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch12/QuotientWithMethod.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */