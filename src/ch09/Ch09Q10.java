/*    */ package ch09;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class Ch09Q10
/*    */ {
/*    */   public static void main(String[] args) {
/*  8 */     Scanner scanner = new Scanner(System.in);
/*  9 */     System.out.print("Please input a, b, c: ");
/* 10 */     double a = scanner.nextDouble();
/* 11 */     double b = scanner.nextDouble();
/* 12 */     double c = scanner.nextDouble();
/*    */     
/* 14 */     QuadraticEquation qe = new QuadraticEquation(a, b, c);
/* 15 */     if (qe.getDiscriminant() > 0.0D) {
/* 16 */       System.out.println("Two roots: " + qe.getRoot1() + " " + qe.getRoot2());
/*    */     }
/* 18 */     else if (qe.getDiscriminant() < 0.0D) {
/* 19 */       System.out.println("No roots");
/*    */     } else {
/*    */       
/* 22 */       System.out.println("Two same roots: " + qe.getRoot1());
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch09/Ch09Q10.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */