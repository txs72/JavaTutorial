/*    */ package ch02;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class Ch02Q02 {
/*    */   public static void main(String[] args) {
/*  7 */     Scanner scanner = new Scanner(System.in);
/*  8 */     System.out.print("Enter the radius and length of a cylinder: ");
/*    */ 
/*    */     
/* 11 */     double radius = scanner.nextDouble();
/* 12 */     double length = scanner.nextDouble();
/*    */ 
/*    */ 
/*    */     
/* 16 */     double area = Math.PI * radius * radius;
/* 17 */     double volume = area * length;
/*    */     
/* 19 */     System.out.println("The area is: " + area);
/* 20 */     System.out.println("The volume is: " + volume);
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch02/Ch02Q02.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */