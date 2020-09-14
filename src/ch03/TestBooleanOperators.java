/*    */ package ch03;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class TestBooleanOperators
/*    */ {
/*    */   public static void main(String[] args) {
/*  8 */     Scanner input = new Scanner(System.in);
/*    */ 
/*    */     
/* 11 */     System.out.print("Enter an integer: ");
/* 12 */     int number = input.nextInt();
/*    */     
/* 14 */     if (number % 2 == 0 && number % 3 == 0) {
/* 15 */       System.out.println(number + " is divisible by 2 and 3.");
/*    */     }
/* 17 */     if (number % 2 == 0 || number % 3 == 0) {
/* 18 */       System.out.println(number + " is divisible by 2 or 3.");
/*    */     }
/* 20 */     if ((((number % 2 == 0) ? 1 : 0) ^ ((number % 3 == 0) ? 1 : 0)) != 0)
/* 21 */       System.out.println(number + " divisible by 2 or 3, but not both."); 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch03/TestBooleanOperators.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */