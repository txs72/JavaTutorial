/*    */ package ch05;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class Ch05Q19 {
/*    */   public static void main(String[] args) {
/*  7 */     Scanner input = new Scanner(System.in);
/*  8 */     System.out.print("请输入行数：");
/*  9 */     long totalRows = input.nextLong();
/* 10 */     String maxValue = "" + (long)Math.pow(2.0D, (totalRows - 1L));
/* 11 */     int width = maxValue.length() + 1;
/* 12 */     String formatString = "%" + width;
/* 13 */     for (int row = 0; row < totalRows; row++) {
/* 14 */       for (int seperator = 0; seperator < totalRows - row - 1L; seperator++) {
/* 15 */         System.out.printf(formatString + "s", new Object[] { " " });
/*    */       } 
/* 17 */       for (int left = 0; left < row + 1; left++) {
/* 18 */         System.out.printf(formatString + "d", new Object[] { Long.valueOf((long)Math.pow(2.0D, left)) });
/*    */       } 
/* 20 */       for (int right = row; right > 0; right--) {
/* 21 */         System.out.printf(formatString + "d", new Object[] { Long.valueOf((long)Math.pow(2.0D, (right - 1))) });
/*    */       } 
/* 23 */       System.out.println("");
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Volumes/TXS.128G/hope useful/practice/2020.jar!/ch05/Ch05Q19.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */