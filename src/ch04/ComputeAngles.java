/*    */ package ch04;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class ComputeAngles {
/*    */   public static void main(String[] args) {
/*  7 */     Scanner input = new Scanner(System.in);
/*    */ 
/*    */     
/* 10 */     System.out.print("Enter three points: ");
/* 11 */     double x1 = input.nextDouble();
/* 12 */     double y1 = input.nextDouble();
/* 13 */     double x2 = input.nextDouble();
/* 14 */     double y2 = input.nextDouble();
/* 15 */     double x3 = input.nextDouble();
/* 16 */     double y3 = input.nextDouble();
/*    */ 
/*    */     
/* 19 */     double a = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
/*    */     
/* 21 */     double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
/*    */     
/* 23 */     double c = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
/*    */ 
/*    */ 
/*    */     
/* 27 */     double A = Math.toDegrees(Math.acos((a * a - b * b - c * c) / -2.0D * b * c));
/*    */     
/* 29 */     double B = Math.toDegrees(Math.acos((b * b - a * a - c * c) / -2.0D * a * c));
/*    */     
/* 31 */     double C = Math.toDegrees(Math.acos((c * c - b * b - a * a) / -2.0D * a * b));
/*    */ 
/*    */ 
/*    */     
/* 35 */     System.out.println("The three angles are " + (
/* 36 */         Math.round(A * 100.0D) / 100.0D) + " " + (
/* 37 */         Math.round(B * 100.0D) / 100.0D) + " " + (
/* 38 */         Math.round(C * 100.0D) / 100.0D));
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch04/ComputeAngles.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */