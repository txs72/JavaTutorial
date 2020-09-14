/*    */ package ch05;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class GreatestCommonDivisor
/*    */ {
/*    */   public static void main(String[] args) {
/*  8 */     Scanner input = new Scanner(System.in);
/*    */     
/* 10 */     System.out.print("Enter first integer: ");
/* 11 */     int n1 = input.nextInt();
/* 12 */     System.out.print("Enter second integer: ");
/* 13 */     int n2 = input.nextInt();
/*    */     
/* 15 */     int gcd = 1;
/* 16 */     int k = 2;
/* 17 */     while (k <= n1 && k <= n2) {
/* 18 */       if (n1 % k == 0 && n2 % k == 0) {
/* 19 */         gcd = k;
/*    */       }
/* 21 */       k++;
/*    */     } 
/* 23 */     System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch05/GreatestCommonDivisor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */