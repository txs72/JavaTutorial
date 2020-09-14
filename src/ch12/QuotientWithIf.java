/*    */ package ch12;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class QuotientWithIf {
/*    */   public static void main(String[] args) {
/*  7 */     Scanner input = new Scanner(System.in);
/*    */ 
/*    */     
/* 10 */     System.out.print("Enter two integers: ");
/* 11 */     int number1 = input.nextInt();
/* 12 */     int number2 = input.nextInt();
/*    */     
/* 14 */     if (number2 != 0) {
/* 15 */       System.out.println(number1 + " / " + number2 + " is " + (number1 / number2));
/*    */     } else {
/*    */       
/* 18 */       System.out.println("Divisor cannot be zero ");
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch12/QuotientWithIf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */