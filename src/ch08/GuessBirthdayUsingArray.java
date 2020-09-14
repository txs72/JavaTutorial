/*    */ package ch08;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class GuessBirthdayUsingArray {
/*    */   public static void main(String[] args) {
/*  7 */     int day = 0;
/*    */ 
/*    */     
/* 10 */     int[][][] dates = { { { 1, 3, 5, 7 }, { 9, 11, 13, 15 }, { 17, 19, 21, 23 }, { 25, 27, 29, 31 } }, { { 2, 3, 6, 7 }, { 10, 11, 14, 15 }, { 18, 19, 22, 23 }, { 26, 27, 30, 31 } }, { { 4, 5, 6, 7 }, { 12, 13, 14, 15 }, { 20, 21, 22, 23 }, { 28, 29, 30, 31 } }, { { 8, 9, 10, 11 }, { 12, 13, 14, 15 }, { 24, 25, 26, 27 }, { 28, 29, 30, 31 } }, { { 16, 17, 18, 19 }, { 20, 21, 22, 23 }, { 24, 25, 26, 27 }, { 28, 29, 30, 31 } } };
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 33 */     Scanner input = new Scanner(System.in);
/*    */     
/* 35 */     for (int i = 0; i < 5; i++) {
/* 36 */       System.out.println("Is your birth day in Set" + (i + 1) + "?");
/* 37 */       for (int j = 0; j < 4; j++) {
/* 38 */         for (int k = 0; k < 4; k++) {
/* 39 */           System.out.printf("%4d", new Object[] { Integer.valueOf(dates[i][j][k]) });
/* 40 */         }  System.out.println();
/*    */       } 
/*    */       
/* 43 */       System.out.print("\nEnter 0 for No and 1 for Yes: ");
/* 44 */       int answer = input.nextInt();
/*    */       
/* 46 */       if (answer == 1) {
/* 47 */         day += dates[i][0][0];
/*    */       }
/*    */     } 
/* 50 */     System.out.println("Your birth day is " + day);
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch08/GuessBirthdayUsingArray.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */