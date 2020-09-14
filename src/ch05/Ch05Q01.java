/*    */ package ch05;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class Ch05Q01 {
/*    */   public static void main(String[] args) {
/*  7 */     Scanner scanner = new Scanner(System.in);
/*  8 */     int input = -1;
/*  9 */     int negCount = 0;
/* 10 */     int posCount = 0;
/* 11 */     float sum = 0.0F;
/* 12 */     float avg = 0.0F;
/* 13 */     System.out.print("Enter an integer, the input ends if it is 0: ");
/* 14 */     while (input != 0) {
/* 15 */       input = scanner.nextInt();
/* 16 */       if (input > 0) posCount++; 
/* 17 */       if (input < 0) negCount++; 
/* 18 */       sum += input;
/*    */     } 
/* 20 */     if (posCount + negCount != 0) {
/*    */       
/* 22 */       avg = sum / (posCount + negCount);
/* 23 */       System.out.println("The number of positives is " + posCount);
/* 24 */       System.out.println("The number of negatives is " + negCount);
/* 25 */       System.out.println("The total is " + sum);
/* 26 */       System.out.println("The average is " + avg);
/*    */     } else {
/*    */       
/* 29 */       System.out.println("No numbers entered except 0");
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch05/Ch05Q01.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */