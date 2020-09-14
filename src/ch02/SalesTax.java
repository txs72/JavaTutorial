/*    */ package ch02;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class SalesTax {
/*    */   public static void main(String[] args) {
/*  7 */     Scanner input = new Scanner(System.in);
/*    */     
/*  9 */     System.out.print("Enter purchase amount: ");
/* 10 */     double purchaseAmount = input.nextDouble();
/*    */     
/* 12 */     double tax = purchaseAmount * 0.06D;
/* 13 */     System.out.println("Sales tax is " + ((int)(tax * 100.0D) / 100.0D));
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch02/SalesTax.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */