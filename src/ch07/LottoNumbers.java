/*    */ package ch07;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class LottoNumbers {
/*    */   public static void main(String[] args) {
/*  7 */     Scanner input = new Scanner(System.in);
/*  8 */     boolean[] isCovered = new boolean[99];
/*    */ 
/*    */     
/* 11 */     int number = input.nextInt();
/* 12 */     while (number != 0) {
/* 13 */       isCovered[number - 1] = true;
/* 14 */       number = input.nextInt();
/*    */     } 
/*    */ 
/*    */     
/* 18 */     boolean allCovered = true;
/* 19 */     for (int i = 0; i < 99; i++) {
/* 20 */       if (!isCovered[i]) {
/* 21 */         allCovered = false;
/*    */         
/*    */         break;
/*    */       } 
/*    */     } 
/* 26 */     if (allCovered) {
/* 27 */       System.out.println("The tickets cover all numbers");
/*    */     } else {
/* 29 */       System.out.println("The tickets don't cover all numbers");
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch07/LottoNumbers.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */