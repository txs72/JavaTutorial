/*    */ package ch02;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class Ch02Q06 {
/*    */   public static void main(String[] args) {
/*  7 */     Scanner scanner = new Scanner(System.in);
/*  8 */     System.out.print("Enter a number between 0 and 1000: ");
/*  9 */     int number = scanner.nextInt();
/* 10 */     if (number <= 0 || number >= 1000) {
/* 11 */       System.out.println("Number invalid.");
/* 12 */       System.exit(1);
/*    */     } 
/* 14 */     int sum = 0;
/* 15 */     while (number != 0) {
/* 16 */       sum += number % 10;
/* 17 */       number /= 10;
/*    */     } 
/* 19 */     System.out.println(sum);
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch02/Ch02Q06.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */