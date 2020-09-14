/*    */ package ch06;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ 
/*    */ public class GreatestCommonDivisor
/*    */ {
/*    */   public static void main(String[] args) {
/*  9 */     Scanner input = new Scanner(System.in);
/*    */ 
/*    */     
/* 12 */     System.out.print("Enter first integer: ");
/* 13 */     int n1 = input.nextInt();
/* 14 */     System.out.print("Enter second integer: ");
/* 15 */     int n2 = input.nextInt();
/*    */     
/* 17 */     int gcd = 1;
/* 18 */     int k = 2;
/* 19 */     while (k <= n1 && k <= n2) {
/* 20 */       if (n1 % k == 0 && n2 % k == 0)
/* 21 */         gcd = k; 
/* 22 */       k++;
/*    */     } 
/*    */     
/* 25 */     System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch06/GreatestCommonDivisor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */