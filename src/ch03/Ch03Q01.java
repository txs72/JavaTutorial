/*    */ package ch03;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class Ch03Q01 {
/*    */   public static void main(String[] args) {
/*  7 */     Scanner scanner = new Scanner(System.in);
/*  8 */     System.out.print("Enter a, b, c: ");
/*    */     
/* 10 */     double a = scanner.nextDouble();
/* 11 */     double b = scanner.nextDouble();
/* 12 */     double c = scanner.nextDouble();
/*    */     
/* 14 */     double delta = b * b - 4.0D * a * c;
/* 15 */     double r1 = 0.0D, r2 = 0.0D;
/*    */     
/* 17 */     if (delta < 0.0D) {
/* 18 */       System.out.println("The equation has no real roots");
/*    */     }
/* 20 */     else if (delta > 0.0D) {
/* 21 */       r1 = (-b + Math.pow(delta, 0.5D)) / 2.0D * a;
/* 22 */       r2 = (-b - Math.pow(delta, 0.5D)) / 2.0D * a;
/* 23 */       System.out.println("The equation has two roots " + r1 + " and " + r2);
/*    */     }
/*    */     else {
/*    */       
/* 27 */       r1 = (-b + Math.pow(delta, 0.5D)) / 2.0D * a;
/* 28 */       System.out.println("The equation has one root " + r1);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch03/Ch03Q01.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */