/*    */ package ch03;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class SimpleIfDemo {
/*    */   public static void main(String[] args) {
/*  7 */     Scanner input = new Scanner(System.in);
/*  8 */     System.out.println("Enter an integer: ");
/*  9 */     int number = input.nextInt();
/*    */     
/* 11 */     if (number % 5 == 0) {
/* 12 */       System.out.println("HiFive");
/*    */     }
/* 14 */     if (number % 2 == 0)
/* 15 */       System.out.println("HiEven"); 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch03/SimpleIfDemo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */