/*    */ package ch12;
/*    */ 
/*    */ import java.util.Random;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class Ch12Q03 {
/*    */   public static void main(String[] args) {
/*  8 */     int[] numbers = new int[100];
/*  9 */     Random r = new Random();
/* 10 */     for (int i = 0; i < numbers.length; i++) {
/* 11 */       numbers[i] = r.nextInt();
/*    */     }
/* 13 */     Scanner scanner = new Scanner(System.in);
/*    */     while (true) {
/* 15 */       System.out.print("Please input an index: ");
/* 16 */       int input = scanner.nextInt();
/*    */       try {
/* 18 */         System.out.println(numbers[input]);
/* 19 */       } catch (ArrayIndexOutOfBoundsException e) {
/* 20 */         System.out.println("Out of bounds.");
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch12/Ch12Q03.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */